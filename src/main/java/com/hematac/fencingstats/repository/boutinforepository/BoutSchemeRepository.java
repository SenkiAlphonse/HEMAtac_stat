package com.hematac.fencingstats.repository.boutinforepository;

import com.hematac.fencingstats.models.boutinfos.BoutScheme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoutSchemeRepository extends CrudRepository<BoutScheme, Long> {
}
