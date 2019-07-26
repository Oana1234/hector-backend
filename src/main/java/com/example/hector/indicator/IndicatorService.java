package com.example.hector.indicator;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IndicatorService {
	
	private final IndicatorRepository indicatorRepository;
	
	  public List<HealthIndicator> findAll() {
	        return indicatorRepository.findAll();
	    }

	    public Optional<HealthIndicator> findById(Long id) {
	        return indicatorRepository.findById(id);
	    }

	    public HealthIndicator save(HealthIndicator indicator) {
	        return indicatorRepository.save(indicator);
	    }

	    public void deleteById(Long id) {
	       indicatorRepository.deleteById(id);
	    }
}
