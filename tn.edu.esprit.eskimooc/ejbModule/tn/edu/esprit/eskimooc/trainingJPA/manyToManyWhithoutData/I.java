package tn.edu.esprit.eskimooc.trainingJPA.manyToManyWhithoutData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: I
 *
 */
@Entity

public class I implements Serializable {

	
	private int idI;
	private static final long serialVersionUID = 1L;
	
	private List<J> js;

	public I() {
		super();
	}   
	@Id    
	public int getIdI() {
		return this.idI;
	}

	public void setIdI(int idI) {
		this.idI = idI;
	}
	@ManyToMany
	public List<J> getJs() {
		return js;
	}
	public void setJs(List<J> js) {
		this.js = js;
	}
   
}
