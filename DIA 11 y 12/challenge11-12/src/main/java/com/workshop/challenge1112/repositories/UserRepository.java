package com.workshop.challenge1112.repositories;


//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.workshop.challenge1112.db.DataBase;
import com.workshop.challenge1112.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer>{

	

	
	//Preguntar que onda con la interface que implementa el repository
	/*
	ArrayList<UserModel> users = new ArrayList<UserModel>();
	DataBase dbc = new DataBase();
	UserModel user = new UserModel();
	
	
	public UserModel saveUser(UserModel user) throws SQLException {
		String query = "INSERT INTO users (dni,nombre,apellido,direccion) VALUES(?,?,?,?)";
			PreparedStatement st = dbc.getConnection().prepareStatement(query);
			st.setInt(1, user.getDni());
			st.setString(2, user.getNombre());
			st.setString(3, user.getApellido());
			st.setString(4, user.getDireccion());
			st.executeUpdate();
			users.add(user);
			return user;
	}
	
	public UserModel findUser(int dni) throws SQLException {
		String query = "SELECT * FROM users WHERE dni=?";
		PreparedStatement st = dbc.getConnection().prepareStatement(query);
		st.setInt(1, dni);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			user.setDni(dni);
			user.setNombre(rs.getString(2));
			user.setApellido(rs.getString(3));
			user.setDireccion(rs.getString(4));
		}
		return user;
	}
	
	public ArrayList<UserModel> findAll() throws SQLException{
		String query = "SELECT * FROM users";
		PreparedStatement st = dbc.getConnection().prepareStatement(query);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			users.add(new UserModel(rs.getInt(1),
									rs.getString(2),
									rs.getString(3),
									rs.getString(4)));
		}
		return users;
	}
	
	public void updateUser(int dni, String direccion) throws SQLException {
		String query = "UPDATE users SET direccion=? WHERE dni=?";
		PreparedStatement st = dbc.getConnection().prepareStatement(query);
		st.setString(1, direccion);
		st.setInt(2,dni);
		st.executeUpdate();
	}
	
	public void deleteUser(int dni) throws SQLException {
		String query = "DELETE FROM users WHERE dni=?";
		PreparedStatement st = dbc.getConnection().prepareStatement(query);
		st.setInt(1, dni);
		st.executeUpdate();
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getDni()==dni) {
				users.remove(i);
			}
		}
	}
	*/
}
