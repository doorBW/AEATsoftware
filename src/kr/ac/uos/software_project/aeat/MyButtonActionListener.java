/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kr.ac.uos.software_project.aeat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comkeen
 */
public class MyButtonActionListener implements ActionListener {

    private Publisher publisher;
    public MyButtonActionListener(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Load":
                publisher.onClickedLoadButton();
                break;
            case "Save":
                publisher.onClickedSaveButton();
                break;
            case "Clear":
                publisher.onClickedxmlClearButton();
                break;
            case "메세지 보내기창 비우기": //메세지를 보내기위한 입력창을 비우는 기능
                publisher.onClickedClearButton();
                break;
            case "메세지 받기창 비우기": //메세지를 받기위한 수신창을 비우는 기능
                publisher.onClickedClearReceiverButton();
                break;
            case "메세지 보내기":// 메세지 보내기 기능
                publisher.onClickedSendButton();
                break;
            case "메세지 보내기(멀티)":// 메세지 보내기 기능
                publisher.onClickedMultiSendButton();
                break;
            case "메세지 받기":// 메세지 받기 기능
                publisher.onClickedReceiveButton();
                break;
            case "메세지 받기(멀티)":// 메세지 받기 기능
                publisher.onClickedMultiReceiveButton();
                break;
            case "AEAT편집기로 보내기1":// 입력창에 있는 내용을 unmashalling하여 AEAT편집기로 보낸다.
                publisher.onClickedGoToAeat1();
                break;
            case "AEAT편집기로 보내기2":// 수신창에 있는 내용을 unmashalling하여 AEAT편집기로 보낸다.
                publisher.onClickedGoToAeat2();
                break;
            case "Destination 설정":// 설정 창에서 Destination을 설정하는 기능
                publisher.onClickedConfigDestination();
                break;
            case "Broker 설정":// 설정 창에서 Broker를 설정하는 기능
                publisher.onClickedConfigBroker();
                break;
            case "상대 Destination":
                publisher.onClickedConfigDestinationOther();
                break;
            case "상대 Broker":
                publisher.onClickedConfigBrokerOther();
                break;
            default:
                break;
        }
    }
}
