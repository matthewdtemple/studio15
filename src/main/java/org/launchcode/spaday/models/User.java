package org.launchcode.spaday.models;

import org.apache.logging.log4j.message.Message;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    @NotBlank(message = "Username cannot be blank")
    @Size(min = 5, max = 15, message = "Must be between 5-15 characters")
    private String username;

    @Email(message = "Please enter a valid email")
    private String email;

  @NotBlank(message = "Passwords must match!")
  @Size(min = 6)
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
