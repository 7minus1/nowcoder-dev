package com.nowcoder.community;


import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTests {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter() {
        String text = "这里可以dance。。。。。sbasgesbt不能";
        text = sensitiveFilter.filter(text);
        System.out.println(text);

        text = "这里可以dan☆ce。。。。。sbasge☆s☆b☆t不能☆,哈哈哈!";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
