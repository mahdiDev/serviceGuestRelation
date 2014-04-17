package tn.edu.esprit.eskimoocClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
	public void itShouldAssignProjectToEmployee() {
		Project project = new Project();
		project.setId(1);
		project.setDescription("eskimooc");

		Assert.assertTrue(projectServicesRemote.assignProjectToEmployee(
				project, 1));
	}

}
