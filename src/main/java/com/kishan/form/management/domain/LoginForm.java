package com.kishan.form.management.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * The Class LoginForm.
 * @author ram The bean backing the login form. Contains validation annotations.
 */
public class LoginForm {

    /** The user name. */
    @NotNull
    @Size(min = 4, max = 20)
    private String username;

    /** The password. */
    @NotNull
    @Size(min = 4, max = 20)
    private String password;

    /**
     * Gets the user name.
     * @return the user name
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the user name.
     * @param username
     *            the new user name
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password.
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * @param password
     *            the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("username:").append(this.username).append(' ');
        sb.append("password:").append(this.password);
        return sb.toString();
    }

}
