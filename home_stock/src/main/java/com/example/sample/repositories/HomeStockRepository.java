package com.example.sample.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.data.HomeStock;

@Repository
public interface HomeStockRepository extends JpaRepository<HomeStock, Integer> {
	public List<HomeStock> findByName(String key);
}
