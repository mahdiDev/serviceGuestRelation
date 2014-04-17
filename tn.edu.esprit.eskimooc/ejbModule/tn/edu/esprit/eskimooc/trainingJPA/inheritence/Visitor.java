package tn.edu.esprit.eskimooc.trainingJPA.inheritence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.edu.esprit.eskimooc.trainingJPA.inheritence.User;

/**
 * Entity implementation class for Entity: Visitor
 *
 */
@Entity

public class Visitor extends User implements Serializable {

	private String fidelity;
	private static final long serialVersionUID = 1L;

	public Visitor() {
		super();
	}   
	public String getFidelity() {
		return this.fidelity;
	}

	public void setFidelity(String fidelity) {
		this.fidelity = fidelity;
	}
   
}
