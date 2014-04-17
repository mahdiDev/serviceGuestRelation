package tn.edu.esprit.eskimooc.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.eskimooc.domain.Project;

@Remote
public interface ProjectServicesRemote {

	boolean assignProjectToEmployee(Project project, int id);
}
