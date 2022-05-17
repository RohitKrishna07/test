package com.training.olxadvertise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxadvertise.entities.Advertises;

@Repository
public interface AdvertiseRepository extends CrudRepository<Advertises, Integer> {
	

}
