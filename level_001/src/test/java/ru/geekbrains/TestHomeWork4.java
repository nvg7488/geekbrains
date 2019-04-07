package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork4 {
    @Test
    public void testPrintPole() {
        HomeWork4 homework = new HomeWork4();
        homework.size = 3;
        homework.map = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        homework.printPole();
    }
}