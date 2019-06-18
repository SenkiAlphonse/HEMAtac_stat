package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.WeaponRepository;
import org.springframework.stereotype.Service;

@Service
public class WeaponServiceImpl implements WeaponService {

    private WeaponRepository weaponRepository;

    public WeaponServiceImpl(WeaponRepository weaponRepository){
        this.weaponRepository = weaponRepository;
    }
}
