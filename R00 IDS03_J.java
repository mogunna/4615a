//Rule 0. nput Validation and Data Sanitization (IDS) 
//Example DS03-J. Do not log unsanitized user input
if (loginSuccessful) {
  logger.severe("User login succeeded for: " + sanitizeUser(username));
} else {
  logger.severe("User login failed for: " + sanitizeUser(username));
}
public String sanitizeUser(String username) {
  return Pattern.matches("[A-Za-z0-9_]+", username)
      ? username : "unauthorized user";
}