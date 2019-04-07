package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork2 {
    @Test
    public void test1() {
        HomeWork2 homework = new HomeWork2();
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] res = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        assertThat(homework.task1(arr), is(res));
    }
    @Test
    public void test2() {
        HomeWork2 homework = new HomeWork2();
        int[] result = {0, 3, 6, 9, 12, 15, 18, 21};
        assertThat(homework.task2(8), is(result));
    }
    @Test
    public void test3() {
        HomeWork2 homework = new HomeWork2();
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] res = {2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2};
        assertThat(homework.task3(arr), is(res));
    }
    @Test
    public void test4() {
        HomeWork2 homework = new HomeWork2();
        int[][] result = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertThat(homework.task4(3), is(result));
    }
    @Test
    public void test5() {
        HomeWork2 homework = new HomeWork2();
        int[] arr = {1, 5, 3, 2, 16, 4, 5, 2, 4, 8, 9, 0};
        int[] res = {0, 16};
        assertThat(homework.task5(arr), is(res));
    }
    @Test
    public void test6() {
        HomeWork2 homework = new HomeWork2();
        int[] array1 = {2, 2, 2, 1, 2, 2, 10, 1};
        assertThat(homework.task6(array1), is(true));
        int[] array2 = {1, 1, 3, 1, 3, 2, 3};
        assertThat(homework.task6(array2), is(false));
        int[] array3 = {1, 1, 3, 1, 4, 2};
        assertThat(homework.task6(array3), is(true));
    }
    @Test
    public void test7() {
        HomeWork2 homework = new HomeWork2();
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] res1 = {8, 9, 1, 1, 5, 3, 2, 11, 4, 5, 2, 4};
        assertThat(homework.task7(-3, array), is(res1));
        int[] res2 = {9, 1, 1, 5, 3, 2, 11, 4, 5, 2, 4, 8};
        assertThat(homework.task7(1, array), is(res2));
    }
}