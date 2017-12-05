package ca.on.conestogac.threescreens;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


//For every table in the database you define a Java class, annotated with @Entity.
//The primary key must be annotated with @PrimaryKey.

@Entity
public class Patient
{
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String userName;
    public String password;
    public String email;
    public String country;

    //constructor
    public Patient(String userName, String password, String email, String country)
    {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.country = country;
    }

}