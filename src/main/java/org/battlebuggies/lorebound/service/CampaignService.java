package org.battlebuggies.lorebound.service;


import org.battlebuggies.lorebound.model.Campaign;
import org.battlebuggies.lorebound.repository.campaignRepository;
import org.springframework.stereotype.Service;


@Service
public class CampaignService {

    private final campaignRepository campaignRepository;

    public CampaignService(campaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    public Campaign createCampaign(Campaign campaign) {
        if (campaign.getTitle() == null || campaign.getTitle().isBlank()) {
            throw new IllegalArgumentException("Campaign must have a name");
        }
        if (campaign.getDescription() == null || campaign.getDescription().isBlank()) {
            throw new IllegalArgumentException("Campaign must have a description");
        }

        return campaignRepository.save(campaign);
    }
}