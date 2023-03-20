/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.customerManagement.service;

import com.example.customerManagement.data.Customer;
import com.example.customerManagement.data.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chandika
 */
@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    //get all customer
    public List<Customer> getAllCustomer(){
        List<Customer> customer = customerRepository.findAll;
        return customer;
    }
    
    //get customer by id
    public Customer getCustomerById(int id){
       Optional<Customer>cus = customerRepository.findById(id);      
        return cus.get();
    }
    
    //create customer
    public Customer createCustomer(Customer cus){
        return customerRepository.save(cus);
    }
    
//    update customers   
    public Customer updateCustomer(Customer cus){
        return customerRepository.save(cus);
    }
    
//    delete customers by id
    public void deleteCustomersById(int id){
        customerRepository.deleteById(id);
    }
    
    // find user by name
    public List<Customer> findUserByName(String name){
        List<Customer> cus = customerRepository.findUserByName(name);
        return cus;
    }
    
    //find customers by age
    public List<Customer> findUserByAge (int age){
       List<Customer>cus=customerRepository.findUserByAge(age);
       return cus;
   }
    // find customer by name and age
    public List<Customer> findUserByNameAndAge (String name,int age){
       List<Customer>cus=customerRepository.findUserByNameAndAge(name, age);
       return cus;
   }

    public List<Customer> getAllStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
