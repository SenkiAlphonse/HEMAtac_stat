package com.hematac.fencingstats.repositories;

import com.hematac.fencingstats.models.userhandling.Role;
import com.hematac.fencingstats.models.userhandling.RoleType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {
  Role findByType(RoleType roleType);
}
