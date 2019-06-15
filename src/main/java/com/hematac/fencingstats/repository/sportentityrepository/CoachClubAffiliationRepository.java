package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.CoachClubAffiliation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachClubAffiliationRepository extends CrudRepository<CoachClubAffiliation, Long> {
}
