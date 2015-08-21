package com.iTree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * Menu entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="menu"
    ,catalog="itreetest"
)

public class Menu  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer pid;
     private String menuName;
     private String menuUrl;
     private Integer menuStatus;


    // Constructors

    /** default constructor */
    public Menu() {
    }

    
    /** full constructor */
    public Menu(Integer pid, String menuName, String menuUrl, Integer menuStatus) {
        this.pid = pid;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuStatus = menuStatus;
    }

   
    // Property accessors
    @GenericGenerator(name="generator", strategy="increment")@Id @GeneratedValue(generator="generator")
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="pid", nullable=false)

    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    
    @Column(name="menu_name", nullable=false, length=200)

    public String getMenuName() {
        return this.menuName;
    }
    
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    @Column(name="menu_url", nullable=false, length=8)

    public String getMenuUrl() {
        return this.menuUrl;
    }
    
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
    
    @Column(name="menu_status", nullable=false)

    public Integer getMenuStatus() {
        return this.menuStatus;
    }
    
    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }
   








}