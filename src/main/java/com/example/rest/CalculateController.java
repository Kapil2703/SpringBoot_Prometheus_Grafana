package com.example.rest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.CalculatorResult;
import com.example.service.CalculatorService;

/**
 * This class a rest controller class to provide calculation functions as below
 * Addtion 
 * Multiplication 
 * Division 
 * 
 * URI :  http://<host>:<port>/calc/<mapping>
 * 
 * @author Kapill
 *
 */
@RestController
@RequestMapping("/calc")
public class CalculateController {
	
	   @Autowired
	   private CalculatorService calcService;
	 
	/**
	 * 
	 * @param numList
	 * @return
	 */
	@PostMapping("/sumnumbers")
	@ResponseBody
	public CalculatorResult add(@RequestParam List<String> numList) {
		
		CalculatorResult result = new CalculatorResult();
		
		result.setResult(calcService.add(numList));
		
		return result;
		
	}	

	
	/**
	 *  
	 * @param numList
	 * @return
	 */
	@PostMapping("/multiplynumbers")
	@ResponseBody
	public CalculatorResult multi(@RequestParam List<String> numList) {
		CalculatorResult result = new CalculatorResult();
		
		result.setResult(calcService.multi(numList));
		
		return result;
	}	
	
	/**
	 * 
	 * @param denonum
	 * @param numenum
	 * @return
	 */
	@PostMapping("/dividenumbers")
	@ResponseBody
	public CalculatorResult divide(@RequestParam String denonum, @RequestParam String numenum) {
		
		CalculatorResult result = new CalculatorResult();
		
		result.setResult(calcService.divide(denonum, numenum));
		
		return result;
	}	
	
	/**
	 * 
	 * @param denonum
	 * @param numenum
	 * @return
	 */
	@GetMapping("/")
	@ResponseBody
	public String welcome() {
		
		String Message = "Welcome to Calculator Service : " + 
							"use following API";
		
		  return "Welcome to Calculator Service";
		  
		  
	}	

}
