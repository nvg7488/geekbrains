package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork7 {
    @Test
    public void testPlate() {
        Plate plate = new Plate(9);
        assertThat(plate.getFood(), is(9));
        plate.incFood(7);
        assertThat(plate.getFood(), is(16));
    }
    @Test
    public void testGesattigt() {
        HomeWork7 homework = new HomeWork7();
        homework.init();
        assertThat(homework.gesattigt(), is(6));
    }
    @Test
    public void testHungrig() {
        HomeWork7 homework = new HomeWork7();
        homework.init();
        assertThat(homework.hungrig(), is(3));
    }
}
