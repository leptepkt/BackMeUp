package net.backmeup.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CampaignResponse {
    private String titleUrl;
    private String name;
    private String detail;
}
