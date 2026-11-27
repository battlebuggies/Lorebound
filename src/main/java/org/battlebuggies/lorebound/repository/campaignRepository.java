package org.battlebuggies.lorebound.repository;

import org.battlebuggies.lorebound.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface campaignRepository extends JpaRepository<Campaign, Integer> {

}
