package de.taslima.akter.pet.controller;

import de.taslima.akter.pet.model.Customer;
import de.taslima.akter.pet.model.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {
    private static CustomerRepository repository;
    CustomerController() {
        new CustomerRepository();
    }

    @GetMapping("/repository")
    List<Customer> getRepository(){
        return repository.findAll();
    }

    @PostMapping("/customer")
    public void saveNewCustomer(@RequestBody Customer newCustomer){
        repository.save(newCustomer);
    }

    @GetMapping("/repository/{id}")
    Customer getSingleCustomer(Long id){
        return repository.findById(id);
    }

    @DeleteMapping("/repository/delete/{id}")
    void deleteCustomer(@PathVariable Long id){
        repository.deleteById(id);
    }


}
