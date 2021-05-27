package Business.abstracts;

import Entities.concretes.Campaign;
import Entities.concretes.Game;

public interface SaleService {
	void sale(Game game, Campaign campaign);
}
