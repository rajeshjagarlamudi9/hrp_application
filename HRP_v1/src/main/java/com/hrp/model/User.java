package com.hrp.model;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String email;
	
	@Column
    private Long role_id;
	
	/*@OneToMany
    @JoinColumn(name="user_profile_id")
    private UserProfile UserProfile;*/
	@Column
	private Long user_profile_id;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date created_date;
	
	@Column
	@Temporal(TemporalType.DATE)
    private Date updated_date;
	
	@Column
    private Integer deleted_yn;

	public User(){
		
	}
	
	public User(Long id, String email, Long role_id, Long user_profile_id, Date created_date, Date updated_date,
			Integer deleted_yn) {
		super();
		this.id = id;
		this.email = email;
		this.role_id = role_id;
		this.user_profile_id = user_profile_id;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.deleted_yn = deleted_yn;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public Long getUser_profile_id() {
		return user_profile_id;
	}

	public void setUser_profile_id(Long user_profile_id) {
		this.user_profile_id = user_profile_id;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public Integer getDeleted_yn() {
		return deleted_yn;
	}

	public void setDeleted_yn(Integer deleted_yn) {
		this.deleted_yn = deleted_yn;
	}
    
    
}
