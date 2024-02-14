package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dao;
import dto.dto;
@WebServlet("/login")
public class controller extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String roll=req.getParameter("rollnumber");
		String cls=req.getParameter("class");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		
		dto d1=new dto();
		d1.setName(name);
		int croll=Integer.parseInt(roll);
		d1.setRollnumber(croll);
		d1.setCls(cls);
		d1.setAddress(address);
		d1.setEmail(email);
		
		System.out.println("Data Stored Successfully");
		resp.getWriter().print("Data Stored Successfully");
//		
		
		dao dd=new dao();
		dd.loginpage(d1);
		
	}

}
