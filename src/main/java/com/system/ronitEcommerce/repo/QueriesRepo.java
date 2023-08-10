package com.system.ronitEcommerce.repo;

import com.system.ronitEcommerce.entity.Queries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueriesRepo extends JpaRepository<Queries, Integer> {

}
