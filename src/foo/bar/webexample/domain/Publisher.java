package foo.bar.webexample.domain;

/**

 */
public class Publisher implements java.io.Serializable {

	private String name;

	public Publisher() {
	}

	public Publisher(String name) {
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
		return "Publisher{" +
				"name='" + name + '\'' +
				'}';
	}
}
