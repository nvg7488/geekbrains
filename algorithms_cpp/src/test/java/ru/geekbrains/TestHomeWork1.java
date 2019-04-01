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

    @Test
    public void task12Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task12(1, 2, 3), is(3));
        assertThat(homework.task12(4, 6, 2), is(6));
        assertThat(homework.task12(9, 3, 6), is(9));
    }
}