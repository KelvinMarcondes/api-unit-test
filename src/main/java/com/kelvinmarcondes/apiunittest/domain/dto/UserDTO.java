package com.kelvinmarcondes.apiunittest.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter @Getter @NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String email;
    private String password;

}
