package de.taslima.akter.pet.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(Long id){
        super(" No Employee found with "+ id);
    }
}
