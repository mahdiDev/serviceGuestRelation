package tn.edu.esprit.eskimooc.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.eskimooc.domain.Employee;

@Remote
public interface EmployeeServicesRemote {
	boolean addEmployee(Employee employee);

	boolean deleteEmployee(Employee employee);

	boolean updateEmployee(Employee employee);

	Employee findEmployeeById(int id);

}
