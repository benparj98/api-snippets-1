// Install the Java helper library from twilio.com/docs/java/install
import org.joda.time.LocalDate;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.monitor.v1.Event;

public class Example {
  // Get your Account SID and Auth Token from https://twilio.com/console
  // To set up environment variables, see http://twil.io/secure
  public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
  public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<Event> events = Event.reader()
        .setStartDate(LocalDate.parse("2015-03-01"))
        .setEndDate(LocalDate.parse("2015-04-01"))
        .read();

    for (Event e : events) {
      System.out.println(e.getDescription());
    }
  }
}
