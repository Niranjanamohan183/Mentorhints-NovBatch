package com.week8.sql;

import java.sql.*;

public class ViewBalance {

    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT balance FROM accounts WHERE account_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Balance: " + rs.getDouble("balance"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
