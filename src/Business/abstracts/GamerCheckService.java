package Business.abstracts;

import Entities.concretes.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);

}
