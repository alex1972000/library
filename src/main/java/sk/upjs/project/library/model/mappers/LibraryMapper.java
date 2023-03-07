package sk.upjs.project.library.model.mappers;

import sk.upjs.project.library.entity.Library;
import sk.upjs.project.library.model.entityDTO.LibraryDTO;

public interface LibraryMapper {

    LibraryDTO toDto(final Library library);

    Library toEntity(final LibraryDTO libraryDTO);
}
