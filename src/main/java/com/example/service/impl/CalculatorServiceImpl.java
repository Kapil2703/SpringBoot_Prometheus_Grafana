package com.example.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	
	//Respository can be bound here to fetch data
	
	@Override
	public String add(List<String> numList) {
		
		List<String>  numbers = numList;
		Double result = 0.0;
		for (String num : numbers) {
			
			Double numDub = new Double(num);
			result = Double.sum(result, numDub);
		}
		return Double.toString(result);
	}

	@Override
	public String multi(List<String> numList) {
		List<String>  numbers = numList;
		BigDecimal result = BigDecimal.valueOf(1.0);
				
		for (String num : numbers) {
			
			BigDecimal numDub = BigDecimal.valueOf(Double.valueOf(num));
			result = result.multiply(numDub);
		}
		   return result.toString();
	}

	@Override
	public String divide(String denonum, String numenum) {
	
	      BigDecimal deno, nume, result;

	      deno = new BigDecimal(denonum);
	      nume = new BigDecimal(numenum);

	      // divide bg1 with bg2 with 3 scale
	      result = deno.divide(nume, 3, RoundingMode.CEILING);
	      
		  return  result.toString();
	}

}
