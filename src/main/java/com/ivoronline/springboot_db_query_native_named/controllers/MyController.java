package com.ivoronline.springboot_db_query_native_named.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@RestController
public class MyController {

  @PersistenceContext EntityManager entityManager;

  //================================================================
  // RETURN PERSON INDEXED
  //================================================================
  @RequestMapping("ReturnPersonIndexed")
  Object returnPersonIndexed() {

    //REFERENCE QUERY USING ENTITY MANAGER
    Query  query  = entityManager.createNamedQuery("Person.findByNameAgeIndexed");
           query.setParameter(1, "John");
           query.setParameter(2, 20);

    //GET PERSON
    Object object = query.getSingleResult();

    //RETURN PERSON
    return object;

  }

  //================================================================
  // RETURN PERSON NAMED
  //================================================================
  @RequestMapping("ReturnPersonNamed")
  Object returnPersonNamed() {

    //REFERENCE QUERY USING ENTITY MANAGER
    Query  query  = entityManager.createNamedQuery("Person.findByNameAgeNamed");
           query.setParameter("name", "John");
           query.setParameter("age" , 20);

    //GET PERSON
    Object object = query.getSingleResult();

    //RETURN PERSON
    return object;

  }

}


