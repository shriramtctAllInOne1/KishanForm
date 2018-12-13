package com.kishan.form.management.controller;

import java.util.Locale;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.kishan.form.management.domain.LoginUser;
import com.kishan.form.management.service.LoginService;

/**
 * @author ram Handles requests for the application login page.
 */
@Controller
@RequestMapping(value = "/admin")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService        loginService;

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

  
    
    @RequestMapping(value = "/adminPage", method = RequestMethod.GET)
    public String createForm(Locale locale) {
        logger.info("=================================Show Login page======================");
       return "kishalAdmin";
    }
    
    @RequestMapping(value = "/manageUser", method = RequestMethod.GET)
    public String manageuser(Locale locale) {
        logger.info("=================================Show Login page======================");
       return "manageUser";
    }


   

}
