package com.gokhantamkoc.springbootcrudlookup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokhantamkoc.springbootcrudlookup.service.PointService;

@RestController
@RequestMapping("/point")
public class PointController extends BaseController {

	@Autowired
	PointService pointService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getPoint(@PathVariable(name = "id") Long id) {
		return createSuccessResponse(pointService.getShape(id));
	}
}
