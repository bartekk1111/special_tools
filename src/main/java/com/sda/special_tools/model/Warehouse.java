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
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long warehouseId;
    private String warehouseName;
    private String warehouseEmail;
}
