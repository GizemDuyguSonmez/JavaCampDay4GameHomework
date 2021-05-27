package Business.abstracts;

import Entities.concretes.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	
	
}
