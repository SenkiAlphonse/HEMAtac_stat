package com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository;

import com.hematac.fencingstats.models.boutinfos.OtherOutcome;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherOutcomeRepository extends CrudRepository<OtherOutcome, Long> {
}
