package com.usama.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.usama.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
