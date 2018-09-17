package net.backmeup.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import net.backmeup.entity.CampaignEntity;
import net.backmeup.model.response.CampaignResponse;

@Component
public class CampaignConverter implements Converter<CampaignEntity, CampaignResponse> {
    @Override
    public CampaignResponse convert(CampaignEntity item) {
        return CampaignResponse.builder().titleUrl(item.getTitleUrl()).build();
    }
}
