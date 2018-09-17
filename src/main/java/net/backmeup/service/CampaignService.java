package net.backmeup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.backmeup.entity.CampaignEntity;
import net.backmeup.repository.CampaignRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CampaignService {
    private final CampaignRepository campaignRepository;

    public List<CampaignEntity> getAllCampaign() {
        return null;
    }
}
