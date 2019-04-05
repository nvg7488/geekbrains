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
    public void task03Test() {
        HomeWork1 homework = new HomeWork1();
        int[] array = new int[] {6, 9};
        int[] result = new int[] {9, 6};
        assertThat(homework.task03a(array), is(result));
    }

    @Test
    public void test04Test() {
        int result;
        HomeWork1 homework = new HomeWork1();
        result = homework.task04(1, 1, 1);
        assertThat(result, is(0));
        result = homework.task04(1, 0, 0);
        assertThat(result, is(1));
        assertThat(homework.getX1(), is(0F));
        result = homework.task04(1, 3, 2);
        assertThat(result, is(2));
        assertThat(homework.getX1(), is(-0.79289323F));
        assertThat(homework.getX2(), is(-2.2071068F));
    }

    @Test
    public void task12Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task12(1, 2, 3), is(3));
        assertThat(homework.task12(4, 6, 2), is(6));
        assertThat(homework.task12(9, 3, 6), is(9));
    }
}