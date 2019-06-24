package com.hematac.fencingstats.repository.sportentityrepository;

import com.hematac.fencingstats.models.sportentities.Fencer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FencerRepository extends PagingAndSortingRepository<Fencer, Long> {

    List<Fencer> findAll();
    Fencer findById(long id);

    List<Fencer> findAllByOrderByNameAsc(Pageable pageable);
    List<Fencer> findAllByNameContainingOrderByNationalityAsc(String nameFilter, Pageable pageable);
}
