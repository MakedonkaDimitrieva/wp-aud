package mk.ukim.finki.wpaud.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 4000)
    private String description;

    public Category(String name, String description) {
        this.id = (long)(Math.random() * 1000);
        this.name = name;
        this.description = description;
    }

    public Category() {
    }
}
