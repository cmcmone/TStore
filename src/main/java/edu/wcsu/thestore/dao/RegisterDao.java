package edu.wcsu.thestore.dao;

import edu.wcsu.thestore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

//Jack Baxter

public interface RegisterDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
