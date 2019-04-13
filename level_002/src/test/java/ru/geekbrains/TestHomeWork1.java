package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.Random;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork1 {
    @Test
    public void testTeam() {
        Team team = new Team("Команда");
        Random rand = new Random();
        int[] pause = new int[5];
        int index = 0;
        for (int i = 0; i < 5; i++) {
            pause [i] = rand.nextInt(25);
            index += pause [i];
        }
        team.decUnit(index);
        int[] unit = team.getUnit();
        for (int i = 0; i < 4; i++) {
            if (unit[i] > 0) {
                System.out.println("\t" + i + "-й");
            }
        }
        assertThat(team.getUnit(), is(unit));
    }
}