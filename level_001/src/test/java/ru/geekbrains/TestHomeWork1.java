package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork1 {
    @Test
    public void test1() {
        HomeWork1 homework = new HomeWork1();
        homework.task1();
    }

    @Test
    public void test2() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task2(4, 16, 2, 1), is(72));
    }

    @Test
    public void test3() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task3(3, 6), is(false));
        assertThat(homework.task3(7, 8), is(true));
        assertThat(homework.task3(10, 11), is(false));
    }

    @Test
    public void test4() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task4(-1), is(false));
        assertThat(homework.task4(0), is(true));
        assertThat(homework.task4(1), is(true));
    }

    @Test
    public void test5() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task5(-1), is(true));
        assertThat(homework.task5(0), is(false));
        assertThat(homework.task5(1), is(false));
    }

    @Test
    public void test6() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task6("Николай"), is("Привет, Николай!"));
    }

    @Test
    public void test7() {
        HomeWork1 homework = new HomeWork1();
        assertThat(homework.task7(1900), is(false));
        assertThat(homework.task7(1980), is(true));
        assertThat(homework.task7(1984), is(true));
        assertThat(homework.task7(1990), is(false));
        assertThat(homework.task7(2000), is(true));
        assertThat(homework.task7(2016), is(true));
        assertThat(homework.task7(2100), is(false));
    }
}