package com.kishan.form.management.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.kishan.form.management.domain.LoginUser;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginValidator.
 */
@Component
public class LoginValidator implements Validator {

    /** The Constant USERNAME. */
    private final static String USERNAME = "username";

    /** The Constant PASSWORD. */
    private final static String PASSWORD = "password";

    @Override
    public boolean supports(Class<?> clazz) {
        return LoginUser.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginUser loginUser = (LoginUser) target;

        String userName = loginUser.getUsername();
        String password = loginUser.getPassword();

        ValidationUtils.rejectIfEmpty(errors, USERNAME, "shop.name.empty");
        ValidationUtils.rejectIfEmpty(errors, PASSWORD, "shop.emplNumber.empty");

        if (password != null && password.length() < 1) errors.rejectValue(password, "shop.emplNumber.lessThenOne");

    }

}
