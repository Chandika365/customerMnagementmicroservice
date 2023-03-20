/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.customerManagement.controller;

import com.example.customerManagement.data.Customer;
import com.example.customerManagement.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chandika
 */
@RestController
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @GetMapping(path = "/customers")
    public List<Customer> getAllCustomer(){
       return customerService.getAllCustomer();
    }
    @GetMapping(path = "/students/{id}")
     public Customer getCustomerById(@PathVariable int id){
         return customerService.getCustomerById(id);
    }
     @PostMapping(path = "/students")
     public Customer createStudent(@RequestBody Customer customer){
         return customerService.createCustomer(customer);
     }
     
     @PutMapping(path ="/students")
     public Customer updateStudent(@RequestBody Customer stu){
         return customerService.updateCustomer(stu);
     }
     
     @DeleteMapping(path = "/students/{id}")
     public void deleteStudentById(@PathVariable int id){
         customerService.deleteCustomersById(id);
     }
     
     @GetMapping(path = "/students", params = "name")
     public List<Customer> findUserByName(@RequestParam String name){
         return customerService.findUserByName(name);
     }
     
     @GetMapping(path = "/students", params = "age")
     public List<Customer> findUserByAge(@RequestParam int age){
         return customerService.findUserByAge(age);
     }
     
     @GetMapping(path = "/students", params = "name, age")
     public List<Customer> findUserByNameAndAge(@RequestParam String name, int age){
         return customerService.findUserByNameAndAge(name, age);
     }
}
