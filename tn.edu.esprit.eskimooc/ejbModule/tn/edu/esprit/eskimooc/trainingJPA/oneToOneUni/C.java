package tn.edu.esprit.eskimooc.trainingJPA.oneToOneUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: C
 *
 */
@Entity

public class C implements Serializable {

	
	private int idC;
	private static final long serialVersionUID = 1L;

	private D d;

	public C() {
		super();
	}   
	@Id    
	public int getIdC() {
		return this.idC;
	}

	public void setIdC(int idC) {
		this.idC = idC;
	}
	@OneToOne
	public D getD() {
		return d;
	}
	public void setD(D d) {
		this.d = d;
	}
   
}
