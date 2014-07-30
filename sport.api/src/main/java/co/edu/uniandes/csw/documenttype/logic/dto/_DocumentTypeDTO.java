
package co.edu.uniandes.csw.documenttype.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _DocumentTypeDTO {

	

	private Long id;
	

	private String name;
	

	private Integer length;



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


	public Integer getLength() {
		return length;
	}
 
	public void setLength(Integer length) {
		this.length = length;
	}
	
}