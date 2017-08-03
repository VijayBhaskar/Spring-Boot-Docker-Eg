package com.dockeg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dockeg.entity.Superhero;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {
}
