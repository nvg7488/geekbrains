package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
//import java.util.ArrayList;
//import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TestHomeWork6 {
    @Test
    public void testHund() {
        Hund hund = new Hund();
//        this.rennen = 500;
//        this.hupfen = 0.5f;
//        this.schwimmen = 10;
        assertThat(hund.rennenBln(300), is(true));
        assertThat(hund.rennenBln(700), is(false));
        assertThat(hund.hupfenBln(0.3f), is(true));
        assertThat(hund.hupfenBln(0.7f), is(false));
        assertThat(hund.schwimmenBln(9), is(true));
        assertThat(hund.schwimmenBln(11), is(false));
    }
}
