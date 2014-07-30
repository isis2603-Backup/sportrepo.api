
package co.edu.uniandes.csw.sport.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _SportDTO {

	

	private Long id;
	

	private String name;
	

	private Integer minAge;
	

	private Integer maxAge;



	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}


	public Integer getMinAge() {
		return minAge;
	}
 
	public void setMinAge(Integer minage) {
		this.minAge = minage;
	}


	public Integer getMaxAge() {
		return maxAge;
	}
 
	public void setMaxAge(Integer maxage) {
		this.maxAge = maxage;
	}
	
}