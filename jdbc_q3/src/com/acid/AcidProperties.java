package com.acid;

import java.sql.*;

public class AcidProperties {

	public static void main(String[] args) {

		Connection connection = ConnectionFactory.getConnection();
		try {
			connection.setAutoCommit(false);
			// connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			PreparedStatement pstmt = connection.prepareStatement("update account set balance=balance-10 where id=?");
			pstmt.setInt(1, 1);
			pstmt.executeUpdate();

			pstmt = connection.prepareStatement("update account set balance=balance+10 where id=?");
			pstmt.setInt(1, 2);
			pstmt.executeUpdate();

			connection.commit();
			System.out.println("transfer is done");
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}