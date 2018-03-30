package ru.schepin.e_mail;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;

import java.io.IOException;
import java.util.Properties;

public class E_mail {
    public static void main(String[] args) throws IOException {
        final Properties properties = new Properties();
        properties.load(E_mail.class.getClassLoader().getResourceAsStream("mail.properties"));
        Session mailSession = Session.getDefaultInstance(properties);
        MIMEMessage mimeMessage = new MIMEMessage(mailSession);
        mailSession.s
    }
}
