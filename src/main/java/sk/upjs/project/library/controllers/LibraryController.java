package sk.upjs.project.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.upjs.project.library.entity.Library;
import sk.upjs.project.library.model.entityDTO.LibraryDTO;
import sk.upjs.project.library.services.LibraryService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/{id}")
    public Library getLibraryById(@PathVariable("id") long id) {
        return this.libraryService.getLibraryById(id);
    }

    @GetMapping()
    public List<LibraryDTO> getAll() {
        return this.libraryService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id) {
        this.libraryService.deleteLibrary(id);
    }

    @PostMapping
    public Library save(@RequestBody LibraryDTO library) {
        return this.libraryService.saveLibrary(library);
    }


}
