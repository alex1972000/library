package sk.upjs.project.library.model.entityDTO;

import lombok.*;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;
import sk.upjs.project.library.entity.Address;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@FieldNameConstants
public class LibraryDTO {

    private Long id;
    private String name;
    private int bookCount;
    private Address address;
}
