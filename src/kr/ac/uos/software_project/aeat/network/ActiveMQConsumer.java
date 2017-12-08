/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kr.ac.uos.software_project.aeat.network;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import kr.ac.uos.software_project.aeat.view.MessagePanel;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 *
 * @author comkeen
 */

public class ActiveMQConsumer implements ExceptionListener {

    private Connection connection;
    private MessagePanel messagePanel;
    
    public ActiveMQConsumer(String address, MessagePanel messagePanel) {
        init(address, messagePanel);
        this.messagePanel = messagePanel;
    }
    
    @Override
    public void onException(JMSException jmse) {
        System.out.println("JMS Exception occured. SHutting down client");
    }
    
    //메소드명: init
    //입력: 문자열 address와 MessagePanel
    //출력: 없음
    //부수효과: 입력받은 address로 연결을 설정하고 연결에 오류가 발생하면 messagePanel에 오류임을 출력한다.
    private void init(String address, MessagePanel messagePanel) {
        try {
            // Create a ConnectionFactory
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(address);

            // Create a Connection
            this.connection = connectionFactory.createConnection();
            connection.start();

            connection.setExceptionListener(this);
        } catch (JMSException e) {
            System.out.print("연결오류가 발생하였습니다.");
            messagePanel.setTextArea("연결오류가 발생하였습니다.");
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }
    
    //메소드명: setConsumerDestination
    //입력: 문자열 destinationName
    //출력: 없음
    //부수효과: 입력받은 destinationName으로 Destination을 설정하고 메세지를 받는 기능
    public void setConsumerDestination(String destinationName) {
        
        try {
            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            // Create the destination (Topic or Queue)
            Destination destination = session.createQueue(destinationName);

            // Create a MessageConsumer from the Session to the Topic or Queue
            MessageConsumer consumer = session.createConsumer(destination);

            // Wait for a message
            MessageListener listener = new MessageListener() {
                public void onMessage(Message message) {
                    if (message instanceof TextMessage) {
                        TextMessage textMessage = (TextMessage) message;
                        try {
                            messagePanel.setTextArea(textMessage.getText());
                            System.out.println("Received Message:\n" + textMessage.getText());
                            
                        } catch (JMSException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            // Register to MessageListener
            consumer.setMessageListener(listener);
        } catch (JMSException ex) {
            Logger.getLogger(ActiveMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    //메소드명: setMultiConsumerDestination
    //입력: 문자열 destinationName
    //출력: 없음
    //부수효과: 입력받은 destinationName으로 Destination을 설정하고 메세지를 받는 기능
    public void setMultiConsumerDestination(String destinationName) {
        
        try {
            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            // Create the destination (Topic or Queue)
            // 일단 보내는 사람이 Topic으로 보내면 받는사람은 queue이어도 받을 수있다.
            // 그렇다면 여기서 Topic은 왜 존재하는가?
            Destination destination = session.createTopic(destinationName);

            // Create a MessageConsumer from the Session to the Topic or Queue
            MessageConsumer consumer = session.createConsumer(destination);

            // Wait for a message
            MessageListener listener = new MessageListener() {
                public void onMessage(Message message) {
                    if (message instanceof TextMessage) {
                        TextMessage textMessage = (TextMessage) message;
                        try {
                            messagePanel.setTextArea(textMessage.getText());
                            System.out.println("Received Message:\n" + textMessage.getText());
                            
                        } catch (JMSException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            // Register to MessageListener
            consumer.setMessageListener(listener);
        } catch (JMSException ex) {
            Logger.getLogger(ActiveMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
      
    //메소드명: closeConnection
    //입력: 없음
    //출력: 없음
    //부수효과: 현재 통신중인 연결을 끊는 기능
    public void closeConnection() {
        try {
            connection.close();
        } catch (JMSException ex) {
            Logger.getLogger(ActiveMQProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}


