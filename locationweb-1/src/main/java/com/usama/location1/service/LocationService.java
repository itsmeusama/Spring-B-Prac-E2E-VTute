package com.usama.location1.service;

import java.util.List;
import java.util.Optional;

import com.usama.location1.entity.Location;



public interface LocationService {
	
	Location saveLocation(Location location1);
	
	Location updateLocation(Location location1);
	
	void deleteLocation(Location location);
	
	Optional<Location> getLocationById(int id);
	
	List<Location> getAllLocation();

}
