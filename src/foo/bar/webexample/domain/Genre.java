package foo.bar.webexample.domain;

/**

 */
public class Genre implements java.io.Serializable {
	
	private String name;

	public Genre() {
	}

	public Genre(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Genre{" +
				"name='" + name + '\'' +
				'}';
	}
}
