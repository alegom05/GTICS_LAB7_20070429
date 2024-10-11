package com.example.clase7gtics.repository;

import com.example.clase7gtics.entity.Funcion;
import com.example.clase7gtics.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Room, Integer> {

}

