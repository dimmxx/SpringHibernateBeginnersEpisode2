package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] args) {

        String url = "jdbc:mysql://3.133.58.254:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
        String login = "root";
        String pass = "remote";

        try {
            System.out.println("Connecting to " + url);
            Connection connection = DriverManager.getConnection(url, login, pass);
            System.out.println("Connection successful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
