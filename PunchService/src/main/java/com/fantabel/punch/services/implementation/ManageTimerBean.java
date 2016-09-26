package com.fantabel.punch.services.implementation;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.fantabel.punch.entity.Event;
import com.fantabel.punch.services.ManageTimer;

/**
 * Session Bean implementation class ManageTimer
 */
@Stateless
@WebService(endpointInterface = "com.fantabel.punch.services.ManageTimer")
public class ManageTimerBean implements ManageTimer {

	@PersistenceContext(unitName = "pu")
	private EntityManager em;

	public void log(String s) {
		System.out.println(s);
	}

	@Override
	public String helloWorld() {
		/*
		 * String DATASOURCE_CONTEXT = "jdbc/PunchDS";
		 * 
		 * Connection result = null; String s = null; try { Context
		 * initialContext = new InitialContext(); if (initialContext == null) {
		 * log("JNDI problem. Cannot get InitialContext."); } DataSource
		 * datasource = (DataSource) initialContext.lookup(DATASOURCE_CONTEXT);
		 * if (datasource != null) { result = datasource.getConnection();
		 * Statement stmnt = result.createStatement(); stmnt.execute(
		 * "select 1 + 1 from dual"); ResultSet rslt = stmnt.getResultSet();
		 * rslt.next(); s = rslt.getString(1); } else { log(
		 * "Failed to lookup datasource."); } } catch (NamingException ex) {
		 * log("Cannot get connection: " + ex); } catch (SQLException ex) { log(
		 * "Cannot get connection: " + ex); }
		 */

		Event e = new Event();
		e.setDescription("Hallo");
		em.persist(e);

		return "helloWorld2 " + e.getId() + "|";
	}

}
