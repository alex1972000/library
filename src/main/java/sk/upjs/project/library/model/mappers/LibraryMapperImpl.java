package sk.upjs.project.library.model.mappers;

import org.springframework.stereotype.Component;
import sk.upjs.project.library.entity.Library;
import sk.upjs.project.library.model.entityDTO.LibraryDTO;

import java.util.Collections;

@Component
public class LibraryMapperImpl implements LibraryMapper {
    @Override
    public LibraryDTO toDto(Library library) {
        if (library == null) return null;
        return LibraryDTO.builder()
                .id(library.getId())
                .name(library.getName())
                .bookCount(library.getBookCount())
                .address(library.getAddress())
                .build();
    }

    @Override
    public Library toEntity(LibraryDTO libraryDTO) {
        if (libraryDTO == null) return null;
        return Library.builder()
                .id(libraryDTO.getId())
                .name(libraryDTO.getName())
                .bookCount(libraryDTO.getBookCount())
                .technicalName("AHOj")
                .address(libraryDTO.getAddress())
                .users(Collections.emptyList())
                .build();
    }
}
