package dio.arturo.citiesAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.arturo.citiesAPI.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}