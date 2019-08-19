package com.actcamp;

import javax.servlet.*;

public class ServletContextListenerImpl implements ServletContextListener{
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ContextInitialized 호출");
	}
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ContextDestroyed 호출");
	}
}
