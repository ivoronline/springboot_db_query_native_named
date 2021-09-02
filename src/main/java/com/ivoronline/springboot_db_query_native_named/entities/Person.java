package com.ivoronline.springboot_db_query_native_named.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@NamedNativeQuery(
  name  = "Person.findByNameAgeIndexed",
  query = "SELECT * FROM Person WHERE name = ?1 AND age = ?2"
)
@NamedNativeQuery(
  name  = "Person.findByNameAgeNamed",
  query = "SELECT * FROM Person WHERE name = :name AND age = :age"
)
@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  //CONSTRUCTORS
  public Person() { }                               //Forced by @Entity
  public Person(String name, Integer age) {         //To simplify PersonLoader
    this.name = name;
    this.age  = age;
  }

}
