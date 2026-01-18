package com.week8.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MoneyTransfer {

    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            con.setAutoCommit(false);  // start transaction

            String withdraw = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
            PreparedStatement ps1 = con.prepareStatement(withdraw);
            ps1.setDouble(1, 1000);
            ps1.setInt(2, 1);
            ps1.executeUpdate();

            String deposit = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
            PreparedStatement ps2 = con.prepareStatement(deposit);
            ps2.setDouble(1, 1000);
            ps2.setInt(2, 2);
            ps2.executeUpdate();

            con.commit();
            System.out.println("Transaction Successful");

        } catch (Exception e) {
            try {
                con.rollback();
                System.out.println("Transaction Failed - Rolled Back");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
