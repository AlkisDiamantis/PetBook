
package com.Project.PetBook.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PasswordForgotDto {
    
    @Email(message = "Please enter a valid email address.")
    @NotEmpty(message = "Please enter your email.")
    String email;
    
}
