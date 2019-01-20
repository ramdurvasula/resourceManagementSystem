package com.htcadvjava.test.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class AllocationIdentity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 908631032121106687L;
	
	@Column(name="emp_id")
	private Integer employeeId;
	@Column(name="project_id")
	private Integer projectId;
	@Column(name="role_id")
	private Integer roleId;
	@Column(name="from_date")
	private Date fromDate;
	
	public AllocationIdentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AllocationIdentity(@NotNull Integer employeeId, @NotNull Integer projectId, @NotNull Integer roleId,
			@NotNull Date fromDate) {
		super();
		this.employeeId = employeeId;
		this.projectId = projectId;
		this.roleId = roleId;
		this.fromDate = fromDate;
	}
	@Override
	public String toString() {
		return "AllocationIdentity [employeeId=" + employeeId + ", projectId=" + projectId + ", roleId=" + roleId
				+ ", fromDate=" + fromDate + "]";
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllocationIdentity other = (AllocationIdentity) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		return true;
	}
 
}