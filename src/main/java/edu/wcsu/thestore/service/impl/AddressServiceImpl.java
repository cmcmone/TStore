package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.AddressDao;
import edu.wcsu.thestore.domain.Address;
import edu.wcsu.thestore.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    public Address getUserAddress(Long userID) {
        return addressDao.findOneAddress(userID);
    }

    @Override
    public void save(Address address) {
        addressDao.save(address);
    }
}
