package com.kenny.ch8_2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kenny.ch8_2.domain.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

	List<Person> findByAddress(String name);
	Person findByNameAndAddress(String name, String address);
	@Query("select p from Person p where p.name=:name and p.address=:address")
	Person withNameAndAddressQuery(@Param("name") String name, @Param("address") String address);
	List<Person> withNameAndAddressNamedQuery(String name, String address);
}
