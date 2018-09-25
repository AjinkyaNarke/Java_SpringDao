package com.app.dao.IUserDao;
import java.util.List;
import com.app.model.User;
public interface IUserDao {
public void saveUser(User user);
public void updateUser(User user);
public void deleteUser(int userId);
public User getUserById(int userId);
public List<User> getAllUsers();
}