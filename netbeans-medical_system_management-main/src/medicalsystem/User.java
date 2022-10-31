/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalsystem;

import java.util.Objects;

/**
 *
 * @author JianpengJi
 */
public class User {

    private String userTypeName;
    private String userName;
    private String password;
    private String id;

    public User(String userTypeName, String userName, String password, String id) {
        this.userTypeName = userTypeName;
        this.userName = userName;
        this.password = password;
        this.id = id;
    }
    
    public User(String userTypeName, String userName, String password) {
        this.userTypeName = userTypeName;
        this.userName = userName;
        this.password = password;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.userTypeName);
        hash = 53 * hash + Objects.hashCode(this.userName);
        hash = 53 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.userTypeName, other.userTypeName)) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

}
