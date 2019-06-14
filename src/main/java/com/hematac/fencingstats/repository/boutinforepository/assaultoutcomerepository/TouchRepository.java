package com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository;

import com.hematac.fencingstats.models.boutinfos.Touch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouchRepository extends CrudRepository<Touch, Long> {
}
