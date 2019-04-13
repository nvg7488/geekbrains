package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork5 {
    @Test
    public void testHomeWork() {
        HomeWork5 homework = new HomeWork5();
        homework.array();
        Person[] person = homework.getPerson();
        List<Person> result = new ArrayList<>();
        for (Person pers : person) {
            if (pers.getAge() >= 40) {
                result.add(pers);
            }
            pers.printPerson();
        }
        assertThat(homework.ages(40), is(result));
    }
}
