package co.edu.uniandes.csw.user.master.logic.dto;

import co.edu.uniandes.csw.address.logic.dto.AddressDTO;
import co.edu.uniandes.csw.sport.logic.dto.SportDTO;
import co.edu.uniandes.csw.user.logic.dto.UserDTO;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public abstract class _UserMasterDTO {

 
    protected UserDTO userEntity;
    protected Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public UserDTO getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserDTO userEntity) {
        this.userEntity = userEntity;
    }
    
    public List<AddressDTO> createAddress;
    public List<AddressDTO> updateAddress;
    public List<AddressDTO> deleteAddress;
    public List<AddressDTO> listAddress;	
    public List<SportDTO> createSport;
    public List<SportDTO> updateSport;
    public List<SportDTO> deleteSport;
    public List<SportDTO> listSport;	
	
	
	
    public List<AddressDTO> getCreateAddress(){ return createAddress; };
    public void setCreateAddress(List<AddressDTO> createAddress){ this.createAddress=createAddress; };
    public List<AddressDTO> getUpdateAddress(){ return updateAddress; };
    public void setUpdateAddress(List<AddressDTO> updateAddress){ this.updateAddress=updateAddress; };
    public List<AddressDTO> getDeleteAddress(){ return deleteAddress; };
    public void setDeleteAddress(List<AddressDTO> deleteAddress){ this.deleteAddress=deleteAddress; };
    public List<AddressDTO> getListAddress(){ return listAddress; };
    public void setListAddress(List<AddressDTO> listAddress){ this.listAddress=listAddress; };	
    public List<SportDTO> getCreateSport(){ return createSport; };
    public void setCreateSport(List<SportDTO> createSport){ this.createSport=createSport; };
    public List<SportDTO> getUpdateSport(){ return updateSport; };
    public void setUpdateSport(List<SportDTO> updateSport){ this.updateSport=updateSport; };
    public List<SportDTO> getDeleteSport(){ return deleteSport; };
    public void setDeleteSport(List<SportDTO> deleteSport){ this.deleteSport=deleteSport; };
    public List<SportDTO> getListSport(){ return listSport; };
    public void setListSport(List<SportDTO> listSport){ this.listSport=listSport; };	
	
	
}

