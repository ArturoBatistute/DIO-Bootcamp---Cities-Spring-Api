package dio.arturo.citiesAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.arturo.citiesAPI.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
