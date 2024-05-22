package com.example.sample2.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample2.entity.Apartment;
import com.example.sample2.repository.ApartmentRepository;

@Service
public class ApartmentService {

	@Autowired
	private ApartmentRepository apartmentRepository;

	public List<Apartment> getAllApartments() {
		return apartmentRepository.findAll();
	}

	public Apartment addApartment(Apartment apartment) {
		return apartmentRepository.save(apartment);
	}

	public Apartment getApartmentById(Long id) {
		Optional<Apartment> optionalApartment = apartmentRepository.findById(id);
		return optionalApartment.orElse(null);
	}

	public Apartment getApartmentByName(String name) {
		return apartmentRepository.findByName(name);
	}

	public Apartment getApartmentByAddress(String address) {
		return apartmentRepository.findByAddress(address);
	}

	public List<Apartment> getApartmentsBySalesRep(String salesrep) {
		return apartmentRepository.findBySalesrep(salesrep);
	}

	public List<Apartment> getApartmentsByFloorArea(double floorarea) {
		return apartmentRepository.findByFloorarea(floorarea);
	}

	public List<Apartment> getApartmentsByRegisterDate(Timestamp registerdate) {
		return apartmentRepository.findByRegisterdate(registerdate);
	}

	public Apartment updateApartment(Long id, Apartment updatedApartment) {
		Optional<Apartment> optionalApartment = apartmentRepository.findById(id);
		if (optionalApartment.isPresent()) {
			Apartment apartment = optionalApartment.get();
			apartment.setName(updatedApartment.getName());
			apartment.setAddress(updatedApartment.getAddress());
			apartment.setSalesrep(updatedApartment.getSalesrep());
			apartment.setFloorarea(updatedApartment.getFloorarea());
			apartment.setRegisterdate(updatedApartment.getRegisterdate());
			return apartmentRepository.save(apartment);
		} else {
			return null;
		}
	}

	public void deleteApartment(Long id) {
		apartmentRepository.deleteById(id);
	}
}