package utils.helpers;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * SendEmail - Send Email from Gmail via SSL
 */
public class SendEmail {
    private static final SimpleDateFormat testDate = new SimpleDateFormat("dd-MM-yyyy hh:mm");

    private static final String HOST = "imap.gmail.com";
    private static final String USERNAME = "FlexShopperAutomation@gmail.com";
    private static final String PASSWORD = "tstcqpyzcqsajfeg";

    private static final String EMAIL_FROM = "FlexShopperAutomation@gmail.com";
    private static final String EMAIL_TO = "antonio.navas@flexshopper.com, antonio_navas40@hotmail.com";
    private static final String EMAIL_TO_CC = "";

    private static final String EMAIL_SUBJECT = "Test Automation Results: " + testDate;
    private static final String EMAIL_TEXT = "Test Automation results attached";

    public static void main(String[] args) throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.imap.host", HOST);
        properties.put("mail.imap.port", "993");
        properties.put("mail.imap.starttls.enable", "true");
        properties.setProperty("mail.imap.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.imap.socketFactory.fallback", "false");
        properties.setProperty("mail.imap.socketFactory.port", String.valueOf(993));
        Session emailSession = Session.getDefaultInstance(properties);

        //create the IMAP store object and connect with the IMAP server
        Store store = emailSession.getStore("imap");

        store.connect(HOST, USERNAME, PASSWORD);

        //create the folder object and open it
        Folder emailFolder = store.getFolder("INBOX");
        emailFolder.open(Folder.READ_WRITE);

        try {
            Message message = new MimeMessage(emailSession);
            message.setFrom(new InternetAddress(EMAIL_FROM));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(EMAIL_TO));
            message.setSubject(EMAIL_SUBJECT);
            message.setText(EMAIL_TEXT);

            MimeBodyPart messageBodyPart = new MimeBodyPart();

            Multipart multipart = new MimeMultipart();

            String file = System.getProperty("user.dir") + "/target/cucumber-reports";
            String fileName = "cucumberTestReport.html";
            DataSource source = new FileDataSource(file);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            System.out.println("Sending");

            Transport.send(message);

            System.out.println("Done");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
