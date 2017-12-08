package kr.ac.uos.jms;

import java.util.logging.Level;
import java.util.logging.Logger;
import kr.ac.uos.software_project.aeat.network.ActiveMQConsumer;
import kr.ac.uos.software_project.aeat.network.ActiveMQProducer;
import org.junit.Test;

public class JMS_Test {

    @Test
    public void testSendReceiveMessage() {
        String DESTIANTION_EXAM = "TEST.FOO"; // 데스티네이션 이름
        String MQ_ADDRESS = "vm://localhost"; // 메시지 브로커 주소

        try {
            ActiveMQProducer producer = new ActiveMQProducer(MQ_ADDRESS);
            ActiveMQConsumer consumer = new ActiveMQConsumer(MQ_ADDRESS);

            // Set consumer Destination
            consumer.setConsumerDestination(DESTIANTION_EXAM);

            // Send Message to Destination
            String text = "Hello world!";
            producer.sendMessageTo(text, DESTIANTION_EXAM);

            Thread.sleep(2000);
            producer.closeConnection();
            consumer.closeConnection();
        } catch (InterruptedException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
}
