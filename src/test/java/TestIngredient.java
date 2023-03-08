import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestIngredient {

    private final IngredientType type;
    private final String name;
    private final float price;

    public TestIngredient(IngredientType type, String name, float price){
        this.type=type;
        this.name=name;
        this.price=price;
    }

    @Parameterized.Parameters
    public static Object[][] value() {
        //Сгенерируй тестовые данные
        return new Object[][] {
                {IngredientType.FILLING, "Лук", 10},
                {IngredientType.SAUCE, "Цезарь", 20},
        };
    }

    @Test
    public void getPriceTestIngredient() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ошибка валидации", name, ingredient.getName());
    }

    @Test
    public void getPriceIngredient() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ошибка валидации", price, ingredient.getPrice(), 0);
    }

    @Test
    public void getTypeIngredient() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ошибка валидации", type, ingredient.getType());
    }

}
