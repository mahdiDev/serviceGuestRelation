package tn.edu.esprit.eskimooc.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.eskimooc.domain.Employee;
import tn.edu.esprit.eskimooc.domain.Project;
import tn.edu.esprit.eskimooc.services.interfaces.ProjectServicesLocal;
import tn.edu.esprit.eskimooc.services.interfaces.ProjectServicesRemote;

/**
 * Session Bean implementation class ProjectServices
 */
@Stateless
public class ProjectServices implements ProjectServicesRemote,
		ProjectServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProjectServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignProjectToEmployee(Project project, int id) {
		boolean b = false;
		try {
			Employee employeeFound = entityManager.find(Employee.class, id);

			List<Employee> employees = project.getEmployees();
			employees.add(employeeFound);

			project.setEmployees(employees);

			entityManager.persist(project);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

	@Override
	public List<Employee> findAllEmployeesProject(int id) {
		Project projectFound=entityManager.find(Project.class, id);
		
		return projectFound.getEmployees();
	}

}
