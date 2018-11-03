package provider.domain;


import lombok.Getter;

import javax.persistence.*;


import java.math.BigDecimal;

@Entity
@Getter
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private BigDecimal balance;

}
