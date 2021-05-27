package Business.concretes;

import Business.abstracts.GameService;
import Entities.concretes.Game;

public class GameManager implements GameService{
	
	@Override
	public void add(Game game) {
	 System.out.println(game.getGameName()+ " adli oyun eklendi." );
	}

	@Override
	public void update(Game game) {
		 System.out.println(game.getGameName()+ " adli oyun guncellendi." );
		
	}

	@Override
	public void delete(Game game) {
		 System.out.println(game.getGameName()+ " adli oyun silindi." );
		
	}

	@Override
	public void sale(Game game) {
		 System.out.println(game.getGameName()+ " adli oyun satildi." );
		
	}
	

}
