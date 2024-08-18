package gr.aueb.cf.hello.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet(name = "helloServlet", value = "hello-cf")
@WebServlet("/hello-cf")
public class HelloController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        String message = "Hello Coding Γεια!!!";

        out.println("<html><body><p>" + message + "</p></body></html>");
    }
}
