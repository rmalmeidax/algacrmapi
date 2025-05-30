package com.rmalmeidax.estudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmalmeidax.estudos.DTO.AutorDTO;
import com.rmalmeidax.estudos.DTO.AutorMinDTO;
import com.rmalmeidax.estudos.service.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {
	
	@Autowired
	private AutorService autorService;
	
	
	@GetMapping("/{id}")
			public AutorDTO findById(@PathVariable Long id) {
			AutorDTO result = autorService.findById(id);
			return result;
	}
	
	@GetMapping
			public List<AutorMinDTO> findAll() {
			List<AutorMinDTO> result = autorService.findAll();
			return result;
		
	}
	
}
