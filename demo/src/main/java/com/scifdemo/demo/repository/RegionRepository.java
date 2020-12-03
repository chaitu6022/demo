package com.scifdemo.demo.repository;

import com.scifdemo.demo.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegionRepository extends JpaRepository<Region, Long>
{
    Optional<Region> findByName(String name);
}
