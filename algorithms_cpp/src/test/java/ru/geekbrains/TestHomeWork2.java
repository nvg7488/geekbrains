package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork2 {
    @Test
    public void testTask1() {
        HomeWork2 homework = new HomeWork2();
        assertThat(homework.task1(1), is("1"));
    }
}
