package tacos;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
//JPA
@Entity
public class Taco {
    //JPA
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Date createdAt;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    //JPA
    @ManyToMany(targetEntity=Ingredient.class)
    @NotNull
    @Size(min = 2, message = "Два ингредиента минимум")
    private List<Ingredient> ingredients;

    //JPA
    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }
}