package com.CodeByte.Travel.DTO;

import java.time.LocalDateTime;

public interface IUserDTO {

	long getid();
	Boolean getstatus();
	LocalDateTime getcreatedAt();
	LocalDateTime getupdatedAt();
	LocalDateTime getdeletedAt();
	String getuserName();
	String getprofilePhoto();
}
