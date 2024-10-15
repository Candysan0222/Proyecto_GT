package com.CodeByte.Travel.Service.Security;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.CodeByte.Travel.DTO.IUserDTO;
import com.CodeByte.Travel.Entity.Security.User;
import com.CodeByte.Travel.IService.Security.IUserService;
import com.CodeByte.Travel.Service.ObjectT.ObjectTService;

@Service
public class UserService extends ObjectTService<User> implements IUserService {

	@Override
	public Optional<IUserDTO> getUserDTO(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
