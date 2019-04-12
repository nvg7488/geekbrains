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
    @Test
    public void testXY() {
        HomeWork4 homework = new HomeWork4();
        homework.size = 3;
        homework.map = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        assertThat(homework.xy(-1, 1), is(false));
        assertThat(homework.xy(3, 1), is(false));
        assertThat(homework.xy(1, 1), is(true));
        assertThat(homework.xy(1, 3), is(false));
        assertThat(homework.xy(1, -1), is(false));
        homework.map = new char[][]{{'*', '*', '*'}, {'*', '!', '*'}, {'*', '*', '*'}};
        assertThat(homework.xy(1, 1), is(false));
    }
    @Test
    public void testDgn() {
        HomeWork4 homework = new HomeWork4();
        homework.size = 5;
        homework.map = new char[][]{
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };
        for (int x = 0; x <= 1; x++) {
            for (int y = 0; y <= 1; y++) {
                assertThat(homework.dgnDots(x, y, 1, '*'), is(true));
            }
        }
        for (int x = 3; x < 5; x++) {
            for (int y = 0; y <= 1; y++) {
                assertThat(homework.dgnDots(x, y, -1, '*'), is(true));
            }
        }
        assertThat(homework.dgnDots(0, 0, 1, '!'), is(false));
    }
}