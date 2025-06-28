package com.praveen.datademo.repository;


import com.praveen.datademo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


/*List<Product> findByProdName(String prodName);    /*Query DSL = Domain Specific Language
    It should start with findBy or getBy and after that the proper variable name the first letter of the variable
    should be capital  you can also use OrderBy and ASC(ascending) And DESC(descending) example is below
    List<Product> findByProdNameOrderByProdId(String prodName);
    List<Product> findByProdNameOrderByProdIdDesc(String prodName);
    List<Product> findByProdNameOrderByProdNameDesc(String prodName); */

    @Query("from Product where prodName = :name")      // ':name' is a placeholder for prodName
    List<Product> find(@Param("name") String prodName); //  @Param will replace the placeholder with prodName at run time


}


//@Repository is a Spring annotation used to indicate that a class is a
// Data Access Object (DAO) — in other words, a class that interacts with the database.
//🔧 Purpose:
//Marks the class as a Spring bean (like @Component).
//Indicates that the class is responsible for data operations like:
//Saving
//Retrieving
//Updating
//Deleting entities
//Spring automatically translates database-related exceptions (like SQLException) into
// Spring’s unified unchecked exceptions using Spring’s Exception Translation mechanism.