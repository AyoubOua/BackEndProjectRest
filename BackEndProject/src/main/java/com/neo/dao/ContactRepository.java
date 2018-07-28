package com.neo.dao;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.neo.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	@Query("SELECT c FROM Contact c WHERE	c.nom LIKE :x ")
	public Page<Contact> chercher(@Param("x") String mc, Pageable pageRequest);

}
