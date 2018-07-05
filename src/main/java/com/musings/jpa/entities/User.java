package com.musings.jpa.entities;


import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="USER")
@Access(value = AccessType.FIELD)
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="user_table_generator")
	@TableGenerator(name="user_table_generator", table="jpa_keys", pkColumnName="pk_column", valueColumnName="pk_value")
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="BIRTH_DATE")
	private Date birthDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="CREATION_CHANNEL")
	private String creationChannel;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="LAST_UPDATED_BY")
	private String lastUpdateBy;
	
	@Column(name="LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreationChannel() {
		return creationChannel;
	}

	public void setCreationChannel(String creationChannel) {
		this.creationChannel = creationChannel;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	

}
