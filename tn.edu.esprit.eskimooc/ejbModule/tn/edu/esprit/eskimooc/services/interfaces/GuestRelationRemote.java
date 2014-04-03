package tn.edu.esprit.eskimooc.services.interfaces;

import javax.ejb.Remote;

@Remote
public interface GuestRelationRemote {

	void sayHello(String name);
}
