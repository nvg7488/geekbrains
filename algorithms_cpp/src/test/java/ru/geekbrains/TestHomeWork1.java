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
    public void test05Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task05(1), is("Зима"));
        assertThat(homework.task05(2), is("Зима"));
        assertThat(homework.task05(3), is("Весна"));
        assertThat(homework.task05(4), is("Весна"));
        assertThat(homework.task05(5), is("Весна"));
        assertThat(homework.task05(6), is("Лето"));
        assertThat(homework.task05(7), is("Лето"));
        assertThat(homework.task05(8), is("Лето"));
        assertThat(homework.task05(9), is("Осень"));
        assertThat(homework.task05(10), is("Осень"));
        assertThat(homework.task05(11), is("Осень"));
        assertThat(homework.task05(12), is("Зима"));
    }

    @Test
    public void test06Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task06(1), is("год"));
        assertThat(homework.task06(2), is("года"));
        assertThat(homework.task06(5), is("лет"));
        assertThat(homework.task06(10), is("лет"));
    }

    @Test
    public void test07Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task07(0, 0, 1, 1), is(true));
        assertThat(homework.task07(0, 1, 1, 0), is(true));
        assertThat(homework.task07(0, 0, 0, 1), is(false));
        assertThat(homework.task07(0, 0, 1, 0), is(false));
    }

    @Test
    public void test08Test() {
        HomeWork1 homework = new HomeWork1();
        int[][] result = {{1, 4, 9}, {1, 8, 27}};
        assertThat(homework.task08(1, 3), is(result));
    }

    @Test
    public void test09Test() {
        HomeWork1 homework = new HomeWork1();
        int result = homework.task09(9, 2);
        assertThat(result, is(4));
        assertThat(homework.getDev(), is(1));
    }

    @Test
    public void test10Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task10(456), is(true));
        assertThat(homework.task10(468), is(false));
    }

    @Test
    public void test11Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task11(), is(homework.getDev()));
    }

    @Test
    public void task12Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task12(1, 2, 3), is(3));
        assertThat(homework.task12(4, 6, 2), is(6));
        assertThat(homework.task12(9, 3, 6), is(9));
    }

    @Test
    public void test13Test() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task13(), is(homework.random));
    }
}