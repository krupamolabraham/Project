package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.LoanRegistration;

public interface LoanRepository extends JpaRepository<LoanRegistration, Integer> {

}
