package com.praveen.datademo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
    @Id
    private int prodId;
    private  String prodName;
    private int prodPrice;

    public Product() {
    }

    public Product(int prodId, String prodName, int prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }
}


//### 1. `@Component`
//* **From**: `org.springframework.stereotype.Component`
//* **Purpose**: Marks this class as a **Spring-managed component** (bean).
//* **Effect**:
//  * Spring will automatically detect and instantiate it when doing component scanning.
//  * Not always needed on `@Entity` classes unless you explicitly want to use them as beans (e.g., inject them somewhere, which is rare for entity classes).
//

//### 2. `@Entity`
//* **From**: `jakarta.persistence.Entity` or `javax.persistence.Entity`
//* **Purpose**: Marks the class as a **JPA entity** that maps to a database table.
//* **Effect**:
//  * Tells Hibernate (or other JPA provider) to persist this object to a relational database.
//  * By default, the class name becomes the **table name**, and fields become **columns**.
//

//### 3. `@Id`
//* **From**: `jakarta.persistence.Id` or `javax.persistence.Id`
//* **Purpose**: Marks the field as the **primary key** of the entity.
//* **Effect**:
//  * Required for every entity.
//  * Used by JPA to uniquely identify each row in the table.
//

