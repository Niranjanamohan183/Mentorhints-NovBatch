package com.week8.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateAccount {

    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO accounts(customer_id, balance) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 1);      // existing customer_id
            ps.setDouble(2, 5000);

            ps.executeUpdate();
            System.out.println("Account Created");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
