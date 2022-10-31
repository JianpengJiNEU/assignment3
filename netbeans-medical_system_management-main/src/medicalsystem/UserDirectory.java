/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalsystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jianpeng Ji
 */
public class UserDirectory {

    private HashMap<String, User> userMap;

    public UserDirectory() {
        this.userMap = new HashMap<String, User>();
    }

    public void addUser(User user) {
        userMap.put(user.getUserName(), user);
    }

    public void updateUser(User user) {
        userMap.remove(user.getUserName());
        userMap.put(user.getUserName(), user);
    }

    public void deleteUser(User user) {
        userMap.remove(user.getUserName());
    }

    public void deleteUser(String userName) {
        userMap.remove(userName);
    }

    public HashMap<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(HashMap<String, User> userDirectory) {
        this.userMap = userDirectory;
    }

    public boolean contains(User user) {
        for (Map.Entry<String, User> pair
                : userMap.entrySet()) {
            if (pair.getValue().equals(user)) {
                return true;
            }
        }
        return false;
    }
    
    public String getID(User user) {
        for (Map.Entry<String, User> pair
                : userMap.entrySet()) {
            if (pair.getValue().equals(user)) {
                return pair.getValue().getId();
            }
        }
        return null;
    }
    
    public User getUser(String userName){
        return userMap.get(userName);  
    }

    public int size() {
        return userMap.size();
    }
}
