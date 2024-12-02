package com.cwa.advanced.all;

import java.sql.*;

public class DataBaseConnectivity {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "rootroot";
        Connection connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);

        try {
            //INSERT VALUE
            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO users(`username`, `password`) VALUES(?, ?)");
            insertStatement.setString(1, "John");
            insertStatement.setString(2, "john63");
            insertStatement.executeUpdate();

            //Prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            preparedStatement.setInt(1, 3);
            ResultSet resultSet = preparedStatement.executeQuery();

            connection.commit();

            while(resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }

            resultSet.close();
            preparedStatement.close();
            insertStatement.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            connection.rollback();
        } finally {
            connection.close();
        }
    }
}
