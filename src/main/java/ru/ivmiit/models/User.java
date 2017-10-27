package ru.ivmiit.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "owner")
    private List<Auto> autos;
}
