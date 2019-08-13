package tacos.data.jdbc;

import tacos.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
