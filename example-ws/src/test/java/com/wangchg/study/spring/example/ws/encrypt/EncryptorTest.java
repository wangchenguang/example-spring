package com.wangchg.study.spring.example.ws.encrypt;

import com.wangchg.study.spring.example.ws.BaseTest;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2019/2/25
 */
public class EncryptorTest extends BaseTest {
    @Autowired
    StringEncryptor stringEncryptor;

    @Test
    public void test() {
        String result = stringEncryptor.encrypt("");
        System.out.println(result);
    }
}
