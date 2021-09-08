package com.gokhantamkoc.springbootcrudlookup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherCheckController extends BaseController {

    @Autowired
    RestTemplate restTemplate;

    private static final String WEATHER_URL = "http://localhost:3000/cities/";

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<?> getCityWeather(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity entity = new HttpEntity(headers);
        return restTemplate.exchange(WEATHER_URL + id, HttpMethod.GET, entity, new ParameterizedTypeReference<Map<String, Object>>() {});
    }
}
