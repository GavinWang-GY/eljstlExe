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
 * function：用于初始化需要展现的数据
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
		// 将list放到全局对象中合适
		ServletContext servletContext = request.getServletContext();
		// 只有第一次访问的时候赋值初始化，当二次访问这个Servlet时，就不再初始化赋值了
		if(servletContext.getAttribute("employees") == null) {  
			List<Employee> employeesList = new ArrayList<Employee>();
			employeesList.add(new Employee(7731,"刘志明","市场部","客户代表",8800f));
			employeesList.add(new Employee(8871,"吴芳","研发部","运维工程师",8000f));
			servletContext.setAttribute("employees", employeesList);
		}
		//数据初始化完了之后，就是请求派发，跳转到员工信息页上
		request.getRequestDispatcher("/employee.jsp").forward(request, response);
	}

}
