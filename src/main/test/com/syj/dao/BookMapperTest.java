package com.syj.dao;

import com.syj.pojo.Books;
import com.syj.service.BookService;
import com.syj.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BookMapperTest {
    @Test
    public void testQueryAllBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        System.out.println(bookServiceImpl.queryAllBook());
    }
}
