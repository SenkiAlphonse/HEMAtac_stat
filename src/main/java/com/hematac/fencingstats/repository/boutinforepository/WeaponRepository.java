package com.hematac.fencingstats.repository.boutinforepository;

import com.hematac.fencingstats.models.sportentities.Weapon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends CrudRepository<Weapon, Long> {
}
