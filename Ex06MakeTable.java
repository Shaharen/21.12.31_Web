package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeTable")
public class Ex06MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// �Է¹��� ���ڸ� ���� �� int ��ȯ
		String data = request.getParameter("room");
		int room = Integer.parseInt(data);

		out.print("<html><head><title>�� ���� ���</title></head>");
		out.print("<body>");
		out.print("<table border = '1'>");
		out.print("<tr>");
		for (int i = 0; i < room; i++) {
			out.print("<td>" + (i + 1) + "</td>");
		}
		out.print("</tr>");
		out.print("</table></body></html>");
	}

}
