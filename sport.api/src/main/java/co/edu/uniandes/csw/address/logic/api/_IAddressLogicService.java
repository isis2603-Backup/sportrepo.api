
package co.edu.uniandes.csw.address.logic.api;

import java.util.List; 

import co.edu.uniandes.csw.address.logic.dto.AddressDTO;

public interface _IAddressLogicService {

	public AddressDTO createAddress(AddressDTO detail);
	public List<AddressDTO> getAddresss();
	public AddressDTO getAddress(Long id);
	public void deleteAddress(Long id);
	public void updateAddress(AddressDTO detail);
	
}