package com.hematac.fencingstats.repository.userhandlingrepository;

import com.hematac.fencingstats.models.userhandling.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
