package com.ivoronline.springboot_db_query_native_named.controllers;

import com.ivoronline.springboot_db_query_native_named.entities.Person;
import com.ivoronline.springboot_db_query_native_named.services.DBAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired DBAccess dbAccess;

  //================================================================
  // INSERT PERSON
  //================================================================
  @RequestMapping("InsertPerson")
  String insertPerson() {
    Integer insertedRecords = dbAccess.insertPerson();
    return  insertedRecords + " Records Inserted";

  }

  //================================================================
  // SELECT PERSON BY NAME AGE
  //================================================================
  @RequestMapping("SelectPersonByNameAge")
  Person selectPersonByNameAge() {
    Person person = dbAccess.selectPersonByNameAge();
    return person;
  }

  //================================================================
  // UPDATE PERSON
  //================================================================
  @RequestMapping("UpdatePerson")
  String updatePerson() {
    Integer updatedRecords = dbAccess.updatePerson();
    return  updatedRecords + " Records Updated";
  }

  //================================================================
  // DELETE PERSON
  //================================================================
  @RequestMapping("DeletePerson")
  String deletePerson() {
    Integer deletedRecords = dbAccess.deletePerson();
    return  deletedRecords + " Records Deleted";
  }

}


