package tn.edu.esprit.eskimoocClient;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tn.edu.esprit.eskimooc.domain.Employee;
import tn.edu.esprit.eskimooc.domain.Project;
import tn.edu.esprit.eskimooc.services.interfaces.ProjectServicesRemote;

public class TestProjectServices {
	private Context context;
	private ProjectServicesRemote projectServicesRemote;

	@Before
	public void init() {
		try {
			context = new InitialContext();
			String name = "ejb:/tn.edu.esprit.eskimooc/ProjectServices!"
					+ ProjectServicesRemote.class.getCanonicalName();
			projectServicesRemote = (ProjectServicesRemote) context
					.lookup(name);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void itShouldAssignProjectToEmployees() {
		Project project = new Project();
		project.setId(1);
		project.setDescription("eskimooc");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("omar");

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("mokhtar");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);

		Assert.assertTrue(projectServicesRemote.assignProjectToEmployees(
				project, employees));
	}

	@Test
	public void itShoulFindAllEmployeeesProject() {

		Assert.assertEquals(1, projectServicesRemote.findAllEmployeesProject(1)
				.size());
	}

	@Test
	public void itShoulRemoveProject() {

		Assert.assertEquals(1, projectServicesRemote.deleteProjectById(1));
	}

}
