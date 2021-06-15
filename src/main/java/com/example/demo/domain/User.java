package com.example.demo.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    //TODO: nullable false
    @Column(length = 36 , columnDefinition = "varchar" , updatable = false )
    private UUID id ;

    private String username ;

    private String password ;

    private String role ;

    private String bank_id ;

    private String registeredBy ;

    @CreationTimestamp
    @Column
    private Timestamp createdDate ;

    @UpdateTimestamp
    private Timestamp lastModifiedDate;

}
