/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

/**
 *
 * @author Lenovo
 */
public class User {
    private String username;
    private String password;
    private String nama;
    private String email;

    // konstruktor (pertemuan 2)
    public User(String username, String password, String nama, String email) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.email = email;
    }

    // Getter dan Setter (encapsulation - pertemuan 3)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method (pertemuan 1)
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
    
    // Method untuk validasi password
    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
    
    // Konstruktor
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void printUserDetails() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}
