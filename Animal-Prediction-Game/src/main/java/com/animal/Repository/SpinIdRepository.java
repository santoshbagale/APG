package com.animal.Repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animal.Entity.SpinId;

@Repository
public interface SpinIdRepository extends JpaRepository<SpinId, Long> {
    SpinId findFirstByCreationTimeAfterOrderByCreationTimeDesc(LocalDateTime creationTime);
}

