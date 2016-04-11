package foo.bar.webexample.interfaces;

import foo.bar.webexample.domain.User;

/**

 */
public interface SecureUser {

	boolean login(User user);

	void logout(User user);
}
