package com.hematac.fencingstats.repositories;


import com.hematac.fencingstats.models.userhandling.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
  User findByEmail(String email);
  User findById(long id);
  void deleteById(long id);
  List<User> findAllByNameContainsOrderByNameAsc(String name);
}
