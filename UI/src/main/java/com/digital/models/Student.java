package com.digital.models;

import lombok.*;

//@AllArgsConstructor
//@Getter
//@Setter
//@NoArgsConstructor
//@Builder
//@EqualsAndHashCode
//@SneakyThrows почитать
@Data // - включает в себя все методы
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String eMail;
    private String phoneNUmber;
    private String currentAddress;
    private String password;
}
