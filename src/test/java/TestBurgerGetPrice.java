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
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class TestBurgerGetPrice {
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
        Mockito.when(bun.getPrice()).thenReturn(10F);
        assertEquals("Ошибка валидации", burger.getPrice(), 50,0);
    }
}
