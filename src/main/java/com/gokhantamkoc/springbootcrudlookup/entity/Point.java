package com.gokhantamkoc.springbootcrudlookup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="point")
@Data
@NoArgsConstructor
public class Point {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "x", nullable = false)
	private Float x;
	
	@Column(name = "y", nullable = false)
	private Float y;

     @OneToMany(mappedBy = "point", fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
     private Status status;
}
