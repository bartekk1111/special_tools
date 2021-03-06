package com.sda.special_tools.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tool {
    @Column(name = "tool_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tollId;

    @Column(name = "tool_name")
    private String toolName;

    @Column(name = "description")
    private String toolDescription;

    @ManyToMany
    @JoinTable(name = "tool_warehouse",
    joinColumns = @JoinColumn(name = "tool_id"),
    inverseJoinColumns = @JoinColumn(name = "warehouse_id")
    )
    private Set<Warehouse> toolWarehouse;

    @Column(name = "quantity")
    private Long toolQty;

}
