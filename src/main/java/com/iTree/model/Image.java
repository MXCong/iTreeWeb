package com.iTree.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * Image entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="image"
    ,catalog="itreetest"
)

public class Image  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String profile;
     private String path;
     private Timestamp upTime;
     private Integer status;
     private Set<News> newses = new HashSet<News>(0);
     private Set<File> files = new HashSet<File>(0);
     private Set<Record> records = new HashSet<Record>(0);
     private Set<Plan> plans = new HashSet<Plan>(0);
     private Set<User> users = new HashSet<User>(0);


    // Constructors

    /** default constructor */
    public Image() {
    }

	/** minimal constructor */
    public Image(String profile, String path, Timestamp upTime, Integer status) {
        this.profile = profile;
        this.path = path;
        this.upTime = upTime;
        this.status = status;
    }
    
    /** full constructor */
    public Image(String profile, String path, Timestamp upTime, Integer status, Set<News> newses, Set<File> files, Set<Record> records, Set<Plan> plans, Set<User> users) {
        this.profile = profile;
        this.path = path;
        this.upTime = upTime;
        this.status = status;
        this.newses = newses;
        this.files = files;
        this.records = records;
        this.plans = plans;
        this.users = users;
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
    
    @Column(name="profile", nullable=false, length=50)

    public String getProfile() {
        return this.profile;
    }
    
    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    @Column(name="path", nullable=false, length=100)

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    
    @Column(name="up_time", nullable=false, length=19)

    public Timestamp getUpTime() {
        return this.upTime;
    }
    
    public void setUpTime(Timestamp upTime) {
        this.upTime = upTime;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="image")

    public Set<News> getNewses() {
        return this.newses;
    }
    
    public void setNewses(Set<News> newses) {
        this.newses = newses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="image")

    public Set<File> getFiles() {
        return this.files;
    }
    
    public void setFiles(Set<File> files) {
        this.files = files;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="image")

    public Set<Record> getRecords() {
        return this.records;
    }
    
    public void setRecords(Set<Record> records) {
        this.records = records;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="image")

    public Set<Plan> getPlans() {
        return this.plans;
    }
    
    public void setPlans(Set<Plan> plans) {
        this.plans = plans;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="image")

    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }
   








}