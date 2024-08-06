// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.http.HttpMethod;
import com.twilio.rest.api.v2010.account.IncomingPhoneNumber;
import com.twilio.type.PhoneNumber;

public class Example {
  // Get your Account SID and Auth Token from https://twilio.com/console
  // To set up environment variables, see http://twil.io/secure
  public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
  public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    IncomingPhoneNumber number = IncomingPhoneNumber.creator(new PhoneNumber("+15105647903"))
        .setFriendlyName("My Company Line").setVoiceUrl("http://demo.twilio.com/docs/voice.xml")
        .setVoiceMethod(HttpMethod.GET).create();

    System.out.println(number.getSid());
  }
}
