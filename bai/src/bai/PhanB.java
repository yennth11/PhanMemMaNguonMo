

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PhanB {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap MaLoaiSP: ");
		String maLoaiSP = scanner.nextLine();
		System.out.print("Nhap TenLoaiSP: ");
		String tenLoaiSP = scanner.nextLine();

		Connection connection = JDBCConnection.getJDBCConnection();
		String sql = "INSERT INTO LOAISANPHAM VALUES (?, ?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, maLoaiSP);
			preparedStatement.setString(2, tenLoaiSP);
			int result = preparedStatement.executeUpdate();
			System.out.println("Nhap du lieu vao bang LoaiSanPham thanh cong!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
