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
}
