package com.gokhantamkoc.springbootcrudlookup.repository;

import org.springframework.data.repository.CrudRepository;

import com.gokhantamkoc.springbootcrudlookup.entity.Point;

public interface PointRepository extends CrudRepository<Point, Long> {

}
