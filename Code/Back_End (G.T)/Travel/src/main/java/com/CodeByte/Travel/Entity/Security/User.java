package com.CodeByte.Travel.Entity.Security;


import java.time.LocalDateTime;

import com.CodeByte.Travel.Entity.Base.Base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User extends Base{
	
	public void setCreationDetails() {
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
        this.setStatus(true); // O el valor que necesites
    }

    public void markAsDeleted() {
    	//this.setDeletedAt(LocalDateTime.now());
        this.setStatus(false);
    }

	@Column(name = "user_name", nullable = false, length = 50)
    private String userName;

    @Column(name = "contrasenia", nullable = false, length = 50)
    private String contrasenia;

    @Column(name = "profile_photo", columnDefinition = "TEXT")
    private String profilePhoto;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false, unique = true)
    private Person personId;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false, unique = true)
    private Role roleId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public Person getPersonId() {
		return personId;
	}

	public void setPersonId(Person personId) {
		this.personId = personId;
	}

	public Role getRoleId() {
		return roleId;
	}

	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}
    
    
}
