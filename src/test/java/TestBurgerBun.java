import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;

import static org.junit.Assert.*;

public class TestBurgerBun {
    private final Bun bun = new Bun("TestBun", 10F);

    @Test
    public void testSetBuns() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        assertEquals("Ошибка валидации", bun, burger.bun);
    }
}
