package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class Biest {
    protected int rennen;       //  бежать
    protected int schwimmen;    //  плыть
    protected float hupfen;     //  прыгать

    public boolean rennenBln(int m) {
        boolean result = false;
        if (m < this.rennen) {
            result = true;
        }
        return result;
    }
    public boolean hupfenBln(float m) {
        boolean result = false;
        if (m < this.hupfen) {
            result = true;
        }
        return result;
    }
    public boolean schwimmenBln(int m) {
        boolean result = false;
        if (m < this.schwimmen) {
            result = true;
        }
        return result;
    }
}