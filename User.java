package com.app.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="usrtabs")
public class User {
@Id
@Column(name="u_id")
private int userId;

@Column(name="u_name")
private String userName;
@Column(name="u_code")
private String userCode;
//alt+shift+S,O(DeselectAll>OK)
public User() {
}
//alt+shift+S,O
//(DeselectAll>choose userId>OK)
public User(int userId) {
this.userId = userId;
}
//alt+shift+S,R(SelectAll>OK)
public int getUserId() {
return userId;
}
public void setUserId(int userId) {
this.userId = userId;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
public String getUserCode() {
return userCode;
}
public void setUserCode(String userCode) {
this.userCode = userCode;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userCode=" + userCode + "]";
}


}
