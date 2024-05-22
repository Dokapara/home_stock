package com.example.sample2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample2.entity.Apartment;
import com.example.sample2.service.ApartmentService;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {

	@Autowired
	private ApartmentService apartmentService;

	@GetMapping
	public List<Apartment> getAllApartments() {
		return apartmentService.getAllApartments();
	}

	@PostMapping
	public Apartment addApartment(@RequestBody Apartment apartment) {
		return apartmentService.addApartment(apartment);
	}

	@GetMapping("/name/{name}")
	public Apartment getApartmentByName(@PathVariable String name) {
		return apartmentService.getApartmentByName(name);
	}

	@GetMapping("/address/{address}")
	public Apartment getApartmentByAddress(@PathVariable String address) {
		return apartmentService.getApartmentByAddress(address);
	}

	@GetMapping("/salesrep/{salesrep}")
	public List<Apartment> getApartmentsBySalesRep(@PathVariable String salesrep) {
		return apartmentService.getApartmentsBySalesRep(salesrep);
	}

	@GetMapping("/floorarea/{floorarea}")
	public List<Apartment> getApartmentsByFloorArea(@PathVariable double floorarea) {
		return apartmentService.getApartmentsByFloorArea(floorarea);
	}
}



