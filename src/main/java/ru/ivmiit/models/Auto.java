package ru.ivmiit.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString

public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String model;
    private String color;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    // колонки в БД нет
    @Transient
    private Long ownerId;
}
