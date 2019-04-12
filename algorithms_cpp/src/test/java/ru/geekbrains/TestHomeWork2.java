package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.LinkedList;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork2 {
    @Test
    public void testTask1desc0() {
        HomeWork2 homework = new HomeWork2();
        LinkedList result = new LinkedList();
        result.add(0);
        assertThat(homework.task1(0), is(result));
    }
    @Test
    public void testTask1desc1() {
        HomeWork2 homework = new HomeWork2();
        LinkedList result = new LinkedList();
        result.add(1);
        assertThat(homework.task1(1), is(result));
    }
    @Test
    public void testTask1desc2() {
        HomeWork2 homework = new HomeWork2();
        LinkedList result = new LinkedList();
        result.add(0);
        result.add(1);
        assertThat(homework.task1(2), is(result));
    }
    @Test
    public void testTask1desc3() {
        HomeWork2 homework = new HomeWork2();
        LinkedList result = new LinkedList();
        result.add(1);
        result.add(1);
        assertThat(homework.task1(3), is(result));
    }
    @Test
    public void testTask1desc4() {
        HomeWork2 homework = new HomeWork2();
        LinkedList result = new LinkedList();
        result.add(0);
        result.add(0);
        result.add(1);
        assertThat(homework.task1(4), is(result));
    }
    @Test
    public void testTask1desc5() {
        HomeWork2 homework = new HomeWork2();
        LinkedList result = new LinkedList();
        result.add(1);
        result.add(0);
        result.add(1);
        assertThat(homework.task1(5), is(result));
    }

    @Test
    public void testTask2() {
        HomeWork2 homework = new HomeWork2();

        assertThat(homework.task2a(2, 2), is(4));
        assertThat(homework.task2a(3, 3), is(27));

        assertThat(homework.task2b(2, 2), is(4));
        assertThat(homework.task2b(3, 3), is(27));

        assertThat(homework.task2c(2, 2), is(4));
        assertThat(homework.task2c(3, 3), is(27));
    }

    @Test
    public void test3() {
        HomeWork2 homework = new HomeWork2();
        homework.task3b(3);
        assertThat(homework.getKol(), is(18));
    }
}