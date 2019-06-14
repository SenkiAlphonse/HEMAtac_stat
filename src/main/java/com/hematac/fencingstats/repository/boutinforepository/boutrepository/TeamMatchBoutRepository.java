package com.hematac.fencingstats.repository.boutinforepository.boutrepository;

import com.hematac.fencingstats.models.boutinfos.TeamMatchBout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMatchBoutRepository extends CrudRepository<TeamMatchBout, Long> {
}
