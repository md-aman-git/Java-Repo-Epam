package com.epam.partsmgmt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.partsmgmt.entity.Part;

@Repository
public interface PartRepo extends JpaRepository<Part, Integer> {
	public Part findById(int id);
	public List<Part> findAll();
}
