
package co.edu.uniandes.csw.user.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _UserDTO {

	

	private Long id;
	

	private String userName;
	

	private String firstName;
	

	private String lastName;
	

	private String birthDate;
	

	private Boolean enable;
	

	private String docNumber;
	

	private Long documenttypeId;
	

	private Long roleId;



	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}
 
	public void setUserName(String username) {
		this.userName = username;
	}


	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}


	public String getLastName() {
		return lastName;
	}
 
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}


	public String getBirthDate() {
		return birthDate;
	}
 
	public void setBirthDate(String birthdate) {
		this.birthDate = birthdate;
	}


	public Boolean getEnable() {
		return enable;
	}
 
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}


	public String getDocNumber() {
		return docNumber;
	}
 
	public void setDocNumber(String docnumber) {
		this.docNumber = docnumber;
	}


	public Long getDocumenttypeId() {
		return documenttypeId;
	}
 
	public void setDocumenttypeId(Long documenttypeid) {
		this.documenttypeId = documenttypeid;
	}


	public Long getRoleId() {
		return roleId;
	}
 
	public void setRoleId(Long roleid) {
		this.roleId = roleid;
	}
	
}