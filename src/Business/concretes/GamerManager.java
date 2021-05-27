package Business.concretes;

import Business.abstracts.CustomerService;
import Business.abstracts.GamerCheckService;
import Business.abstracts.GamerService;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public class GamerManager implements GamerService,CustomerService  {

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		 this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" adli oyuncu bilgileri guncellendi.");
		}else {
			System.out.println("Gecersiz kisi bilgileri girildi.");
		}
		
		
	}

	@Override
	public void signUp(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" adli oyuncu kayit oldu.");
		}else {
			System.out.println("Gecersiz kisi bilgileri girildi.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" adli oyuncu silindi.");
		}else {
			System.out.println("Gecersiz kisi bilgileri girildi.");
		}
		
	}

	@Override
	public void check(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" adli oyuncu kontrol edildi.");
		}else {
			System.out.println("Gecersiz kisi bilgileri girildi.");
		}
	
	}

	@Override
	public void buy(Gamer gamer, Game game) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " adli oyuncu " + game.getGameName() + " adli oyunu satin aldi.");
		}else {
			System.out.println("Gecersiz kisi bilgileri girildi.");
		}
		
	}

}
