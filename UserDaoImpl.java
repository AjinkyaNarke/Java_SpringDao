package com.app.dao.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserDao.*;
import com.app.model.User;
@Repository
public class UserDaoImpl implements IUserDao {

	
	
	
public HibernateTemplate htm;






public HibernateTemplate getHtm() {
	return htm;
}
public void setHtm(HibernateTemplate htm) {
	this.htm = htm;
}
public void saveUser(User user) {
htm.save(user);
}
public void updateUser(User user) {
htm.update(user);
}
public void deleteUser(int userId) {
htm.delete(new User(userId));
}
public User getUserById(int userId) {
User user=htm.get(User.class, userId);
return user;
}
public List<User> getAllUsers(){
List<User> users=htm.loadAll(User.class);
return users;
}
}