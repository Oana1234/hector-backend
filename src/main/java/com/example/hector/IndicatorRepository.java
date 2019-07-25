package com.example.hector;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IndicatorRepository extends JpaRepository<HealthIndicator, Long> {

}
