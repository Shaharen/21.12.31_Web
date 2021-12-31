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
		// �ϳ��� ���� ���� ����!!
		//String food = request.getParameter("food");
		
		// checkboxŸ���� ���� ������ �� �Ʒ� �޼ҵ� Ȱ��
		// or name�Ӽ����� ������ �������� �Է°��� ������ �� Ȱ��
		// => üũ�ڽ��� �ƴϿ��� name���� �����ϴٸ�
		// ���ڿ� �迭�� ��ȯ
		String[] foods = request.getParameterValues("food");
		
		
		System.out.println(Arrays.toString(foods));
	}

}