
package co.edu.uniandes.csw.address.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _AddressDTO {

	

	private Long id;
	

	private String street;
	

	private String aveneu;
	

	private Long cityId;



	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}
 
	public void setStreet(String street) {
		this.street = street;
	}


	public String getAveneu() {
		return aveneu;
	}
 
	public void setAveneu(String aveneu) {
		this.aveneu = aveneu;
	}


	public Long getCityId() {
		return cityId;
	}
 
	public void setCityId(Long cityid) {
		this.cityId = cityid;
	}
	
}