package edu.se.primesservice.repository;

public interface AuthenticationDBRepository extends CrudRepository<Customer, String>{

    Customer findByUsername(String username);

}
