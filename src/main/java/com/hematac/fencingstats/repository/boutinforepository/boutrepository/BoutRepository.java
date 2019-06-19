package com.hematac.fencingstats.repository.boutinforepository.boutrepository;

import com.hematac.fencingstats.models.boutinfos.Bout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoutRepository extends CrudRepository<Bout, Long> {

    boolean existsById(long id);
    Bout findById(long id);
    List<Bout> findAll();
}
