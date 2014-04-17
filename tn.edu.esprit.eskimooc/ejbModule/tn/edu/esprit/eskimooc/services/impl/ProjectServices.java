package tn.edu.esprit.eskimooc.services.impl;

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
			project.setEmployee(employeeFound);
			entityManager.persist(project);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

}
