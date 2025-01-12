package com.msbank.accounts.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msbank.accounts.entity.Customer;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<com.msbank.accounts.entity.Customer, Long> {

    Optional<Customer> findByMobileNumber(String mobileNumber);


}