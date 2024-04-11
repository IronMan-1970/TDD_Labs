package org.example.tdd_labs_spb.model;/*
  @author   antihetman
  @project   TDD_Labs_Spb
  @class  Item
  @version  1.0.0 
  @since 4/11/24 - 16.04
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private String id;
    private String name;
    private String code;
    private String description;

}
