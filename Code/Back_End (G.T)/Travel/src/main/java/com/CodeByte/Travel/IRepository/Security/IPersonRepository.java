package com.CodeByte.Travel.IRepository.Security;

import java.util.Optional;

import com.CodeByte.Travel.Entity.Security.Person;
import com.CodeByte.Travel.IRepository.ObectT.IObjectTRepository;

public interface IPersonRepository extends IObjectTRepository<Person>{

	 Optional<Person> findByEmail(String email);
}
