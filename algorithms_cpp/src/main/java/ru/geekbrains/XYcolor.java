package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class XYcolor {
    private int xy;
    private int y;
    private boolean color;

    public XYcolor(int x, int y) {
        this.xy = x + y;
        this.xy %= 2;
        if (this.xy == 0) {
            this.color = true;
        } else {
            this.color = false;
        }
    }

    public boolean getColor() {
        return this.color;
    }
}
