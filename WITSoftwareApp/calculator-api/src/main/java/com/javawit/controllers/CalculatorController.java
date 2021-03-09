package com.javawit.controllers;

import java.text.DecimalFormat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
	

	DecimalFormat df = new DecimalFormat("####0.0000");
	
	@RequestMapping(value="/calculator/add", method = RequestMethod.GET)
	@ResponseBody
	public double add(@RequestParam double a, @RequestParam double b){
		double sum = a + b;
		System.out.println(df.format(sum)); 
		return sum;
	}
	
	@RequestMapping(value="/calculator/subtract", method = RequestMethod.GET)
	@ResponseBody
	public double subtract(@RequestParam double a, @RequestParam double b){
		double sum = a - b;
		System.out.println(df.format(sum)); 
		return sum;
	}
	
	@RequestMapping(value="/calculator/multiply", method = RequestMethod.GET)
	@ResponseBody
	public double multiply(@RequestParam double a, @RequestParam double b){
		double sum = a * b;
		System.out.println(df.format(sum)); 
		return sum;
	}
	
	@RequestMapping(value="/calculator/divide", method = RequestMethod.GET)
	@ResponseBody
	public double divide(@RequestParam double a, @RequestParam double b){
		double sum = a / b;
		System.out.println(df.format(sum)); 
		return sum;
	}
	
}