package net.backmeup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.backmeup.entity.CampaignEntity;

public interface CampaignRepository extends JpaRepository<CampaignEntity, Long> {

}
