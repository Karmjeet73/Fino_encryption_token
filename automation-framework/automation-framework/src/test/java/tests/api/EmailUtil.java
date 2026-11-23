//package tests.api;
//
//
//
//import jakarta.mail.*;
//import jakarta.mail.internet.InternetAddress;
//import jakarta.mail.internet.MimeMessage;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.Properties;
//
//public class EmailUtil {
//
//    private static final Logger log = LoggerFactory.getLogger(EmailUtil.class);
//
//    private static final String SMTP_HOST = "smtp.gmail.com";
//    private static final String SMTP_PORT = "587";
//    private static final String FROM_EMAIL = "gadgetmor13@gmail.com";
//    private static final String FROM_PASSWORD = "Swift@1998"; // use an App Password, not your real password
//    private static final String TO_EMAIL = "karmjeetmor73@gmail.com";
//
//    public static void sendFailureEmail(String subject, String body) {
//        try {
//            Properties props = new Properties();
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp.host", SMTP_HOST);
//            props.put("mail.smtp.port", SMTP_PORT);
//
//            Session session = Session.getInstance(props, new Authenticator() {
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication(FROM_EMAIL, FROM_PASSWORD);
//                }
//            });
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(FROM_EMAIL));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(TO_EMAIL));
//            message.setSubject(subject);
//            message.setText(body);
//
//            Transport.send(message);
//
//            log.info("Failure alert email sent successfully to {}", TO_EMAIL);
//
//        } catch (Exception e) {
//            log.error("Failed to send failure alert email", e);
//        }
//    }
//}
