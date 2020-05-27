package com.luv2code.jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/test")
public class TestDbServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = "root";
        String pass = "remote";
        String url = "jdbc:mysql://3.133.58.254:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
        String driver = "com.mysql.jdbc.Driver";

        try {
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("Connecting to " + url);
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, login, pass);
            printWriter.println("Connection successful");
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
