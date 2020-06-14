package com.example.springboot;

import com.example.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * springboot单元测试
 * 可以在测试期间很方便的类似编码一样的进行自动注入等容器功能
 */
@SpringBootTest
class Springboot01helloworldquickApplicationTests {

    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
