package com.example.demo.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Address")
public class Address {
    @Id
    private String id;
    private String houseNumber;
    private String streetName;
    private String state;
}
