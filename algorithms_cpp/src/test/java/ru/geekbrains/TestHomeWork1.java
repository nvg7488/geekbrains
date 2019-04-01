package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork1 {
    @Test
    public void task01Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task01(68, (float) 1.72), is(22.985397F));
    }

    @Test
    public void task02Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task02(1, 2, 3, 4), is(4));
        assertThat(homework.task02(8, 6, 4, 2), is(8));
    }
}