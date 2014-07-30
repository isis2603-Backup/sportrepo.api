 
package co.edu.uniandes.csw.user.master.logic.api;

import co.edu.uniandes.csw.user.master.logic.dto.UserMasterDTO;

public interface _IUserMasterLogicService {

	public UserMasterDTO createMasterUser(UserMasterDTO detail);
    public void updateMasterUser(UserMasterDTO detail);
	public void deleteMasterUser(Long id); 
	public UserMasterDTO getMasterUser(Long id);
        
}