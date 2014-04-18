package tn.edu.esprit.eskimooc.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.eskimooc.domain.Employee;
import tn.edu.esprit.eskimooc.domain.Project;

@Remote
public interface ProjectServicesRemote {

	boolean assignProjectToEmployees(Project project, List<Employee> employees);

	List<Employee> findAllEmployeesProject(int id);
	
	boolean deleteProjectById(int id);
}
