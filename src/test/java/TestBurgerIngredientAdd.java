import org.junit.Test;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestBurgerIngredientAdd {
    Ingredient ingredientFilling = new Ingredient(IngredientType.FILLING, "Лук", 20F);
    Ingredient ingredientSauce = new Ingredient(IngredientType.SAUCE, "Цезарь", 30F);

    @Test
    public void testAddIngredient() {
        Burger burger = new Burger();
        burger.addIngredient(ingredientFilling);
        burger.addIngredient(ingredientSauce);
        assertEquals("Количество элементов не соответствует ожидаемому", burger.ingredients.size(), 2);
        assertTrue("Ошибка валидации элемента ingredientFilling", burger.ingredients.contains(ingredientFilling));
        assertTrue("Ошибка валидации элемента ingredientSauce", burger.ingredients.contains(ingredientSauce));
    }

}
