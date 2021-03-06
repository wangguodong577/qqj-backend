package com.qqj.org.repository;

import com.qqj.org.domain.TmpCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TmpCustomerRepository extends JpaRepository<TmpCustomer, Long>, JpaSpecificationExecutor<TmpCustomer> {
    List<TmpCustomer> findByUsername(String username);
}
