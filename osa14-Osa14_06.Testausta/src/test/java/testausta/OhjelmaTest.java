package testausta;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class OhjelmaTest {

    // toteuta tänne testit luokkaa Ohjelma-varten
    @Test
    public void testaaSuorita() {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Pulloja: " + 6 + "\nOppilaita: " + 3 + "\nKeskiarvo: " + 2.0, Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")));
    }

    @Test
    public void keskiarvoLasketaanOikein() {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Pulloja: " + 6 + "\nOppilaita: " + 3 + "\nKeskiarvo: " + 2.0, Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")));

        String input2 = "2";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in2);
        assertEquals("Pulloja: " + 1 + "\nOppilaita: " + 2 + "\nKeskiarvo: " + 0.5, Ohjelma.suorita(new Scanner("1\n-1\n")));

        String input3 = "2";
        InputStream in3 = new ByteArrayInputStream(input3.getBytes());
        System.setIn(in3);
        assertEquals("Pulloja: " + 8 + "\nOppilaita: " + 2 + "\nKeskiarvo: " + 4.0, Ohjelma.suorita(new Scanner("8\n-1\n")));
    }

    @Test
    public void keskiarvoaEiLasketaKunPullojaNolla() {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Pulloja: " + 0 + "\nOppilaita: " + 3 + "\nKeskiarvoa ei voida laskea", Ohjelma.suorita(new Scanner("-3\n-2\n-1\n-1\n")));
    }

    @Test
    public void keskiarvoaEiLasketaKunPoimijoitaNolla() {
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Pulloja: " + 3 + "\nOppilaita: " + 0 + "\nKeskiarvoa ei voida laskea", Ohjelma.suorita(new Scanner("3\n-2\n-1\n-1\n")));
    }
}
