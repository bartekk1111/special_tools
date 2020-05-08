package com.sda.special_tools.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tool {
    @Column(name="tool_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tollId;
    private String toolName;
}
