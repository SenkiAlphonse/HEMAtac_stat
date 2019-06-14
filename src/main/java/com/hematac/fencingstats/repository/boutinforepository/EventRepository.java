package com.hematac.fencingstats.repository.boutinforepository;

import com.hematac.fencingstats.models.boutinfos.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}
