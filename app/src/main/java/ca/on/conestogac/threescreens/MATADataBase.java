package ca.on.conestogac.threescreens;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by senebeli5891 on 11/22/2017.
 */

@Database(entities = {Patient.class}, version = 1)
public abstract class MATADataBase extends RoomDatabase
{
    private static MATADataBase INSTANCE;

    //the interface is used here
   public abstract PatientDao patientDao();

   public static MATADataBase getDatabase(Context context)
   {
       if (INSTANCE == null)
       {
           INSTANCE = Room.databaseBuilder(context, MATADataBase.class,"SydneyDataBase")

                   //if allow queries
                   .allowMainThreadQueries()
                   .build();

       }
       return INSTANCE;


   }

    public static void destroyInstance()
    {
        INSTANCE = null;
    }
}
