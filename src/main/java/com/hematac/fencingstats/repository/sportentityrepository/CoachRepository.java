package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.Coach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends CrudRepository<Coach, Long> {
}
