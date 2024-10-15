package com.CodeByte.Travel.IRepository.Security;

import com.CodeByte.Travel.Entity.Security.Role;
import com.CodeByte.Travel.IRepository.ObectT.IObjectTRepository;

public interface IRolRepository extends IObjectTRepository<Role>{

	 Role findByName(String name);
	
}
