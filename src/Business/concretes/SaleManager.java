package Business.concretes;

import Business.abstracts.SaleService;
import Entities.concretes.Campaign;
import Entities.concretes.Game;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " adli oyun " + campaign.getDiscount() + " TL indirim ile satildi.");
	}
	
	
}
