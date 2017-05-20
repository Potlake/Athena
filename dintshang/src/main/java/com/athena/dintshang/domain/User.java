package com.athena.dintshang.domain;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by siphokazi on 2017/05/20.
 */
/*@Entity
@Table(name = "userapp", schema = "public")*/
public class User {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)*/
    protected Long id;

    //@Column(name="username", nullable = false, length = 100)
    private String name;

    //@Column(name="user_password", nullable = false, length = 50)
    private String password;

   // @Column(name="role_id", length = 2)
    Long roleId;

   // @Column(name="email", length = 50, nullable = false)
    String email;

   // @Column(name="cell", length = 10)
    String cellNumber;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name_){
        name = name_;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword( String password_){
        password = password_;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email_){
        email = email_;
    }

    public Long getRoleId(){
        return roleId;
    }
    public  void setRoleId( Long id_){
        roleId = id_;
    }

    public String getCellNumber(){
        return cellNumber;
    }
    public void setCellNumber(String cell_){
        cellNumber = cell_;
    }


}
