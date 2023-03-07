package sk.upjs.project.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.upjs.project.library.entity.Library;
import sk.upjs.project.library.model.entityDTO.LibraryDTO;
import sk.upjs.project.library.model.mappers.LibraryMapperImpl;
import sk.upjs.project.library.repository.LibraryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;
    private final LibraryMapperImpl libraryMapper;

    @Autowired
    public LibraryService(final LibraryRepository libraryRepository, LibraryMapperImpl libraryMapper) {
        this.libraryRepository = libraryRepository;
        this.libraryMapper = libraryMapper;
    }

    public Library getLibraryById(long id) {
        Optional<Library> library = this.libraryRepository.findById(id);
        return library.get();
    }

    public Library saveLibrary(LibraryDTO libraryDTO) {
        Library library = this.libraryMapper.toEntity(libraryDTO);
        return this.libraryRepository.save(library);
    }

    public void deleteLibrary(long id) {
        this.libraryRepository.deleteById(id);
    }

    public List<LibraryDTO> getAll() {
        List<Library> libraryList = this.libraryRepository.findAll();
        return libraryList
                .stream()
                .map(libraryMapper::toDto)
                .toList();
    }
}
