package com.app.service.impl;
import java.util.List;
import com.app.service.IUserSev.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.model.User;
import com.app.dao.*;
import com.app.dao.IUserDao.IUserDao;




@Service
public class UserServiceImpl implements IUserService {

public IUserDao dao;



public IUserDao getDao() {
	return dao;
}
public void setDao(IUserDao dao) {
	this.dao = dao;
}
@Transactional
public void saveUser(User user) {

dao.saveUser(user);
}
@Transactional
public void updateUser(User user) {
dao.updateUser(user);
}
@Transactional
public void deleteUser(int userId) {
dao.deleteUser(userId);
}
@Transactional(readOnly=true)
public User getUserById(int userId) {
return dao.getUserById(userId);
}
@Transactional(readOnly=true)
public List<User> getAllUsers(){
return dao.getAllUsers();
}
}