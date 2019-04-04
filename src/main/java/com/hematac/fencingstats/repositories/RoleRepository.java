package com.hematac.fencingstats.repositories;

import com.hematac.fencingstats.models.userhandling.Role;
import com.hematac.fencingstats.models.userhandling.RoleType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
  Role findByType(RoleType roleType);

  @Query(value = "SELECT * FROM ROLES where name IN (:roles)", nativeQuery = true)
  Set<Role> find(@Param("roles") List<String> roles);
}
