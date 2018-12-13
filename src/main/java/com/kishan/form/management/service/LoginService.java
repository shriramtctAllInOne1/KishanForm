package com.kishan.form.management.service;

import java.util.List;
import com.kishan.form.management.domain.LoginUser;

/**
 * The Interface LoginService.
 * @author ram
 */
public interface LoginService {

    /**
     * Method to create user.
     * @param user
     *            the user
     * @return the login user
     */
    public LoginUser create(LoginUser user);

    /**
     * Method to find UserById
     * @param id
     *            the id
     * @return the login user
     */
    public LoginUser findByID(Long id);

    /**
     * Method to find user by name
     * @param userName
     *            the user name
     * @return the list
     */
    public List<LoginUser> findByUsername(String userName);

    /**
     * Method to find all user
     * @return the iterable
     */
    public Iterable<LoginUser> findAll();

    /**
     * Method to update userDetails
     * @param user
     *            the user
     * @return the login user
     */
    public LoginUser update(LoginUser user);

    /**
     * Method to Delete user
     * @param user
     *            the user
     */
    public void delete(LoginUser user);

    /**
     * Method to delete userBy Id
     * @param id
     *            the id
     */
    public void delete(Long id);

}
