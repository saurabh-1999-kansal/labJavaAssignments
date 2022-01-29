package com.batchprocessing;

import java.sql.*;

public class Main {
	public static void main(String[] args) {

		Connection connection = ConnectionFactory.getConnection();

		long start = System.currentTimeMillis();

		try {
			connection.setAutoCommit(false);
			PreparedStatement pstmt = connection.prepareStatement("insert into transactions(name) values(?)");
			for (long i = 1; i <= 1000; i++) {
				pstmt.setString(1, "Number:" + i);
				pstmt.executeUpdate();
				pstmt.addBatch();
				if (i % 200 == 0) {
					pstmt.executeBatch();
				}
			}
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();

		System.out.println("time taken: " + (end - start));

	}
}