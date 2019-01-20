package com.htcadvjava.test.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name= "allocation")
public class Allocation implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date toDate;
	private Integer amountPerday;
	
	@EmbeddedId
	private AllocationIdentity allocationIdentity;
	
	@MapsId("employeeId")
	@ManyToOne(optional=false)
	@JoinColumn(name="emp_Id",referencedColumnName="emp_id")
	private Employee employee;
	
	@MapsId("projectId")
	@ManyToOne(optional=false)
	@JoinColumn(name="project_id",referencedColumnName="project_id")
	private Project project;

	@MapsId("roleId")
	@ManyToOne(optional=false)
	@JoinColumn(name="role_id",referencedColumnName="role_id")
	private Role role;

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Integer getAmountPerday() {
		return amountPerday;
	}

	public void setAmountPerday(Integer amountPerday) {
		this.amountPerday = amountPerday;
	}

	public AllocationIdentity getAllocationIdentity() {
		return allocationIdentity;
	}

	public void setAllocationIdentity(AllocationIdentity allocationIdentity) {
		this.allocationIdentity = allocationIdentity;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Allocation(Date toDate, Integer amountPerday, AllocationIdentity allocationIdentity, Employee employee,
			Project project, Role role) {
		super();
		this.toDate = toDate;
		this.amountPerday = amountPerday;
		this.allocationIdentity = allocationIdentity;
		this.employee = employee;
		this.project = project;
		this.role = role;
	}

	public Allocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Allocation [toDate=" + toDate + ", amountPerday=" + amountPerday + ", allocationIdentity="
				+ allocationIdentity + ", employee=" + employee + ", project=" + project + ", role=" + role + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allocationIdentity == null) ? 0 : allocationIdentity.hashCode());
		result = prime * result + ((amountPerday == null) ? 0 : amountPerday.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
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
		Allocation other = (Allocation) obj;
		if (allocationIdentity == null) {
			if (other.allocationIdentity != null)
				return false;
		} else if (!allocationIdentity.equals(other.allocationIdentity))
			return false;
		if (amountPerday == null) {
			if (other.amountPerday != null)
				return false;
		} else if (!amountPerday.equals(other.amountPerday))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}

}
