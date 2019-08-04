package demo.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MQListener implements MessageListener {

	public void onMessage(Message message) {
		try {
			System.out.println(((TextMessage)message).getText());
		} catch(JMSException e) {
			e.printStackTrace();
		}
	}
}
