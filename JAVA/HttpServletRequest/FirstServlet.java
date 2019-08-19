package com.actcamp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String defaultName = null;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() {
    	defaultName = getInitParameter("name");
    	System.out.println("기본설정name"+defaultName);
    	ServletContext context = getServletContext();
    	String schoolName = context.getInitParameter("schoolName");
    	System.out.println("첫번째서블릿:default SchoolName"+schoolName);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		if((name == null) || (name.length()==0)) {
			name = defaultName;
		}
		Student student = new Student(111,name,20);
		ServletContext context = getServletContext();
		context.setAttribute("학생", student);
		
		String fileName = context.getInitParameter("SettingDataFile");
		InputStream is = null;
		BufferedReader br = null;
		try {
			is = context.getResourceAsStream(fileName);
			br = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println("IO Error");
		}
		
		//request에 값 담기
		request.setAttribute("name", name);
		request.getRequestDispatcher("firstJSP.jsp").forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
