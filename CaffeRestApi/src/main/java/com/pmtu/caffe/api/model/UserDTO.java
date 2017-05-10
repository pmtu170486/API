package com.pmtu.caffe.api.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mr Tu on 11-05-2017.
 */
public class UserDTO implements Serializable{

    private Long id;
    private String username;
    private Long id_role=1L;
    private String role_name="admin";
    private String createdDate;
    private String modifiedDate;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, Long id_role, String role_name,
                   String createdDate, String modifiedDate) {
        this.id = id;
        this.username = username;
        this.id_role = id_role;
        this.role_name = role_name;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
    public UserDTO(Long id, String username, String createdDate, String modifiedDate) {
        this.id = id;
        this.username = username;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
