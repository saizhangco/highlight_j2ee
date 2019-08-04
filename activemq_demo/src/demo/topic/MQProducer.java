package demo.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

import demo.queue.Constants;

/*
 * <p>
 * MQProducer ������Ϣ�ķ�����
 * <p>
 * */
public class MQProducer {
	
	public static void main(String[] args) {
		// ���ӹ���
		ConnectionFactory factory;
		// ����ʵ��
		Connection connection = null;
		// �շ����߳�ʵ��
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
			// �������ջ��͵��߳�ʵ��������session��ʱ�����Ƿ�Ҫ��������
			// ������������AUTO_ACKNOWLEDGEҲ���������߳ɹ���Listen�л����Ϣ����ʱ���Ự�Զ�ȷ���û��յ���Ϣ��
			session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			// �������У�����һ����ϢĿ�ĵأ�
			destination = session.createTopic("parryTopic");
			// ������Ϣ������
			MessageProducer producer = session.createProducer(destination);
			// ����TextMessage��Ϣ
			TextMessage message = session.createTextMessage("��ã������ҷ����ĵ�һ������Ϣ");
			// ������Ϣ
			producer.send(message);
			session.commit();
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			if( connection != null ) {
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
