package edu.wcsu.thestore.dao;

import edu.wcsu.thestore.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface AddressDao extends JpaRepository<Address, Long>, JpaSpecificationExecutor<Address> {
    @Query(value = "SELECT * FROM t_address WHERE user_id=:userID ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Address findOneAddress(@Param("userID") Long userID);
}
