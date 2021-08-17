package dio.arturo.citiesAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.arturo.citiesAPI.entities.City;
import dio.arturo.citiesAPI.repositories.CityRepository;

@RestController
@RequestMapping("cities")
public class CityController {

	@Autowired
	private CityRepository cityRepository;

	@GetMapping
	public Page<City> cities(final Pageable page) {

		return cityRepository.findAll(page);
	}
}
