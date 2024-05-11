package uz.pdp.lesson.backend.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyUser {
    private long id;
    private String name;
    private String firstname;
    private String lastname;
    private String username;
    private String baseState;
    private String phone;
    private String state;

}
