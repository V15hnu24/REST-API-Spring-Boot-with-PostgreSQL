package com.springrest.springrest.repo;


import com.springrest.springrest.entitiy.load;

import lombok.Data;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity  
public interface LoadRepo extends JpaRepository<load, Long> {
    List<load> findByShipperId(String shipperId);
}
