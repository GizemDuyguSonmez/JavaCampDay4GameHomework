package Business.abstracts;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public interface CustomerService {
	
	void buy(Gamer gamer, Game game);
}
