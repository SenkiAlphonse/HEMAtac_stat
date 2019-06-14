package com.hematac.fencingstats.repository.boutinforepository;

import com.hematac.fencingstats.models.boutinfos.RuleBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleBookRepository extends CrudRepository<RuleBook, Long> {
}
