package com.kishan.form.management.rest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import com.kishan.form.management.domain.LoginUser;


@XmlRootElement
public class Users {
	private List<LoginUser> users = new ArrayList<LoginUser>();

	public Users(Iterable<LoginUser> all) {
		for(LoginUser user: all) {
			users.add(user);
		}
	}
}
