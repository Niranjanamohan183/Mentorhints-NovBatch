package com.week8.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddCustomer {

    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO customers(customer_name, city, mobile) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Niranjana");
            ps.setString(2, "Chennai");
            ps.setString(3, "9876543210");

            int rows = ps.executeUpdate();
            System.out.println(rows + " Customer Added");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
