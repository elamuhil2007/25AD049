package com.skillswap.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity @Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; @Column(nullable = false)
    private String name; @Column(nullable = false, unique = true)
    private String email; @Column(nullable = false)
    private String password; // Default Constructor
public User() {

} // Parameterized Constructor
public User(String name, String email, String password) {
    this.name = name; this.email = email; this.password = password;
} // Get ID
public Long getId() {
    return id;
} // Set ID
public void setId(Long id) {
    this.id = id; } // Get Name
public String getName() {
    return name;
} // Set Name
public void setName(String name) {
    this.name = name; } // Get Email
public String getEmail() {
    return email;
} // Set Email
public void setEmail(String email) {
    this.email = email;
} // Get Password
public String getPassword() {
    return password;
} // Set Password
public void setPassword(String password) {
    this.password = password;
}
}