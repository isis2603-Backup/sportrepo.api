
package co.edu.uniandes.csw.role.logic.api;

import java.util.List; 

import co.edu.uniandes.csw.role.logic.dto.RoleDTO;

public interface _IRoleLogicService {

	public RoleDTO createRole(RoleDTO detail);
	public List<RoleDTO> getRoles();
	public RoleDTO getRole(Long id);
	public void deleteRole(Long id);
	public void updateRole(RoleDTO detail);
	
}