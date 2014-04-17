package tn.edu.esprit.eskimooc.trainingJPA.oneToOneBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: A
 *
 */
@Entity

public class A implements Serializable {

	
	private int idA;
	private static final long serialVersionUID = 1L;
	
	private B b;

	public A() {
		super();
	}   
	@Id    
	public int getIdA() {
		return this.idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}
	@OneToOne
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
   
}
