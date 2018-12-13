package com.kishan.form.management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kishan.form.management.domain.LoginUser;
import com.kishan.form.management.repositories.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public LoginRepository getLoginRepository() {
        return loginRepository;
    }

    public void setLoginRepository(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public LoginUser create(LoginUser user) {
        return null;
    }

    @Override
    public LoginUser findByID(Long id) {
        return null;
    }

    @Override
    public List<LoginUser> findByUsername(String userName) {
        return null;
    }

    @Override
    public Iterable<LoginUser> findAll() {
        return null;
    }

    @Override
    public LoginUser update(LoginUser user) {
        return null;
    }

    @Override
    public void delete(LoginUser user) {

    }

    @Override
    public void delete(Long id) {

    }

}
