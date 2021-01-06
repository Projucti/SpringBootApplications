package de.taslima.akter.pet.controller;

import de.taslima.akter.pet.exceptions.CustomerNotFoundException;
import de.taslima.akter.pet.model.Customer;
import de.taslima.akter.pet.model.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {
    private static CustomerRepository repository;

    CustomerController(CustomerRepository repository){
        this.repository= repository;
    }

    @RequestMapping( value = "/repository",method = RequestMethod.GET)
    List<Customer> getRepository(){
        return repository.findAll();
    }

    @PostMapping("/customer")
    public Customer saveNewCustomer(@RequestBody Customer newCustomer){
        return repository.save(newCustomer);
    }

    @GetMapping("/repository/{id}")
    Customer getSingleCustomer(@PathVariable Long id){
        return repository.findById(id).orElseThrow(()->new CustomerNotFoundException(id));
    }

    @DeleteMapping("/repository/delete/{id}")
    void deleteCustomer(@PathVariable Long id){
        repository.deleteById(id);
    }


}
