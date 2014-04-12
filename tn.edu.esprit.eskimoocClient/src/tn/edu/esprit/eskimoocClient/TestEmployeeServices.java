package tn.edu.esprit.eskimoocClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import tn.edu.esprit.eskimooc.domain.Employee;
import tn.edu.esprit.eskimooc.services.interfaces.EmployeeServicesRemote;

public class TestEmployeeServices {
	private Context context;
	private EmployeeServicesRemote employeeServicesRemote;

	@Before
	public void init() {
		try {
			context = new InitialContext();
			String name = "ejb:/tn.edu.esprit.eskimooc/EmployeeServices!"
					+ EmployeeServicesRemote.class.getCanonicalName();
			employeeServicesRemote = (EmployeeServicesRemote) context
					.lookup(name);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	@Ignore
	public void itShouldAddEmployee() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("omar");

		Assert.assertTrue(employeeServicesRemote.addEmployee(employee));

	}

	@Test
	@Ignore
	public void itShouldFindEmployeeById() {
		Assert.assertEquals("omar", employeeServicesRemote.findEmployeeById(1)
				.getName());

	}

	@Test
	@Ignore
	public void itShouldUpdateEmployee() {
		Employee employeeFound = employeeServicesRemote.findEmployeeById(1);
		employeeFound.setName("new  look");

		Assert.assertTrue(employeeServicesRemote.updateEmployee(employeeFound));

	}

	@Test
	public void itShouldDeleteEmployee() {
		Employee employeeFound = employeeServicesRemote.findEmployeeById(1);

		Assert.assertTrue(employeeServicesRemote.deleteEmployee(employeeFound));

	}

}
