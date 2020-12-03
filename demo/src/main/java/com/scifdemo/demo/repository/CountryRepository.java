package com.scifdemo.demo.repository;

import com.scifdemo.demo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>
{
}
