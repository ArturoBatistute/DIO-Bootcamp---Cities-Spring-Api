package dio.arturo.citiesAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.arturo.citiesAPI.entities.State;
import dio.arturo.citiesAPI.repositories.StateRepository;

@RestController
@RequestMapping("/states")
public class StateController {

	@Autowired
	private StateRepository stateRepository;

	@GetMapping
	public Page<State> states(final Pageable page) {

		return stateRepository.findAll(page);
	}
}