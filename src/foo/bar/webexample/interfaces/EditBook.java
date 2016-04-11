package foo.bar.webexample.interfaces;

import foo.bar.webexample.domain.Book;

/**

 */
public interface EditBook {

	boolean save(Book book);
	boolean delete(Book book);
	boolean update(Book book);
}
