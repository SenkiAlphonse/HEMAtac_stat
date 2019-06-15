package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.FencerCoachAffiliation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FencerCoachAffiliationRepository extends CrudRepository<FencerCoachAffiliation, Long> {
}
