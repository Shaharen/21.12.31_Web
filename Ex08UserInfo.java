package com.smhrd.servlet1231;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfo")
public class Ex08UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		// 하나의 값만 접근 가능!!
		//String food = request.getParameter("food");
		
		// checkbox타입의 값을 접근할 때 아래 메소드 활용
		// or name속성값이 동일한 여러개의 입력값을 접근할 때 활용
		// => 체크박스가 아니여도 name값이 동일하다면
		// 문자열 배열로 반환
		String[] foods = request.getParameterValues("food");
		 
		
		System.out.println(Arrays.toString(foods));
	}

}
