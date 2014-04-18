package tn.edu.esprit.eskimooc.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Project
 * 
 */
@Entity
public class Project implements Serializable {

	private int id;
	private String description;
	private static final long serialVersionUID = 1L;

	private List<Employee> employees;

	public Project() {
		super();
	}

	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(mappedBy = "project",cascade=CascadeType.PERSIST)
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void linkEmployeesToThisProject(List<Employee> employees){
		this.employees=employees;
		for (Employee e : employees) {
			e.setProject(this);
		}
	}

	
	
	
	
	
	
	
	
}
