package tn.edu.esprit.eskimooc.trainingJPA.manyToManyWhithoutData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: J
 * 
 */
@Entity
public class J implements Serializable {

	private int idJ;
	private static final long serialVersionUID = 1L;

	private List<I> is;

	public J() {
		super();
	}

	@Id
	public int getIdJ() {
		return this.idJ;
	}

	public void setIdJ(int idJ) {
		this.idJ = idJ;
	}

	@ManyToMany(mappedBy="js")
	public List<I> getIs() {
		return is;
	}

	public void setIs(List<I> is) {
		this.is = is;
	}

}
