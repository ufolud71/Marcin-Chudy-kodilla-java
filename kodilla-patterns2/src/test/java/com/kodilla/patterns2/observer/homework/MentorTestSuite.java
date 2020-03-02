package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {

    @Test
    public void testUpdateQueue() {
        //Given
        SchredderHomework schredderHomework = new SchredderHomework();
        TrombaHomework trombaHomework = new TrombaHomework();
        PsikutaHomework psikutaHomework = new PsikutaHomework();
        Mentor aldonaDereń = new Mentor("Aldona Dereń");
        Mentor halinaJajo = new Mentor("Halina Jajo");
        schredderHomework.registerMentor(aldonaDereń);
        schredderHomework.registerMentor(halinaJajo);
        trombaHomework.registerMentor(aldonaDereń);
        psikutaHomework.registerMentor(halinaJajo);

        //When
        schredderHomework.addHomework("Kolejki z zadaniami do sprawdzenia");
        trombaHomework.addHomework("Dekorujemy pizzę");
        trombaHomework.addHomework("Pierwszy test jednostkowy");
        psikutaHomework.addHomework("Mockujemy forum dyskusyjne");
        schredderHomework.addHomework("Obliczamy średnią, funkcyjnie :)");
        trombaHomework.addHomework("Kalkulator z wyświetlaczem ");

        //Then
        assertEquals(5, aldonaDereń.getUpdateCount());
        assertEquals(3, halinaJajo.getUpdateCount());

    }
}
