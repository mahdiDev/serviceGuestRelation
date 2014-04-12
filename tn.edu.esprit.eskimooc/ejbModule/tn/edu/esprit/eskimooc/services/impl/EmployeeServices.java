package tn.edu.esprit.eskimooc.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.eskimooc.domain.Employee;
import tn.edu.esprit.eskimooc.services.interfaces.EmployeeServicesLocal;
import tn.edu.esprit.eskimooc.services.interfaces.EmployeeServicesRemote;

/**
 * Session Bean implementation class EmployeeServices
 */
@Stateless
public class EmployeeServices implements EmployeeServicesRemote,
		EmployeeServicesLocal {

	@PersistenceContext(unitName = "tn.edu.esprit.eskimooc")
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public EmployeeServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addEmployee(Employee employee) {
		boolean b = false;
		try {
			entityManager.persist(employee);
			b = true;

		} catch (Exception e) {
			System.err.println("emmm ...");
		}
		return b;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		boolean b = false;
		try {
			entityManager.remove(entityManager.merge(employee));
			b = true;

		} catch (Exception e) {
			System.err.println("emmm ...");
		}
		return b;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		boolean b = false;
		try {
			entityManager.merge(employee);
			b = true;

		} catch (Exception e) {
			System.err.println("emmm ...");
		}
		return b;
	}

	@Override
	public Employee findEmployeeById(int id) {
		return entityManager.find(Employee.class, id);
	}

}
