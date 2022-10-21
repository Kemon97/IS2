package com.mipresupuesto.personalbudget.infrastructure.repository.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mipresupuesto.personalbudget.entities.YearEntity;

@Repository
public interface YearRepository extends JpaRepository<YearEntity, UUID>{

}
