package foo.bar.webexample.domain;

import java.util.Date;

/**

 */
public class Author implements java.io.Serializable{

	private String fio;
	private Date birthday;

	public Author() {
	}

	public Author(String fio, Date birthday) {
		this.fio = fio;
		this.birthday = birthday;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Author{" +
				"fio='" + fio + '\'' +
				", birthday=" + birthday +
				'}';
	}
}
