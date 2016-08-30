package com.fantabel.punch.services;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Session Bean implementation class ManageTimer
 */
@Stateless
@WebService(endpointInterface = "com.fantabel.punch.services.ManageTimer")
public class ManageTimerBean implements ManageTimer {

	@Override
	public String helloWorld() {
		return "helloWorld";
	}

}
