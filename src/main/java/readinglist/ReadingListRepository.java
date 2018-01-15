package readinglist;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Park Sangwon
 * 2018. 1. 11.
 */

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
