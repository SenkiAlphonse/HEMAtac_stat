package com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository;

import com.hematac.fencingstats.models.boutinfos.SteppingOffPiste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SteppingOffPisteRepository extends CrudRepository<SteppingOffPiste, Long> {
}
