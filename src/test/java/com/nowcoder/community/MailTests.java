package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)

public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testMail() {
        String to = "w680682022@163.com";
        mailClient.sendMail(to, "TEST0325", "JAVA nowcoder.");
    }

    @Test
    public void testHtmlMail() {
        String to = "w680682022@163.com";
        // 生成动态网页HTML
        Context context = new Context();
        context.setVariable("username", "7minus1");

        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        mailClient.sendMail(to, "TEST0326HTML", content);
    }
}
