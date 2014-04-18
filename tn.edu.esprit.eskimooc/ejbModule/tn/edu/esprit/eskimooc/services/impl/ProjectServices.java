package tn.edu.esprit.eskimooc.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public boolean assignProjectToEmployees(Project project,
			List<Employee> employees) {
		boolean b = false;
		try {
			project.linkEmployeesToThisProject(employees);
			entityManager.persist(project);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

	@Override
	public List<Employee> findAllEmployeesProject(int id) {
		String jpql = "select e from Employee e where e.project.id=" + id;
		Query query = entityManager.createQuery(jpql);

		return query.getResultList();
	}

	@Override
	public boolean deleteProjectById(int id) {
		Project project = entityManager.find(Project.class, id);
		entityManager.remove(project);
		
		return true;
	}

}
