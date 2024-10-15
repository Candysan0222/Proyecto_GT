package com.CodeByte.Travel.IService.Security;

import java.util.Optional;

import com.CodeByte.Travel.DTO.IUserDTO;
import com.CodeByte.Travel.Entity.Security.User;
import com.CodeByte.Travel.IService.ObectT.IObjectTService;

public interface IUserService extends IObjectTService<User>{
	
	Optional<IUserDTO> getUserDTO(Long id);

}
