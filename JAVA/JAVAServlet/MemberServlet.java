package com.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		String PW = request.getParameter("PW");
		String PW_check = request.getParameter("PW_check");
		String NAME = request.getParameter("NAME");
		String NICKNAME =request.getParameter("NICKNAME");
		String SEX =request.getParameter("SEX");
		String MAILID =request.getParameter("MAIL_ID");
		String HOST =request.getParameter("MAIL_HOST");
		String HOMEPAGE =request.getParameter("HOMEPAGE");
		String ADDRESS =request.getParameter("ADDRESS");
		String[] HOBBY =request.getParameterValues("HOBBY");
		
		int h = Integer.parseInt(HOST);
		String mailHost = null;
		switch(h) {
		case 1: mailHost = "naver.com";break;
		case 2: mailHost = "gmail.com";break;
		case 3: mailHost = "daum.net";break;
		}
		
		//3.ó��(DB����ó��)
		//4. ��� ó�� ������
		//5. JSPȣ��
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><title> ȸ������ �Է� ��� </title></head>");
		out.println("<body>");
		out.println("<h1> ȸ������ ��� Ȯ��. </h1>");
		out.println("<table><tr><td>���̵�: </td><td>"+ID+"</td></tr>");
		out.println("<tr><td>�н�����: </td><td>"+PW+"</td></tr>");
		out.println("<tr><td>�̸�: </td><td>"+NAME+"</td></tr>");
		out.println("<tr><td>�г���: </td><td>"+NICKNAME+"</td></tr>");
		out.println("<tr><td>����: </td><td>"+SEX+"</td></tr>");
		out.println("<tr><td>�̸���: </td><td>"+MAILID+"@"+mailHost+"</td></tr>");
		out.println("<tr><td>Ȩ������: </td><td>"+HOMEPAGE+"</td></tr>");
		out.println("<tr><td>�ּ�: </td><td>"+ADDRESS+"</td></tr>");
		out.println("<tr><td>���: </td><td>");
			for(String ho:HOBBY) {
				out.println(ho+"<br>");
			}
			
		out.println("</td></tr></table>");
		out.println("</body></html>");
//		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
