package com.hematac.fencingstats.repository.actionrepository;

import com.hematac.fencingstats.models.actioninfos.FencingAction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FencingActionRepository extends CrudRepository<FencingAction, Long> {
}
