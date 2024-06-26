package uz.pdp.lesson.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String title;
    private String author;
    private String link;
    private String photoLink;

}
