package gameDemo;


import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Business.concretes.CampaignManager;
import Business.concretes.GameManager;
import Business.concretes.GamerManager;
import Business.concretes.SaleManager;
import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game("Sudoku",1,"Doðrudan rakamlarla oynanan ve rakamlarýn birbiriyle "
				+ "bir bütünlük saðlamasýna yönelik analitik zeka gerektiren bir oyundur.",99.90);
		Gamer gamer = new Gamer("Gizem Duygu","Sönmez",LocalDate.of(2002,2,26),"************");
		Campaign campaign = new Campaign(5, "Bahar indirimleri", 50.5);
		
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.signUp(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		gamerManager.check(gamer);
		gamerManager.buy(gamer, game);
		
		System.out.println();
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		System.out.println();
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
	
	    System.out.println();
	    
	    SaleManager saleManager = new SaleManager();
	    saleManager.sale(game, campaign);
	    
	
	
	
	
	
	
	
	}

}
