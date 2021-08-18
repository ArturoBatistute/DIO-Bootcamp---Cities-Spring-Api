package dio.arturo.citiesAPI.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import services.DistanceService;

@RestController
@RequestMapping("/distances")
public class DistanceController {

	@Autowired
	private DistanceService service;

	Logger log = LoggerFactory.getLogger(DistanceController.class);

	@GetMapping("/by-points")
	public Double byPoints(@RequestParam(name = "from") final Long city1,
			@RequestParam(name = "to") final Long city2) {
		log.info("byPoints");
		return service.distanceByPointsInMiles(city1, city2);
	}
}
