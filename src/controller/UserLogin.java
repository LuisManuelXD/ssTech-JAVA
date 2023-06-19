package controller;

import model.User;

public class UserLogin {
    User users[] = new User[5];
    
    public UserLogin() {
        users[0] = new User("admin", "admin123");
        users[1] = new User("Luis", "luis123");
        users[2] = new User("Manuel", "manuel123");
        users[3] = new User("Beto", "beto123");
        users[4] = new User("Neri", "neri123");
    }
    
    public boolean enter(String user, String password){
        for (int i = 0; i < 5; i++){
            if (users[i].getUser().equals(user) && users[i].getPassword().equals(password))
            return true;
        }
        return false;
    }
}
