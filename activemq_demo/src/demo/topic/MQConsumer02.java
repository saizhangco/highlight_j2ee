package demo.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

import demo.queue.Constants;

/*
 * <p>
 * MQConsumer02 ����-����ģʽ ������02
 * <p>
 * */
public class MQConsumer02 {

	public static void main(String[] args) {
		// ���ӹ���
		ConnectionFactory factory;
		// ����ʵ��
		Connection connection = null;
		// �շ��߳�ʵ��
		Session session;
		// ��Ϣ����Ŀ���ַ
		Destination destination;
		try {
			// ʵ�������ӹ���
			factory = new ActiveMQConnectionFactory(Constants.MQ_NAME, Constants.MQ_PASSWORD, Constants.MQ_BROKETURL);
			// ��ȡ����ʵ��
			connection = factory.createConnection();
			// ��������
			connection.start();
			// �������ջ��͵��߳�ʵ��
			session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
			// �������У�����һ����ϢĿ�ĵأ�
			destination = session.createTopic("parryTopic");
			// ������Ϣ������
			MessageConsumer consumer = session.createConsumer(destination);
			// ��Ϣ���������Ӽ�����
			consumer.setMessageListener(new Listener02());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}