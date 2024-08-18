package gr.aueb.cf.hello.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello-jsp")
public class HelloJSPController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String message = "Hello Coding Factory!!!";
        request.setAttribute("message", message);

        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }
}
