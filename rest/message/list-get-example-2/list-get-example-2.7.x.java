// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.joda.time.DateTime;

public class Example {

    // Get your Account SID and Auth Token from https://twilio.com/console
    // To set up environment variables, see http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        ResourceSet<Message> messages = Message
                .reader()
                .setTo(new PhoneNumber("to_number"))
                .setFrom(new PhoneNumber("from_number"))
                .setDateSent(DateTime.parse("2016-01-01'T'09:28:00Z")).read();

        // Loop over messages and print out a property for each one.
        for (Message message : messages) {
            System.out.println(message.getBody());
        }
    }
}

