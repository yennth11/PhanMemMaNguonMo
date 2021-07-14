

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PhanA {

	public static void main(String[] args) {
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql = "SELECT MaSP, TenSP, TenLoaiSP FROM SANPHAM SP JOIN LOAISANPHAM LSP ON SP.MaLoaiSP = LSP.MaLoaiSP";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("MaSP") + " - " + resultSet.getString("TenSP") + " - " + resultSet.getString("TenLoaiSP"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
