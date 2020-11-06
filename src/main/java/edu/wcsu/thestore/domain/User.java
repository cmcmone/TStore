package edu.wcsu.thestore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ray Chen
 * @version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long userID;
    private String lastName;
    private String middleName;
    private String firstName;
}