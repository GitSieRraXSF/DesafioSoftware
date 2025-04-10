package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Student;

public class StudentDAO implements CRUD_Operation<Student, String> {

	private Connection connection;

	public StudentDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void save(Student student) {
		String sql = "INSERT INTO Student (id, name, email) VALUES (?, ?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, book.getTitle());
			stmt.setString(2, book.getAuthor());
			stmt.setLong(3, book.getISBN());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<Student> fetch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean authenticate(String id) {
		String sql = "SELECT ID FROM Student WHERE id=?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getString("id") == id;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}