package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.FencerClubAffiliation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FencerClubAffiliationRepository extends CrudRepository<FencerClubAffiliation, Long> {
}
