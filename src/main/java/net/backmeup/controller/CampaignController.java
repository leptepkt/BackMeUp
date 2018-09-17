package net.backmeup.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.backmeup.converter.CampaignConverter;
import net.backmeup.model.response.CampaignResponse;
import net.backmeup.service.CampaignService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CampaignController {
    private final CampaignService campaignService;
    private final CampaignConverter campaignConverter;

    @GetMapping("/campaigns")
    public ResponseEntity<List<CampaignResponse>> getAllCampaign() {
        List<CampaignResponse> response = campaignService.getAllCampaign().stream().map(
                campaignConverter::convert).collect(
                Collectors.toList());
        return ResponseEntity.ok(response);
    }
}
