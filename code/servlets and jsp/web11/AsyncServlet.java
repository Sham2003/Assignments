package com.training.web11;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@WebServlet(urlPatterns = "/async", asyncSupported = true)
public class AsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static ExecutorService executor = Executors.newSingleThreadExecutor();
	
    public AsyncServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("USE POST");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AsyncContext ac = request.startAsync();
		executor.submit(() -> {
			try {
				Thread.sleep(1500);
				String uname = request.getParameter("uname");
				String pwd = request.getParameter("pwd");
				System.out.println("uname :" + uname + " pwd:" + pwd );
				response.setContentType("text/plain");
				if("sham".equals(uname) && "sham".equals(pwd)) {
					response.getWriter().println("Authentication successfull , Async Logic");
				} else {
					response.getWriter().println("Invalid credentials , Async Logic");
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				ac.complete();				
			}
			
		});
	}

}
