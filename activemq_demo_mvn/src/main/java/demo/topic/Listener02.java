package demo.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/*
 * <p>
 * Listener02 ������02�ļ�����
 * <p>
 * */
public class Listener02 implements MessageListener {

	public void onMessage(Message message) {
		try {
			System.out.println("������02���յ���Ϣ��" + ((TextMessage)message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
