package controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServ
 */
@WebServlet("/")
public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       List<Student> students = new ArrayList<Student>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServ() {
        super();
        Student s = new Student();
        s.setAge(20);
        s.setName("my name");
        students.add(s);
       //Add another student
        Student s1 = new Student();
        s1.setAge(22);
        s1.setName("Joe");
        students.add(s1);
        //Add another student
        Student s11 = new Student();
        s11.setAge(23);
        s11.setName("Joey");
        students.add(s11);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("students",  students);
		request.getRequestDispatcher("ViewStudent.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Integer age = Integer.parseInt(request.getParameter("age"));
		String name = request.getParameter("name");
		
		Student student = new Student();
		student.setAge(age);
		student.setName(name);
		students.add(student);
		
		request.setAttribute("students", students);
		request.getRequestDispatcher("ViewStudent.jsp").forward(request, response);
		
		
		
	}

}
