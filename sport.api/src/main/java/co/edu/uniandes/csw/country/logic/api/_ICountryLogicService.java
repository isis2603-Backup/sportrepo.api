
package co.edu.uniandes.csw.country.logic.api;

import java.util.List; 

import co.edu.uniandes.csw.country.logic.dto.CountryDTO;

public interface _ICountryLogicService {

	public CountryDTO createCountry(CountryDTO detail);
	public List<CountryDTO> getCountrys();
	public CountryDTO getCountry(Long id);
	public void deleteCountry(Long id);
	public void updateCountry(CountryDTO detail);
	
}