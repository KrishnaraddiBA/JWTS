package com.jwtExample.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class JwtRequest {

private String email;
private String password;

}
