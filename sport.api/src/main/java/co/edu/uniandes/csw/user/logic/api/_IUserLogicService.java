
package co.edu.uniandes.csw.user.logic.api;

import java.util.List; 

import co.edu.uniandes.csw.user.logic.dto.UserDTO;

public interface _IUserLogicService {

	public UserDTO createUser(UserDTO detail);
	public List<UserDTO> getUsers();
	public UserDTO getUser(Long id);
	public void deleteUser(Long id);
	public void updateUser(UserDTO detail);
	
}