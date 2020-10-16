package home.train.model;

import javax.persistence.*;
import java.util.SortedMap;
import java.util.TreeMap;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "image")
    @MapKeyColumn(name="image_id")
    @Column(name = "image_name")
    @OrderBy
    private SortedMap<Integer,String> images= new TreeMap<>();


    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SortedMap<Integer, String> getImages() {
        return images;
    }

    public void setImages(SortedMap<Integer, String> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", images=" + images +
                '}';
    }
}
