package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.CoachTeamAffiliation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachTeamAffiliationRepository extends CrudRepository<CoachTeamAffiliation, Long> {
}
