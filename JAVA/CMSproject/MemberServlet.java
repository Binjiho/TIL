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
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String pw_check = request.getParameter("PW_check");
		String name = request.getParameter("NAME");
		String nickName =request.getParameter("NICKNAME");
		String sex =request.getParameter("SEX");
		String mailID =request.getParameter("MAIL_ID");
		String HOST =request.getParameter("MAIL_HOST");
		String homePage =request.getParameter("HOMEPAGE");
		String address =request.getParameter("ADDRESS");
		String[] hobby =request.getParameterValues("HOBBY");
		
		int h = Integer.parseInt(HOST);
		String mailHost = null;
		switch(h) {
		case 1: mailHost = "naver.com";break;
		case 2: mailHost = "gmail.com";break;
		case 3: mailHost = "daum.net";break;
		}
		
		//3.처리(DB연동처리)
		//4. 결과 처리 데이터
		Member m = new Member(id,pw,name,nickName,sex,mailID+"@"+mailHost,homePage,address,hobby);
		
		//5. JSP호출
		request.setAttribute("member", m);
		System.out.println("Member객체생성확인"+m.getAddress());
		request.getRequestDispatcher("MemberView.jsp").forward(request, response);
		
		/*
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><title> 회원정보 입력 결과 </title></head>");
		
//		out.close();
 * 
 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
