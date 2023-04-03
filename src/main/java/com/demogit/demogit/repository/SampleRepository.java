package com.demogit.demogit.repository;

import com.demogit.demogit.domain.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
    Optional<Sample> findById(String id);

    Boolean existsByEmail(String email);
}
