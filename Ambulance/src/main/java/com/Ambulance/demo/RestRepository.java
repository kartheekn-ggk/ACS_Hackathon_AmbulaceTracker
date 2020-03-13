package com.Ambulance.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface RestRepository extends JpaRepository<Ambulance, Long>{
    List<Ambulance> findAll();

    @Override
    Optional<Ambulance> findById(Long id);

    @Override
    void deleteById(Long id);

    @Override
    Ambulance save(Ambulance ambul);

    @Override
    long count();
}
