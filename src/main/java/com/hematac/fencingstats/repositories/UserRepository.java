package com.hematac.fencingstats.repositories;


import com.hematac.fencingstats.models.userhandling.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
  User findByEmail(String email);
}
