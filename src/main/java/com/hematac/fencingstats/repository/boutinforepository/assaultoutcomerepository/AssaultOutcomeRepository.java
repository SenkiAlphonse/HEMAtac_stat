package com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository;

import com.hematac.fencingstats.models.boutinfos.AssaultOutcome;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssaultOutcomeRepository extends CrudRepository<AssaultOutcome, Long> {
}
