package com.reservationsystem.api.flight;

import org.springframework.data.repository.CrudRepository;

public interface FlightDataHandler extends CrudRepository<Flight, String> {
	// all methods are added here by default by the class CrudRepository
}
