package com.skilldistillery.skiresorts.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skilldistillery.skiresorts.entities.SkiResort;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class SkiResortDaoImpl implements SkiResortDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public SkiResort findById(int resortId) {
		return em.find(SkiResort.class, resortId);
	}

	@Override
	public List<SkiResort> findAll() {
		String jpql = "SELECT resort FROM SkiResort resort";
		return em.createQuery(jpql, SkiResort.class).getResultList();
	}

	@Override
	public SkiResort create(SkiResort newResort) {
		em.persist(newResort);
		return newResort;
	}

	@Override
	public SkiResort update(int resortId, SkiResort resort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int resortId) {
		// TODO Auto-generated method stub
		return false;
	}

}
