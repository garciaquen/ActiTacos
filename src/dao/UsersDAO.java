package dao;

import model.Users;

import java.util.List;

/**
 * Created by ratierchar on 23/11/16.
 */
public interface UsersDAO {
	public void addUser(Users u);
	public void updateUser(Users u);
	public List<Users> listUsers();
	public Users getUserById(int id);
	public void removeUser(int id);
}
