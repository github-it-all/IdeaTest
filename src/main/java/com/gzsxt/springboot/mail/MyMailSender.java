package com.gzsxt.springboot.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMailSender {
    @Autowired
    private MailSender mailSender;

    public void say(){
        //第一步：构建消息
        SimpleMailMessage message=new SimpleMailMessage();
        //主题
        message.setSubject("主题：很高兴遇见你");
        //谁发的
        message.setFrom("3569586484@qq.com");
        //发送给谁
        message.setTo("2245137172@qq.com");
        //发送内容
        message.setText("肚子饿了");
        //发送时间
        message.setSentDate(new Date());
        //第二步：发送
        mailSender.send(message);
    }
}
