import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void sendNewsletter(Newsletter newsletter) {
        for (Subscriber subscriber : subscribers) {
            subscriber.erhalteNewsletter(newsletter);
        }
    }

}
