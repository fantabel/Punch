package com.fantabel.punch.services.implementation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.fantabel.punch.services.ManageTimer;

/**
 * Session Bean implementation class ManageTimer
 */
@Stateless
@WebService(endpointInterface = "com.fantabel.punch.services.ManageTimer")
public class ManageTimerBean implements ManageTimer {

	public void log(String s) {
		System.out.println(s);
	}

	@Override
	public String helloWorld() {
		String DATASOURCE_CONTEXT = "jdbc/AFECoreDS";

		Connection result = null;
		String s = null;
		try {
			Context initialContext = new InitialContext();
			if (initialContext == null) {
				log("JNDI problem. Cannot get InitialContext.");
			}
			DataSource datasource = (DataSource) initialContext.lookup(DATASOURCE_CONTEXT);
			if (datasource != null) {
				result = datasource.getConnection();
				Statement stmnt = result.createStatement();
				stmnt.execute("select to_char(sysdate, 'YYYY-MM-DD') from dual");
				ResultSet rslt = stmnt.getResultSet();
				rslt.next();
				s = rslt.getString(1);
			} else {
				log("Failed to lookup datasource.");
			}
		} catch (NamingException ex) {
			log("Cannot get connection: " + ex);
		} catch (SQLException ex) {
			log("Cannot get connection: " + ex);
		}

		return "helloWorld2 " + s + "|";
	}

}
