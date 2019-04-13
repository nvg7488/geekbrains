package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class HomeWork1 {
    private int[] unit;
    public int[] getUnit() {
        return unit;
    }

    public HomeWork1() {
        Course course = new Course();
        Team team = new Team("Команда!");
        course.start(team);
        unit = team.getUnit();
        for (int i = 0; i < 4; i++) {
            if (unit[i] > 0) {
                System.out.println("\t" + i + "-й");
            }
        }
    }
}