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
        msg.setSubject("Welcome to GEDARATAMA The Passion of Shopping");
        msg.setText("Congratulations!!!\n" +
                "Your Request to Join with Gedaratama has been Approved.\n" +
                "\n" +
                "Now it's time for Success with the Passion of shopping in 21st Century!!!\n" +
                "We team Gedaratama are enthusiastic to help you and we wish you good luck in your business!!!\n" +
                "For any Clarifications, Feel Free to contact the team!!!\n"+"\n"+"Best regards");

        javaMailSender.send(msg);

    }
}
