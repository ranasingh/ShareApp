package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends Model {

    private String username = "";
    private String firstname = "";
    private String lastname = "";
    private String email = "";
    private String mobile = "";
    private String apartmentNumber = "";
    private List<Article> ownArticles = new ArrayList<>();
    private List<Article> rentedArticles = new ArrayList<>();

    public User() {}

    public User(String username, String firstname, String lastname) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<Article> getOwnArticles() {
        return ownArticles;
    }

    public void setOwnArticles(List<Article> ownArticles) {
        this.ownArticles = ownArticles;
    }

    public List<Article> getRentedArticles() {
        return rentedArticles;
    }

    public void setRentedArticles(List<Article> rentedArticles) {
        this.rentedArticles = rentedArticles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
