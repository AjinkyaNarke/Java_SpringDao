package com.app.test;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.model.User;
import com.app.dao.IUserDao.*;
import com.app.service.impl.*;
import com.app.service.*;
import com.app.service.IUserSev.IUserService;
public class Test {
public static void main(String[] args) {

    ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
    IUserService service=(IUserService)ac.getBean("ser");

/*User user=new User();
user.setUserId(105);
user.setUserName("kk");
user.setUserCode("U0");
service.saveUser(user); //ctrl+F11

*/


///ex#2: get one row
/*User u=service.getUserById(101);
System.out.println(u);
*/

//ex#3 : get All user
/*List<User> users=service.getAllUsers();
users.forEach(System.out::println);
*/

//ex#4 modify user name and code by Id
/*User user=new User();
user.setUserId(100);
user.setUserName("AANEW");
user.setUserCode("U1NEW");
service.updateUser(user);

*/

//ex#5 delete user
service.deleteUser(105);
}
}