package com.rafaelgonzalez.usermanagementnew.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.rafaelgonzalez.usermanagementnew.entity.OurUsers;
import java.util.List;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expitationToken;
    private String expirationTime;
    private String name;
    private String email;
    private String role;
    private String password;
    private OurUsers ourUsers;
    private List<OurUsers> ourUsersList;
}
