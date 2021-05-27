package Business.abstracts;

import Entities.concretes.Gamer;

public interface GamerService{

	void update(Gamer gamer);
	void signUp(Gamer gamer);
	void delete(Gamer gamer);
	void check(Gamer gamer);

}
