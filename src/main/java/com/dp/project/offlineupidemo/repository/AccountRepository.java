package com.dp.project.offlineupidemo.repository;

import com.dp.project.offlineupidemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {

}
