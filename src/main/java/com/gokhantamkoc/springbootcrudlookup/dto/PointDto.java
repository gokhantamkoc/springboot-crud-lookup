package com.gokhantamkoc.springbootcrudlookup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointDto extends ResponseData {
	
	private Long id;
	private Float x;
	private Float y;
}
