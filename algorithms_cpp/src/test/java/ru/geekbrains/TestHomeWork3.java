package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork3 {
    @Test
    public void testTask1() {
        HomeWork3 homework = new HomeWork3();
        int[] arr = {1, 4, 7, 0, 2, 5, 8, 3, 6, 9};
        int[] res = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(homework.task1(arr), is(res));
    }
    @Test
    public void testTask2() {
        HomeWork3 homework = new HomeWork3();
        int[] arr = {1, 4, 7, 0, 2, 5, 8, 3, 6, 9};
        int[] res = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(homework.task2(arr), is(res));
    }
    @Test
    public void testTask3() {
        HomeWork3 homework = new HomeWork3();
        int[] arr = {1, 4, 7, 0, 2, 5, 8, 3, 6, 9};
        assertThat(homework.task3(arr, 0, arr.length - 1, 9), is(9));
        assertThat(homework.task3(arr, 0, arr.length - 1, 13), is(-1));
    }
}