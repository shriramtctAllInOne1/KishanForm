package com.kishan.form.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kishan.form.management.domain.LoginUser;


@Repository
public interface LoginRepository extends JpaRepository<LoginUser, Long>{

}
