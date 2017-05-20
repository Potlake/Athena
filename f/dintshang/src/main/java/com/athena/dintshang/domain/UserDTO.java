package com.athena.dintshang.domain;

/**
 * Created by siphokazi on 2017/05/20.
 */
public class UserDTO {


    protected Long id;
    private String name;
    Long roleId;
    String email;
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
