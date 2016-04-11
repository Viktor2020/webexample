package foo.bar.webexample.interfaces;

import foo.bar.webexample.domain.Author;
import foo.bar.webexample.domain.Book;
import foo.bar.webexample.domain.Genre;

import java.util.List;

/**

 */
public interface BookSearch {
	List<Book> getBooks();
	List<Book> getBooks(Author author);
	List<Book> getBooks(String name);
	List<Book> getBooks(Genre genre);
	List<Book> getBooks(Character character);

}
