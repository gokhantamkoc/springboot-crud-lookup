package com.gokhantamkoc.springbootcrudlookup.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.dozermapper.core.Mapper;
import com.gokhantamkoc.springbootcrudlookup.dto.PointDto;
import com.gokhantamkoc.springbootcrudlookup.entity.Point;
import com.gokhantamkoc.springbootcrudlookup.exception.PointNotFoundException;
import com.gokhantamkoc.springbootcrudlookup.repository.PointRepository;

@Service
public class PointService {
	
	@Autowired
	private PointRepository pointRepository;
	
	@Autowired
	private Mapper dozerMapper;
	
	public List<PointDto> listShape() {
		List<PointDto> pointDtos = new ArrayList<PointDto>();
		Iterable<Point> points = pointRepository.findAll();
		points.forEach(point -> {
			PointDto pointDto = dozerMapper.map(point, PointDto.class);
			pointDtos.add(pointDto);
		});
		return pointDtos;
	}
	
	public PointDto getShape(Long id) {
		Optional<Point> foundPoint = pointRepository.findById(id);
		if (foundPoint.isPresent()) {
			return dozerMapper.map(foundPoint.get(), PointDto.class);
		}
		throw new PointNotFoundException(id);
	}
	
	public PointDto createShape(PointDto pointDto) {
		Point point = dozerMapper.map(pointDto, Point.class);
		pointRepository.save(point);
		return dozerMapper.map(point, PointDto.class);		
	}
	
	public PointDto updateShape(PointDto pointDto) {
		Optional<Point> foundPoint = pointRepository.findById(pointDto.getId());
		if (foundPoint.isPresent()) {
			foundPoint.get().setX(pointDto.getX());
			foundPoint.get().setY(pointDto.getY());
			pointRepository.save(foundPoint.get());
			return dozerMapper.map(foundPoint.get(), PointDto.class);
		}
		throw new PointNotFoundException(pointDto.getId());
	}
}
