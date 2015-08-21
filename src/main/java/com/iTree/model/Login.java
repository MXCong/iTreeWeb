package com.iTree.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * Login entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="login"
    ,catalog="itreetest"
)

public class Login  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private User user;
     private Timestamp accountNo;
     private String password;
     private Integer loginStatus;


    // Constructors

    /** default constructor */
    public Login() {
    }

    
    /** full constructor */
    public Login(User user, Timestamp accountNo, String password, Integer loginStatus) {
        this.user = user;
        this.accountNo = accountNo;
        this.password = password;
        this.loginStatus = loginStatus;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="user_id", nullable=false)

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Column(name="account_no", nullable=false, length=19)

    public Timestamp getAccountNo() {
        return this.accountNo;
    }
    
    public void setAccountNo(Timestamp accountNo) {
        this.accountNo = accountNo;
    }
    
    @Column(name="password", nullable=false, length=200)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="login_ status", nullable=false)

    public Integer getLoginStatus() {
        return this.loginStatus;
    }
    
    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }
   








}