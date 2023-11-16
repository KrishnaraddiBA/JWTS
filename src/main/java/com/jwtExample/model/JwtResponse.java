package com.jwtExample.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class JwtResponse {


    private String jwtToken;
    private String username;
}
