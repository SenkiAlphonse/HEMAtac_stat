package com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository;

import com.hematac.fencingstats.models.boutinfos.YellowCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YellowCardRepository extends CrudRepository<YellowCard, Long> {
}
