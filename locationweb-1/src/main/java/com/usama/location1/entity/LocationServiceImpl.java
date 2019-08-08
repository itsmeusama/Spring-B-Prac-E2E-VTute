package com.usama.location1.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.usama.location1.repos.LocationRepository;
import com.usama.location1.service.LocationService;

public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository repository;

	@Override
	public Location saveLocation(Location location1) {
		return repository.save(location1);
	}

	@Override
	public Location updateLocation(Location location1) {
		return repository.save(location1);
	}

	@Override
	public void deleteLocation(Location location) {
		 repository.delete(location);

	}

	@Override
	public Optional<Location> getLocationById(int id) {
		return repository.findById(id);
	}

	@Override
	public List<Location> getAllLocation() {
		return repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

}
