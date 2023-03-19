import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class TestBun {
    private final String name = "TestBun";
    private final float price = 10;

    @Test
    public void getNameBun() {
        Bun bun = new Bun(name, price);
        assertEquals("Ошибка валидации", name, bun.getName());
    }

    @Test
    public void getPriceBun() {
        Bun bun = new Bun(name, price);
        assertEquals("Ошибка валидации", price, bun.getPrice(), 0);
    }
}
