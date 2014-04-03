package tn.edu.esprit.eskimooc.services.impl;

import javax.ejb.Stateless;

import tn.edu.esprit.eskimooc.services.interfaces.GuestRelationLocal;
import tn.edu.esprit.eskimooc.services.interfaces.GuestRelationRemote;

/**
 * Session Bean implementation class GuestRelation
 */
@Stateless
public class GuestRelation implements GuestRelationRemote, GuestRelationLocal {

	/**
	 * Default constructor.
	 */
	public GuestRelation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello(String name) {
		System.out.println("ahla w sahla ya: " + name);

	}
}
