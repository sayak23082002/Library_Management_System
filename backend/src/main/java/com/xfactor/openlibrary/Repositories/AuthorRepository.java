// package com.xfactor.openlibrary.repositories;
package com.xfactor.openlibrary.Repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xfactor.openlibrary.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
    List<Author> findByName(String name);
}
