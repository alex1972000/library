package sk.upjs.project.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sk.upjs.project.library.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

    Library findByName(String name);
}
