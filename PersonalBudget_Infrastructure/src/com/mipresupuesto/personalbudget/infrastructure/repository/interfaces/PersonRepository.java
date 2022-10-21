package com.mipresupuesto.personalbudget.infrastructure.repository.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mipresupuesto.personalbudget.entities.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, UUID>{

}
