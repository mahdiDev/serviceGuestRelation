package tn.edu.esprit.eskimoocClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.eskimooc.services.interfaces.GuestRelationRemote;

public class TestGuestRelation {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.eskimooc/GuestRelation!"
					+ GuestRelationRemote.class.getCanonicalName();
			GuestRelationRemote guestRelationRemote = (GuestRelationRemote) context
					.lookup(jndiName);
			guestRelationRemote.sayHello("mahdi");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
