package com.inooc.employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * function�����ڳ�ʼ����Ҫչ�ֵ�����
 * Servlet implementation class ListServlet
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		// ��list�ŵ�ȫ�ֶ����к���
		ServletContext servletContext = request.getServletContext();
		// ֻ�е�һ�η��ʵ�ʱ��ֵ��ʼ���������η������Servletʱ���Ͳ��ٳ�ʼ����ֵ��
		if(servletContext.getAttribute("employees") == null) {  
			List<Employee> employeesList = new ArrayList<Employee>();
			employeesList.add(new Employee(7731,"��־��","�г���","�ͻ�����",8800f));
			employeesList.add(new Employee(8871,"�ⷼ","�з���","��ά����ʦ",8000f));
			servletContext.setAttribute("employees", employeesList);
		}
		//���ݳ�ʼ������֮�󣬾��������ɷ�����ת��Ա����Ϣҳ��
		request.getRequestDispatcher("/employee.jsp").forward(request, response);
	}

}
