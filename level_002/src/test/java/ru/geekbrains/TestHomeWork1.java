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
        Team team = new Team("Команда!");
        Random rand = new Random();
        int[] pause = new int[5];
        int index = 0;
        for (int i = 0; i < 5; i++) {
            pause [i] = rand.nextInt(25);
            index += pause [i];
        }
        team.decUnit(index);
        int[] unit = team.getUnit();
        assertThat(team.getUnit(), is(unit));
    }

    @Test
    public void testCourse() {
        Team team = new Team("Команда!");
        Course course = new Course();
        course.start(team);
        int[] unit = team.getUnit();
        assertThat(team.getUnit(), is(unit));
    }

    @Test
    public void testHomeWork() {
        HomeWork1 homework = new HomeWork1();
        int[] unit = homework.getUnit();
        assertThat(homework.getUnit(), is(unit));
    }
}