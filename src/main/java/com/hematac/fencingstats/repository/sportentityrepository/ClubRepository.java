package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends CrudRepository<Club, Long> {
}
