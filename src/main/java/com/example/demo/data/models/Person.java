package com.example.demo.data.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Person")
public class Person {
    @Id
    @JsonIgnore
    private String id;
    @Field(name = "first_name", order = 3)
    private String firstName;
    @Field(name = "last_name", order = 4)
    private String lastName;
    @Field(name = "email", order = 1)
    @Indexed(unique = true)
    public String email;
    @Field(name = "mobile_number", order = 2)
    @Indexed(unique = true)
    private String phoneNumber;
    public Sex sex;
    @DBRef
    private Address address;
}
