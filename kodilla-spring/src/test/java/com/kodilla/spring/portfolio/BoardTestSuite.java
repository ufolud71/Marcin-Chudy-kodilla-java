package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        boolean addTask1 = board.getDoneList().addTask("Done task 1");
        boolean addTask2 = board.getInProgressList().addTask("In progress task 2");
        boolean addTask3 = board.getToDoList().addTask("To do task 3");

        Assert.assertTrue(addTask1);
        Assert.assertTrue(addTask2);
        Assert.assertTrue(addTask3);
        Assert.assertEquals("Done task 1", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("In progress task 2", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("To do task 3", board.getToDoList().getTasks().get(0));
    }
}