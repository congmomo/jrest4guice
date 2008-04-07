package org.jrest.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.jrest.core.guice.GuiceContext;
import org.jrest.core.persist.jpa.JpaGuiceModuleProvider;
import org.jrest.core.transaction.TransactionGuiceModuleProvider;
import org.jrest.dao.DaoGuiceModuleProvider;

public class JRest4GuiceSampContextListener implements ServletContextListener {
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		GuiceContext.getInstance().addModuleProvider(
				new TransactionGuiceModuleProvider()).addModuleProvider(
				new JpaGuiceModuleProvider()).addModuleProvider(
				new DaoGuiceModuleProvider(
						new String[] { "org.jrest.test.dao" }));
	}
}