/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kr.ac.uos.software_project.aeat;

import kr.ac.uos.software_project.aeat.view.Frame;
import aeat.AEATType;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import kr.ac.uos.software_project.aeat.view.MessagePanel;
import kr.ac.uos.software_project.aeat.view.TitlePanel;

/**
 *
 * @author comkeen
 */
public class Publisher {

    private Frame frame;
    private TitlePanel titlePanel;
    public static final String AEAT_SAMPLE = "xml/AEAT-Example-20170920.xml"; // 샘플 aeat xml 경로
    public static final String AEAT_XML_SCHEMA = "xmlSchema/AEAT-1.0-20170920.xsd"; // aeat schema 경로
    public static final String AEAT_OUTPUT = "xml/output.xml"; // 저장되는 파일 경로
    public static final String MQ_ADDRESS = "tcp://172.16.162.203:61616";
    public static final String DESTIANTION_EXAM = "lecture.goal";

    public Publisher() {
        MyButtonActionListener buttonActionListener = new MyButtonActionListener(this); // 버튼액션리스너 생성
        this.frame = new Frame(buttonActionListener); // 메인 프레임 생성
    }

    //메소드명:aeatMarshalling()
    //입력:aeat 루트엘리먼트 객체(AEATType), 마샬링할 파일 경로 및 이름(String)
    //출력:없음
    //부수효과:없음
    private void aeatMarshalling(AEATType aeat, String path) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AEATType.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //AEATType 객체를 "path" 경로에 파일로 저장            
            marshaller.marshal(aeat, new File(path));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    //메소드명: aeatUnmarshalling()
    //입력:불러올 파일 경로 및 이름(String)
    //출력:언마샬링한 xml 파일 루트엘리먼트 객체
    //부수효과:없음
    private AEATType aeatUnmarshalling(String path) {
        AEATType aeat = null;
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(AEATType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            //XML 파일로부터 AEATTYPE 객체 반환
            aeat = (AEATType) ((JAXBElement) jaxbUnmarshaller.unmarshal(file)).getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return aeat;
    }
    
    //메소드명: aeatToXml 
    //입력: Aeat 객체
    //출력: 입력받은 aeat객체를 마샬링한 문자열을 반환
    //부수효과: 없음
    public static String aeatToXml(AEATType aeat) {
        String result = "";
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AEATType.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //AEATType 객체를 "path" 경로에 파일로 저장
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(aeat, stringWriter);
            result = stringWriter.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    //메소드명: goToAeatFromSender
    //입력: 없음
    //출력: 입력창에 있는 문자열을 언마샬링하여 Aeat객체로 반환
    //부수효과: 없음
    private AEATType goToAeatFromSender(){
        AEATType aeat = null;
        try {
            String content = frame.getMesaagePanel();
            JAXBContext jaxbContext = JAXBContext.newInstance(AEATType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            //XML 문자열로부터 AEATTYPE 객체 반환
            StringReader reader = new StringReader(content);
            aeat = (AEATType) ((JAXBElement) jaxbUnmarshaller.unmarshal(reader)).getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return aeat;
    }
    
    //메소드명: goToAeatFromReceiver
    //입력: 없음
    //출력: 수신창에 있는 문자열을 언마샬링하여 Aeat객체로 반환
    //부수효과: 없음
    private AEATType goToAeatFromReceiver(){
        AEATType aeat = null;
        try {
            String content = frame.getReceivePanel();
            JAXBContext jaxbContext = JAXBContext.newInstance(AEATType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            //XML 문자열로부터 AEATTYPE 객체 반환
            StringReader reader = new StringReader(content);
            aeat = (AEATType) ((JAXBElement) jaxbUnmarshaller.unmarshal(reader)).getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return aeat;
    }
    
    //메소드명: onClickedGoToAeat1
    //입력: 없음
    //출력: 없음
    //부수효과: 입력창에 있는 문자열을 Aeat편집기로 전달하기 위해 버튼 클릭시 수행
    public void onClickedGoToAeat1(){
        frame.loadAeat(this.goToAeatFromSender());
        frame.clearMessagePanel();
    }
    
    //메소드명: onClickedGoToAeat2
    //입력: 없음
    //출력: 없음
    //부수효과: 수신창에 있는 문자열을 Aeat편집기로 전달하기 위해 버튼 클릭시 수행 
    public void onClickedGoToAeat2(){
        frame.loadAeat(this.goToAeatFromReceiver());
        frame.clearReceivePanel();
    }
    
    //메소드명: onClickedLoadButton
    //입력: 없음
    //출력: 없음
    //부수효과: 지정된 경로에 있는 파일을 언마샬링하여 Aeat편집기로 불러옴
    public void onClickedLoadButton() {
        //String path = AEAT_SAMPLE;
        String path = "xml/";
        path = path+(frame.getTitleToLoad());
        frame.loadAeat(this.aeatUnmarshalling(path));
        System.out.println("Load xml from: " + path);
    }

    //메소드명: onClickedSaveButton
    //입력: 없음
    //출력: 없음
    //부수효과: Aeat편집기에 있는 내용을 마샬링하여 지정된 경로에 저장함
    public void onClickedSaveButton() {
        //String path = AEAT_OUTPUT;
        String path = "xml/";
        path = path+(frame.getTitleToSave());
        this.aeatMarshalling(frame.getAeat(), path);
        System.out.println("Save xml to: " + path);
        frame.refresh();
    }
    
    //메소드명: onClickedxmlClearButton
    //입력: 없음
    //출력: 없음
    //부수효과: Aeat편집기의 내용을 비움
    public void onClickedxmlClearButton(){
        frame.clear();
    }

    //메소드명: onClickedClearButton
    //입력: 없음
    //출력: 없음
    //부수효과: 입력창에 있는 내용을 비움
    public void onClickedClearButton() {
        frame.clearMessagePanel();
    }
    
    //메소드명: onClickedClearReceiverButton
    //입력: 없음
    //출력: 없음
    //부수효과: 수신창에 있는 내용을 비움
    public void onClickedClearReceiverButton() {
        frame.clearReceivePanel();
    }
    
    //메소드명: onClickedSendButton
    //입력: 없음
    //출력: 없음
    //부수효과: 입력창에 있는 내용을 activeMQ를 통해 송신함
    public void onClickedSendButton(){
        frame.sendMessagePanel(); 
    }
    
    //메소드명: onClickedReceiveButton
    //입력: 없음
    //출력: 없음
    //부수효과: activeMQ를 통해 메세지를 수신함
    public void onClickedReceiveButton(){
        frame.receiveMessagePanel();
    }

    //메소드명: onClickedSendButton
    //입력: 없음
    //출력: 없음
    //부수효과: 입력창에 있는 내용을 activeMQ를 통해 송신함
    public void onClickedMultiSendButton(){
        frame.sendMultiMessagePanel(); 
    }
    
    //메소드명: onClickedReceiveButton
    //입력: 없음
    //출력: 없음
    //부수효과: activeMQ를 통해 메세지를 수신함
    public void onClickedMultiReceiveButton(){
        frame.receiveMultiMessagePanel();
    }
    
    //메소드명: onClickedConfigDestination
    //입력: 없음
    //출력: 없음
    //부수효과: Destination을 설정하기 위한 버튼
    public void onClickedConfigDestination(){
        
        frame.configDestination();
    }
    
    //메소드명: onClickedConfigBroker
    //입력: 없음
    //출력: 없음
    //부수효과: Broker를 설정하기 위한 버튼
    public void onClickedConfigBroker(){
        frame.configBroker();
    }
    
    //메소드명: onClickedConfigDestinationForChat
    //입력: 없음
    //출력: 없음
    //부수효과: Destination을 설정하기 위한 버튼
    public void onClickedConfigDestinationOther(){
        
        frame.configDestinationOther();
    }
    
    //메소드명: onClickedConfigBroker
    //입력: 없음
    //출력: 없음
    //부수효과: Broker를 설정하기 위한 버튼
    public void onClickedConfigBrokerOther(){
        frame.configBrokerOther();
    }

}
