package edu.wcsu.thestore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "t_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long productID;

    @Column(name = "name", nullable = false)
    private String productName;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "description", nullable = false)
    private String description;

    @JoinColumn(name = "vendorName")
    private String vendorName;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "cost", nullable = false)
    private Double cost;

    @Column(name = "img_path", nullable = false)
    private String imgPath;

    @Column(name = "shortname", nullable = false)
    private String shortProductName;
}
