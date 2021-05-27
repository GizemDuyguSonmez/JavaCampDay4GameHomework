package Business.concretes;

import Business.abstracts.GamerCheckService;
import Entities.concretes.Gamer;

public class GamerCheckManager  implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return false;
	}

}
