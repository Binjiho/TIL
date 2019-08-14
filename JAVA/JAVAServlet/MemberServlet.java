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
		
		//3.처리(DB연동처리)
		//4. 결과 처리 데이터
		//5. JSP호출
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><title> 회원정보 입력 결과 </title></head>");
		out.println("<body>");
		out.println("<h1> 회원정보 결과 확인. </h1>");
		out.println("<table><tr><td>아이디: </td><td>"+ID+"</td></tr>");
		out.println("<tr><td>패스워드: </td><td>"+PW+"</td></tr>");
		out.println("<tr><td>이름: </td><td>"+NAME+"</td></tr>");
		out.println("<tr><td>닉네임: </td><td>"+NICKNAME+"</td></tr>");
		out.println("<tr><td>성별: </td><td>"+SEX+"</td></tr>");
		out.println("<tr><td>이메일: </td><td>"+MAILID+"@"+mailHost+"</td></tr>");
		out.println("<tr><td>홈페이지: </td><td>"+HOMEPAGE+"</td></tr>");
		out.println("<tr><td>주소: </td><td>"+ADDRESS+"</td></tr>");
		out.println("<tr><td>취미: </td><td>");
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
