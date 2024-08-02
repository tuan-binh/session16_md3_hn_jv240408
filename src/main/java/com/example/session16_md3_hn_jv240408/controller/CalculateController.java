package com.example.session16_md3_hn_jv240408.controller;

import com.example.session16_md3_hn_jv240408.dto.request.CalculateRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CalculateController
{
	
	@GetMapping("/calculate")
	public String viewCalculate()
	{
		return "calculate/calculate";
	}
	
	@PostMapping("/cal")
	public String handleCal(@ModelAttribute CalculateRequest calculateRequest,
	                        Model model
	)
	{
		Double USD = Double.parseDouble(calculateRequest.getVnd()) / Double.parseDouble(calculateRequest.getRate());
		model.addAttribute("VND", calculateRequest.getVnd());
		model.addAttribute("RATE", calculateRequest.getRate());
		model.addAttribute("USD", USD);
		Map<String, String> library = new HashMap<>();
		library.put("Hello", "Xin chào");
		library.put("Dog", "Con chó");
		library.containsKey("Hello");
		library.get("Hello");
		return "calculate/result";
	}
}
