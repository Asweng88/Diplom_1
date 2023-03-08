import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class TestBurgerGetReceipt {
    Burger burger = new Burger();


    @Mock
    Bun bun;

    @Before
    public void addIngredient() {
        burger.setBuns(bun);
        burger.addIngredient(new Ingredient(SAUCE, "Цезарь", 30F));
    }


    @Test
    public void testSetBuns() {
        Mockito.when(bun.getName()).thenReturn("Булка");
        assertTrue("Ошибка валидации", burger.getReceipt().contains("Булка"));
        assertTrue("Ошибка валидации", burger.getReceipt().contains("Цезарь"));
        assertTrue("Ошибка валидации", burger.getReceipt().contains("30"));
    }
}
