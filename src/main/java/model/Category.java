package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "category_id_sequence"
    )
    @SequenceGenerator(name = "category_id_sequence",
            sequenceName = "category_id_sequence", allocationSize = 1)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "categories")
    private List<CV> cvList;

    public Category() {
    }

    public List<CV> getCvList() {
        return cvList;
    }

    public void setCvList(List<CV> categoriesList) {
        categoriesList = categoriesList;
    }

    public Category(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}