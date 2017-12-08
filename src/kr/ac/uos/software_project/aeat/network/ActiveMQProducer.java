/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kr.ac.uos.software_project.aeat.network;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import kr.ac.uos.software_project.aeat.view.MessagePanel;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 *
 * @author comkeen
 */
public class ActiveMQProducer {

    private Connection connection;
    private MessagePanel messagePanel;
    
    public ActiveMQProducer(String address,MessagePanel messagePanel) {
        init(address, messagePanel);     
        
    }
    
    //메소드명: init
    //입력: 문자열 address와 MessagePanel
    //출력: 없음
    //부수효과: 입력받은 address로 연결을 설정하고 연결에 오류가 발생하면 messagePanel에 오류임을 출력한다.
    private void init(String address, MessagePanel messagePanel) {
        try {
            // Create an ActiveMQConnectionFactory to use JMS
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(address);
            
            // Create a Connection
            this.connection = connectionFactory.createConnection();
            connection.start();
            
        } catch (JMSException ex) {
            System.out.print("연결오류가 발생하였습니다.");
            messagePanel.setTextArea("연결오류가 발생하였습니다.");
            Logger.getLogger(ActiveMQProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //메소드명: sendMessageTo
    //입력: 문자열 text, 문자열 destinationName, MessagePanel
    //출력: 없음
    //부수효과: 입력받은 destinationName으로 연결하고 입력받은 text를 activeMQ를 통해 송신하고 MessagePanel의 화면을 비운다.
    public void sendMessageTo(String text, String destinationName,MessagePanel messagePanel) {
        
        try {            
            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            // Create the destination (Topic or Queue)
            Destination destination = session.createQueue(destinationName);
            
            // Create a MessageProducer from the Session to the Topic or Queue
            MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            
            // Create a messages
            TextMessage message = session.createTextMessage(text);
            
            // Tell the producer to send the message
            System.out.println("Sent message: "+ text);
            producer.send(message);
            messagePanel.clearTextArea();
        } catch (JMSException ex) {
            Logger.getLogger(ActiveMQProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //메소드명: sendMultiMessageTo
    //입력: 문자열 text, 문자열 destinationName, MessagePanel
    //출력: 없음
    //부수효과: 입력받은 destinationName으로 연결하고 입력받은 text를 activeMQ를 통해 송신하고 MessagePanel의 화면을 비운다.
    public void sendMultiMessageTo(String text, String destinationName,MessagePanel messagePanel) {
        
        try {            
            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            // Create the destination (Topic or Queue)
            //Topic으로 하면 브로드캐스팅이 가능하다!
            //받는사람은 queue든 Topic이든 상관이 없다.
            Destination destination = session.createTopic(destinationName);
            
            // Create a MessageProducer from the Session to the Topic or Queue
            MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            
            // Create a messages
            TextMessage message = session.createTextMessage(text);
            
            // Tell the producer to send the message
            System.out.println("Sent message: "+ text);
            producer.send(message);
            messagePanel.clearTextArea();
        } catch (JMSException ex) {
            Logger.getLogger(ActiveMQProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //메소드명: closeConnection
    //입력: 없음
    //출력: 없음
    //부수효과: 현재 통신중인 연결을 끊음
    public void closeConnection() {
        try {
            connection.close();
        } catch (JMSException ex) {
            Logger.getLogger(ActiveMQProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
