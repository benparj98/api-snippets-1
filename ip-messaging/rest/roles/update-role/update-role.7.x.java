// Install the Java helper library from twilio.com/docs/java/install
import java.util.Arrays;
import java.util.List;

import com.twilio.Twilio;
import com.twilio.rest.chat.v2.service.Role;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static final String SERVICE_SID = "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String ROLE_SID = "RLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args) {
    // Initialize the client
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    List<String> permissions = Arrays.asList("sendMessage", "leaveChannel");

    // Update the role
    Role role = Role.updater(SERVICE_SID, ROLE_SID, permissions).update();
  }
}
