package Business.abstracts;

import Entities.concretes.Game;

public interface GameService {

	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void sale(Game game);
	
}
