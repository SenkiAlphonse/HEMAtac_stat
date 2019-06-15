package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.FencerTeamAffiliation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FencerTeamAffiliationRepository extends CrudRepository<FencerTeamAffiliation, Long> {
}
