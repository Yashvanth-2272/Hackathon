package com.hackathon.FarmToMarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.FarmToMarket.entity.Equipment;
@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer>{

}
