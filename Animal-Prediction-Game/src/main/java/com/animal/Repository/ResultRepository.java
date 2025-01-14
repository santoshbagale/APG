package com.animal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animal.Entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

}
