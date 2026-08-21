package mk.ukim.finki.wp.june2025g1.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Founder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(length = 35)
    private String email;

    public Founder(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
