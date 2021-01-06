package de.taslima.akter.pet.model;

import de.taslima.akter.pet.exceptions.CustomerNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    List<Customer> customerList= new ArrayList<>();
    public CustomerRepository() {
        customerList.add(new Customer((long) 111,"Customer A", "address A", "15-01-20"));
    }

    public void save(Customer c){
        customerList.add(c);
    }

    public List<Customer> findAll(){
        return customerList;
    }
    public Customer findById(Long Id){
        for (Customer counter: customerList ){
            if(counter.getId().equals(Id)){
                return counter;
            }
            else{
                new CustomerNotFoundException(Id);

            }
        }
        return null;
    }
    public void deleteById(Long Id){
        for (Customer counter: customerList ){
            if(counter.getId().equals(Id)){
                customerList.remove(Id);
            }
        }

    }
}
