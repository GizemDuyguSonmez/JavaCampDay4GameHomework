package Adapters;

import java.rmi.RemoteException;

import Business.abstracts.GamerCheckService;
import Entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		boolean personControl;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			personControl = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());
			
		} catch (NumberFormatException e) {
			personControl = false;
		} catch (RemoteException e) {
			personControl = false;
			
		}  
		return personControl;
	}
}
