package com.sda.special_tools.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Warehouse {
    @Column(name = "warehouse_id")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long warehouseId;

    @Column(name = "warehouse_name")
    private String warehouseName;

    @Column(name = "warehouse_email")
    private String warehouseEmail;
}
