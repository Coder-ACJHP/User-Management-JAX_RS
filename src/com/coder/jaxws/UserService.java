package com.coder.jaxws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/UserService")
public class UserService {

	UserDao userDao = new UserDao();
	
	@GET
	@Path("/users")
	@Produces(MediaType.TEXT_XML)
	public List<User> getUsers() {
		return userDao.getAllUsers();
	}

	
}
