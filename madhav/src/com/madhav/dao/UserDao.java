package com.madhav.dao;

import java.util.ArrayList;

import com.madhav.bean.UserBean;





public interface UserDao {
public int userRegistration(UserBean ubean);

public ArrayList<UserBean> userAllDetails();
public String userValidate(String email,String pass);

public boolean userUpdate(UserBean ubean);

public UserBean userDetails(String email);

public boolean userRemove(String email);


public boolean userUpdate(String email, String pass);

}
