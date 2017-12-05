package ca.on.conestogac.threescreens;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;


//For each Java annotated with @Entity,
// define an interface for the database access object (DAO) annotated with @Dao
// In this interface you define methods annotated with:@Query, @Insert, @Delete


@Dao
public interface PatientDao
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addPatient(Patient patient);

    @Query("select * from patient")
    public List<Patient> getAllPatient();

    @Query("select * from patient where id = :id")
    public List<Patient> getPatient(long id);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updatePatient(Patient patient);

    @Query("delete from patient")
    void removeAllPatient();
}
