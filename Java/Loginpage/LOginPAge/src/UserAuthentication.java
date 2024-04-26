import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAuthentication {
    public boolean authenticateUser(String username, String password) {
        // Establish a connection to the SQLite database
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:/path/to/your/database.db")) {
            // Prepare the SQL statement to retrieve the hashed password for the given username
            String sql = "SELECT password FROM users WHERE username = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        String hashedPassword = resultSet.getString("password");
                        // Compare the hashed password with the provided password
                        if (verifyPassword(password, hashedPassword)) {
                            return true; // Authentication successful
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Authentication failed
    }

    private boolean verifyPassword(String password, String hashedPassword) {
        // Implement your password verification logic here
        // For example, you can use a library like BCrypt to compare the passwords
        // or any other hashing algorithm you prefer
        // Return true if the passwords match, false otherwise
        return password.equals(hashedPassword);
    }
}
