package com.coder.jaxws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		List<User> userList = null;
		try {
			File file = new File("Users.dat");
			if (!file.exists()) {
				User user = new User(1, "Coder", "ACJHP");
				User user1 = new User(2, "Onur", "Işık");
				User user2 = new User(3, "Dilek", "Işık");
				User user3 = new User(4, "Filiz", "Kucuk");
				User user4 = new User(5, "Sofia", "Işık");
				userList = new ArrayList<User>();
				userList.add(user);
				userList.add(user1);
				userList.add(user2);
				userList.add(user3);
				userList.add(user4);

				saveUserList(userList);
			} else {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				userList = (List<User>) ois.readObject();
				ois.close();
			}
			return userList;
		} catch (IOException e) {
			System.err.println("Error ! " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println("Error ! " + e.getMessage());
		}
		return null;
	}

	private void saveUserList(List<User> userList) {

		try {
			File file = new File("Users.dat");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
