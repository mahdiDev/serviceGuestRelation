package tn.edu.esprit.eskimooc.trainingJPA.inheritence;

import java.io.Serializable;
import javax.persistence.*;
import tn.edu.esprit.eskimooc.trainingJPA.inheritence.User;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User implements Serializable {

	private String privilege;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
   
}
