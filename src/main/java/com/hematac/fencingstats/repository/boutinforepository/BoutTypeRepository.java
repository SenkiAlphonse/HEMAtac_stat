package com.hematac.fencingstats.repository.boutinforepository;

import com.hematac.fencingstats.models.boutinfos.BoutType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoutTypeRepository extends CrudRepository<BoutType, Long> {
}
