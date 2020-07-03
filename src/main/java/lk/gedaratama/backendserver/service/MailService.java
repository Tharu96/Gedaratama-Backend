package lk.gedaratama.backendserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author Sashini Tharuka on 7/3/2020.
 */
@Service
public class MailService {


    @Autowired
    private JavaMailSender javaMailSender;

    void sendEmail(String email){

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(email);
        msg.setFrom("lkgedaratama@gmail.com");
        msg.setSubject("Welcome to GEDARATAMA Home Delivery");
        msg.setText("Your Shop succefully registerd in Gedaratama.");

        javaMailSender.send(msg);

    }
}
