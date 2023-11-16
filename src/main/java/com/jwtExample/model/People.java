package com.jwtExample.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class People {

    private String id;
    private String name;
    private String pleace;
}
