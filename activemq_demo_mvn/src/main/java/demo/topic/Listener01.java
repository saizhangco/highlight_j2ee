package demo.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/*
 * <p>
 * Listener01 ������01�ļ�����
 * <p>
 * */
public class Listener01 implements MessageListener {

	public void onMessage(Message message) {
		try {
			System.out.println("������01���յ���Ϣ��" + ((TextMessage)message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
