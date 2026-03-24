public class UserDAO {

	/**
	 * 
	 * @param connection
	 * @param username
	 * @param password_hash
	 */
	public int create_user(SQLConnection connection, string username, string password_hash) {
		// TODO - implement UserDAO.create_user
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param connection
	 * @param username
	 */
	public User find_user_by_username(SQLConnection connection, string username) {
		// TODO - implement UserDAO.find_user_by_username
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param connection
	 * @param username
	 * @param password
	 */
	public bool verify_user(SQLConnection connection, string username, string password) {
		// TODO - implement UserDAO.verify_user
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param connection
	 * @param user_id
	 */
	public User get_user_by_id(SQLConnection connection, int user_id) {
		// TODO - implement UserDAO.get_user_by_id
		throw new UnsupportedOperationException();
	}

}