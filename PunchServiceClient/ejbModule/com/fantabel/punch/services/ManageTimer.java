package com.fantabel.punch.services;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.jws.WebService;

@Remote
@WebService
public interface ManageTimer {
	public String helloWorld();
}
