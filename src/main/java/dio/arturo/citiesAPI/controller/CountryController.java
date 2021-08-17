package dio.arturo.citiesAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.arturo.citiesAPI.entities.Country;
import dio.arturo.citiesAPI.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	CountryRepository countryRepository;

	@GetMapping
	public List<Country> countries(){

		return countryRepository.findAll();
	}
}
