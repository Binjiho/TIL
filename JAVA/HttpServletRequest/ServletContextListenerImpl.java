package com.actcamp;

import javax.servlet.*;

public class ServletContextListenerImpl implements ServletContextListener{
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ContextInitialized ȣ��");
	}
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ContextDestroyed ȣ��");
	}
}
