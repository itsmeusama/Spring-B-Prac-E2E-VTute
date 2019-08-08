package com.usama.location1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.usama.location1.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
