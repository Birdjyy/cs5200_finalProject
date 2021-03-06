package edu.northeastern.cs5200.Tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EnrollRole {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rolename;

    @ManyToOne
    @JsonIgnore
    private EmploymentRecord employmentRecord;

    @ManyToOne
    @JsonIgnore
    private Enroll enroll;
    
    
    
    public EnrollRole() {
    	
    }



	public String getRolename() {
		return rolename;
	}



	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	public Enroll getEnroll() {
        return enroll;
    }

    public void setEnroll(Enroll enroll) {
        this.enroll = enroll;
    }

    public EmploymentRecord getEmploymentRecord() {
        return employmentRecord;
    }

    public void setEmploymentRecord(EmploymentRecord employmentRecord) {
        this.employmentRecord = employmentRecord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
