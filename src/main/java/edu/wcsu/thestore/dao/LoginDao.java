package edu.wcsu.thestore.dao;

import edu.wcsu.thestore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface LoginDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
