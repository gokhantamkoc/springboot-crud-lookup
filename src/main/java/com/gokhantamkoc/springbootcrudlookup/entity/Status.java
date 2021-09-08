package org.kodluyoruz.springbootcrudlookup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "status")
@Data
@NoArgsConstructor
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description", nullable = false, unique = true)
    private String description;
}
