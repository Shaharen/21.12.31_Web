package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Image")
public class Ex05Image extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		int num = Integer.parseInt(request.getParameter("num"));

		String src = "";

		if (num == 1) {
			src = "img/cat.jpg";
		} else if (num == 2) {
			src = "img/�ʱ���.jpg";
		} else if (num == 3) {
			src = "img/���޶�Ͼ�.jpg";
		}

		out.print("<html><head><title>������ �̹���</title></head>");
		out.print("<body>");
		out.print("<img src='" + src + "' alt = '�ش� �̹����� �ҷ��� �� �����ϴ�' >");
		out.print("</body></html>");
		

	}

}