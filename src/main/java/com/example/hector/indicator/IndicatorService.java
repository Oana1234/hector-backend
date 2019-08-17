package com.example.hector.indicator;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IndicatorService {
	
	private final IndicatorRepository indicatorRepository;
	
	  public List<IndicatorType> findAll() {
	        return indicatorRepository.findAll();
	    }

	    public Optional<IndicatorType> findById(Long id) {
	        return indicatorRepository.findById(id);
	    }
	    

	    public IndicatorType save(IndicatorType indicator) {
	        return indicatorRepository.save(indicator);
	    }

	    public void deleteById(Long id) {
	       indicatorRepository.deleteById(id);
	      
	    }
}
