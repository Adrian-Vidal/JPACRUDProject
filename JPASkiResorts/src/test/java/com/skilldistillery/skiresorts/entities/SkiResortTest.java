package com.skilldistillery.skiresorts.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class SkiResortTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private SkiResort resort;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPASkiResorts");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		resort = em.find(SkiResort.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		resort = null;
	}

	@Test
	void test_SkiResort_entity_mappings() {
		assertNotNull(resort);
		assertEquals("Keystone", resort.getName());
	}

}
