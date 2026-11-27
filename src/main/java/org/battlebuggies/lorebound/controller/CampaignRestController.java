package org.battlebuggies.lorebound.controller;

import org.battlebuggies.lorebound.model.Campaign;
import org.battlebuggies.lorebound.service.CampaignService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampaignRestController {
    private final CampaignService campaignService;

    public CampaignRestController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    public ResponseEntity<Campaign> postCampaign(@RequestBody Campaign campaign) {
        Campaign saveCampaign = campaignService.createCampaign(campaign);

        return new ResponseEntity<>(saveCampaign, HttpStatus.CREATED);
    }
}
