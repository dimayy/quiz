package com.shopify.org.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Data
@EqualsAndHashCode(callSuper = true, of = {})
public class User extends BaseProjectEntity {

    @Column private String firstName;
    @Column private String lastName;
    @Column private String email;

}


