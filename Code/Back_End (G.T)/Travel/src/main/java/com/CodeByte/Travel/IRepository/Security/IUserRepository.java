package com.CodeByte.Travel.IRepository.Security;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.CodeByte.Travel.DTO.IUserDTO;
import com.CodeByte.Travel.Entity.Security.User;
import com.CodeByte.Travel.IRepository.ObectT.IObjectTRepository;

public interface IUserRepository extends IObjectTRepository<User>{
	
	Optional<User> findByUserName(String userName); // Método para buscar por nombre de usuario

	 @Query("SELECT u.id AS id, u.status AS status, u.createdAt AS createdAt, " +
	           "u.updatedAt AS updatedAt, u.deletedAt AS deletedAt, " +
	           "u.userName AS userName, u.profilePhoto AS profilePhoto " +
	           "FROM User u WHERE u.id = :id")
	    Optional<IUserDTO> usersDTO(@Param("id") Long id);
}
