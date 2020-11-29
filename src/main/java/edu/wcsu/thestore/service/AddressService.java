package edu.wcsu.thestore.service;

import edu.wcsu.thestore.domain.Address;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface AddressService {
    Address getUserAddress(Long userID);
    void save(Address address);
}
