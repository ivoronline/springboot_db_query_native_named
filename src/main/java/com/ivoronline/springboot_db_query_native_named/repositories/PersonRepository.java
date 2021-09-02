package com.ivoronline.springboot_db_query_native_named.repositories;

import com.ivoronline.springboot_db_query_native_named.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }


