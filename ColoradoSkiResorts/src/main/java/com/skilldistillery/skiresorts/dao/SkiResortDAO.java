package com.skilldistillery.skiresorts.dao;

import java.util.List;

import com.skilldistillery.skiresorts.entities.SkiResort;

public interface SkiResortDAO {
	SkiResort findById(int resortId);
	List<SkiResort> findAll();
	SkiResort create(SkiResort newResort);
	SkiResort update(int resortId, SkiResort resort);
	boolean deleteById(int resortId);

}
