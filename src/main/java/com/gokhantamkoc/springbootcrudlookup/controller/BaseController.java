package com.gokhantamkoc.springbootcrudlookup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gokhantamkoc.springbootcrudlookup.dto.ResponseData;

public class BaseController {
	
	public ResponseEntity<ResponseData> createSuccessResponse(ResponseData data) {
		ResponseEntity<ResponseData> re = new ResponseEntity<ResponseData>(data, HttpStatus.OK);
		return re;
	}
}
