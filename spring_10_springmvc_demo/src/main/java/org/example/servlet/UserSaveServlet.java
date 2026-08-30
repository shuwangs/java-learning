package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user/save")
public class UserSaveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // get request
        String name = req.getParameter("name");
        System.out.println("servlet save name: " + name);

        // get the response
        res.setContentType("text/json;charset=utf-8");
        PrintWriter pw = res.getWriter();
        pw.write("{'module': 'servlet save'}");
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.doGet(req, res);
    }
}
