package edu.wcsu.thestore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long orderID;

    @Column(name = "dateOrdered")
    private Date dateOrdered;

    @Column(name = "totalItems")
    private String totalItems;

    @Column(name = "totalCost")
    private double totalCost;

    @Column(name = "status")
    private String status;
}
