package dio.arturo.citiesAPI.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping
	public Page<Country> countries(Pageable page){

		return countryRepository.findAll(page);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Country>> country(@PathVariable Long id) {

		return ResponseEntity.ok().body(countryRepository.findById(id));
	}
}
