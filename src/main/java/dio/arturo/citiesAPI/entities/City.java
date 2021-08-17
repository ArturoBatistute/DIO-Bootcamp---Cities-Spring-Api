package dio.arturo.citiesAPI.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class City {

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	private Integer uf;

	private Integer ibge;

	@Column(name = "lat_lon")
	private String geolocation;

	public City() {
	}

	/**
	 *
	 * @param id
	 * @param name
	 * @param uf
	 * @param ibge
	 * @param geolocation
	 * @param location
	 */

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getUf() {
		return uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public String getGeolocation() {
		return geolocation;
	}
}
