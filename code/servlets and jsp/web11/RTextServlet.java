package com.training.web11;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@WebServlet(urlPatterns = "/reverse", asyncSupported = true)
public class RTextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static ExecutorService executor = Executors.newFixedThreadPool(3);
	
    public RTextServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("USE POST");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AsyncContext ac = request.startAsync();
		executor.submit(() -> {
			try {
				Thread.sleep(100);
				StringBuilder sb = new StringBuilder(request.getParameter("text")); 
				PrintWriter pw = response.getWriter();
				System.out.println("TEXT :" + sb );
				response.setContentType("text/plain");
				pw.println(Thread.currentThread().getName()+ " State:" + Thread.currentThread().getState());
				pw.println(sb.length());
				pw.println(sb.reverse());
				pw.println(sb.toString().toUpperCase());
				System.out.println(sb.length());
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
