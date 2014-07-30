
package co.edu.uniandes.csw.city.logic.api;

import java.util.List; 

import co.edu.uniandes.csw.city.logic.dto.CityDTO;

public interface _ICityLogicService {

	public CityDTO createCity(CityDTO detail);
	public List<CityDTO> getCitys();
	public CityDTO getCity(Long id);
	public void deleteCity(Long id);
	public void updateCity(CityDTO detail);
	
}