import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class TestBurgerBun {
    private final Bun bun = new Bun("TestBun", 10F);

    @Test
    public void testSetBuns() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        assertEquals("Ошибка валидации", burger.bun, bun);
    }
}
