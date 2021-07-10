package com.gokhantamkoc.springbootcrudlookup.exception;

public class PointNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PointNotFoundException(Long id) {
		super(String.format("Nokta bulunamadı! (id = %s)", id));
	}
}
