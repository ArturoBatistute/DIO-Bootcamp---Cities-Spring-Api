package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.arturo.citiesAPI.repositories.CityRepository;

@Service
public class DistanceService {

	@Autowired
	private CityRepository cityRepository;

	Logger log = LoggerFactory.getLogger(DistanceService.class);

	public Double distanceByPointsInMiles(final Long city1, final Long city2) {
		log.info("nativePostgresInMiles({}, {})", city1, city2);
		return cityRepository.distanceByPoints(city1, city2);
	}
}
