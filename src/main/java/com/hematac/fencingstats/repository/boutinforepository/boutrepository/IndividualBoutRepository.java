package com.hematac.fencingstats.repository.boutinforepository.boutrepository;

import com.hematac.fencingstats.models.boutinfos.IndividualBout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualBoutRepository extends CrudRepository<IndividualBout, Long> {
}
