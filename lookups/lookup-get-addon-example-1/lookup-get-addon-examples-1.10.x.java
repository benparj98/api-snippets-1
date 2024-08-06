// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.lookups.v1.PhoneNumber;

public class Example {
  // Get your Account SID and Auth Token from https://twilio.com/console
  // To set up environment variables, see http://twil.io/secure
  public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
  public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    PhoneNumber number = PhoneNumber
        .fetcher(new com.twilio.type.PhoneNumber("+16502530000"))
        .setAddOns("whitepages_pro_caller_id")
        .fetch();

    System.out.println(number.getCallerName());
  }
}
