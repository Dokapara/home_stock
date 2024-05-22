package com.example.sample2.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample2.entity.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
	Apartment findByName(String name);

	Apartment findByAddress(String address);

	List<Apartment> findBySalesrep(String salesrep);

	List<Apartment> findByFloorarea(double floorarea);

	List<Apartment> findByRegisterdate(Timestamp registerdate);
}
