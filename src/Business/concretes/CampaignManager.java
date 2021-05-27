package Business.concretes;

import Business.abstracts.CampaignService;
import Entities.concretes.Campaign;

public class CampaignManager implements CampaignService{
	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi. Eklenen kampanyanin:  ");
		System.out.println("Kampanya numarasi: "+ campaign.getCampaignId() + 
				" Kampanya adi: " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya guncellendi. Eklenen kampanyanin:  ");
		System.out.println("Kampanya numarasi: "+ campaign.getCampaignId() + 
				" Kampanya adi: " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi. Eklenen kampanyanin:  ");
		System.out.println("Kampanya numarasi: "+ campaign.getCampaignId() + 
				" Kampanya adi: " + campaign.getCampaignName());
	}
	
}
