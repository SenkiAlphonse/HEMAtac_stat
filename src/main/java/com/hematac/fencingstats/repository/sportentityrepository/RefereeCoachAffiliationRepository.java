package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.RefereeCoachAffiliation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefereeCoachAffiliationRepository extends CrudRepository<RefereeCoachAffiliation, Long> {
}
