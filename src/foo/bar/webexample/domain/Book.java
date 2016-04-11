package foo.bar.webexample.domain;

/**

 */
public class Book implements java.io.Serializable {
	private Author author;
	private Genre genre;
	private Publisher publisher;
	private String name;
	private String description;
	private String isbn;
	private byte[] content;
	private byte[] image;
	private Integer publisherYear;
	private Integer rating;
	private Integer pageCount;
	private Long voteCount;

	public Book() {
	}

	public Book(Author author, Genre genre, Publisher publisher, String name, String description, String isbn, byte[] content, byte[] image, Integer publisherYear, Integer rating, Integer pageCount, Long voteCount) {
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.name = name;
		this.description = description;
		this.isbn = isbn;
		this.content = content;
		this.image = image;
		this.publisherYear = publisherYear;
		this.rating = rating;
		this.pageCount = pageCount;
		this.voteCount = voteCount;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Integer getPublisherYear() {
		return publisherYear;
	}

	public void setPublisherYear(Integer publisherYear) {
		this.publisherYear = publisherYear;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Long getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(Long voteCount) {
		this.voteCount = voteCount;
	}

	@Override
	public String toString() {
		return "Book{" +
				"author=" + author +
				", genre=" + genre +
				", publisher=" + publisher +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", isbn='" + isbn + '\'' +
				", publisherYear=" + publisherYear +
				", rating=" + rating +
				", pageCount=" + pageCount +
				", voteCount=" + voteCount +
				'}';
	}
}
