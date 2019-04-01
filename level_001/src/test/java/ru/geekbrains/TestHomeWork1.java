package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork1 {
    @Test
    public void test2() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task2(4, 16, 2, 1), is(72));
    }
}
