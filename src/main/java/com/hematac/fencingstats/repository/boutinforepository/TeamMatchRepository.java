package com.hematac.fencingstats.repository.boutinforepository;

import com.hematac.fencingstats.models.boutinfos.TeamMatch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMatchRepository extends CrudRepository<TeamMatch, Long> {
}
