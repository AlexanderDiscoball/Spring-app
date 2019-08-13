package tacos.data.jdbc;

import tacos.Taco;

public interface TacoRepository {
    Taco save(Taco taco);
}
