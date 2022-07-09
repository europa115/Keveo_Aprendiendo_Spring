package com.example.KeVeo.dto;
import com.example.KeVeo.data.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterUserDTO {

    private Integer id;

    private String userName;

    private String password;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date date;

    private boolean active;

    private String userSurname;

    private String userEmail;


    //****************************************CONSTRUCTORS**************************************************************

    public RegisterUserDTO(String userName, String password, Date date, boolean active, String userSurname, String userEmail) {
        this.userName = userName;
        this.password = password;
        this.date = date;
        this.active = active;
        this.userSurname = userSurname;
        this.userEmail = userEmail;

    }
}
