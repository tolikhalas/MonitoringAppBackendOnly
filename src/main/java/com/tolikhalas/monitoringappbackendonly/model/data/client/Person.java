package com.tolikhalas.monitoringappbackendonly.model.data.client;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String firstName;

    private String lastName;

    private String afterFather;

    private String phoneNumber;

}
