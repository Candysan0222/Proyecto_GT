package com.CodeByte.Travel.Entity.Security;

import com.CodeByte.Travel.Entity.Base.Base;
import com.CodeByte.Travel.Entity.Parametrizacion.Bus;
import com.CodeByte.Travel.Entity.Parametrizacion.Company;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "driver")
public class Driver extends Base{
	
	@Column(name = "license_photo", nullable = false, length = 30)
	private String licensePhoto;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false, unique = true)
    private Person personId;

    @ManyToOne
    @JoinColumn(name = "bus_id", nullable = false, unique = true)
    private Bus busId;
    
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false, unique = true)
    private Company companyId;
}
