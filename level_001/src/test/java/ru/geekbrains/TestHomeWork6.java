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
        Hund biest = new Hund();
        assertThat(biest.rennenBln(300), is(true));
        assertThat(biest.rennenBln(700), is(false));
        assertThat(biest.hupfenBln(0.3f), is(true));
        assertThat(biest.hupfenBln(0.7f), is(false));
        assertThat(biest.schwimmenBln(9), is(true));
        assertThat(biest.schwimmenBln(11), is(false));
    }
    @Test
    public void testKater() {
        Kater biest = new Kater();
        assertThat(biest.rennenBln(150), is(true));
        assertThat(biest.rennenBln(250), is(false));
        assertThat(biest.hupfenBln(1.6f), is(true));
        assertThat(biest.hupfenBln(2.1f), is(false));
        assertThat(biest.schwimmenBln(0), is(false));
    }
}
