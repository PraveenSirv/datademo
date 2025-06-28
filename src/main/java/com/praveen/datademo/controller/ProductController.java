package com.praveen.datademo.controller;


import com.praveen.datademo.model.Product;
import com.praveen.datademo.repository.ProductRepo;
import com.praveen.datademo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/product")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/id/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @GetMapping("/product/name/{prodName}")
    public List<Product> getProductByName(@PathVariable String prodName){
        return service.find(prodName);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/product/{prodId}")
    public  void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

}


//### 1. `@RestController`
//* **Purpose**: Marks the class as a Spring **REST controller**.
//* **Effect**:
//  * Combines `@Controller` and `@ResponseBody`.
//  * All methods return **JSON or XML** (usually JSON), not views (like JSP or HTML).
//* **Used on**: Class level.
//

//### 2. `@Autowired`
//* **Purpose**: Automatically **injects a dependency** (in this case, `ProductService`) from the Spring container.
//* **Effect**: You don't need to manually create an object of `ProductService`. Spring injects it for you.
//* **Used on**: Fields, constructors, or setters.
//

//### 3. `@RequestMapping("/product")`
//* **Purpose**: Maps **HTTP requests** to handler methods.
//* **Effect**: In this case, it maps requests to `/product` to the `getProducts()` method.
//* **Default method**: If you don’t specify an HTTP method (GET, POST, etc.), it accepts **all** methods (GET, POST, etc.). But here, it's used like a **GET** because of the method return.
//

//### 4. `@GetMapping(...)`
//* **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.GET)`
//* **Effect**: Maps a **GET HTTP request** to the method.
//* **Examples**:
//  * `@GetMapping("/product/id/{prodId}")`: Handles GET requests to fetch a product by ID.
//  * `@GetMapping("/product/name/{prodName}")`: Handles GET requests to fetch product(s) by name.
//

//### 5. `@PostMapping(...)`
//* **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.POST)`
//* **Effect**: Maps a **POST HTTP request** to the method.
//* **Used for**: Creating new resources (e.g., adding a product).
//

//### 6. `@PutMapping(...)`
//* **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.PUT)`
//* **Effect**: Maps a **PUT HTTP request** to the method.
//* **Used for**: Updating existing resources.
//

//### 7. `@DeleteMapping(...)`
//* **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.DELETE)`
//* **Effect**: Maps a **DELETE HTTP request** to the method.
//* **Used for**: Deleting a resource.
//

//### 8. `@PathVariable`
//* **Purpose**: Binds a **URI template variable** to a method parameter.
//* **Effect**:
//  * In `@GetMapping("/product/id/{prodId}")`, the `{prodId}` part is dynamically passed as the method parameter.
//  * Same applies for `{prodName}` and `{prodId}` in other methods.
//* **Used on**: Method parameters.
//

//### 9. `@RequestBody`
//* **Purpose**: Binds the **JSON body** of the HTTP request to a Java object.
//* **Effect**:
//  * Used in `@PostMapping` and `@PutMapping` to bind the incoming product data to a `Product` object.
//* **Used on**: Method parameters.
//

//
//| Annotation        | Purpose                                | Used On           |
//| ----------------- | -------------------------------------- | ----------------- |
//| `@RestController` | Declares a REST API controller         | Class             |
//| `@Autowired`      | Injects a Spring bean                  | Field/Constructor |
//| `@RequestMapping` | Maps URL to method (all HTTP methods)  | Method            |
//| `@GetMapping`     | Handles HTTP GET requests              | Method            |
//| `@PostMapping`    | Handles HTTP POST requests             | Method            |
//| `@PutMapping`     | Handles HTTP PUT requests              | Method            |
//| `@DeleteMapping`  | Handles HTTP DELETE requests           | Method            |
//| `@PathVariable`   | Binds URL part to method parameter     | Method parameter  |
//| `@RequestBody`    | Binds HTTP request body to Java object | Method parameter  |
//
