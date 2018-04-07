package com.example.john.dickeyandroidpersistence;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;
//Trophy Dao class//
@Dao
public interface TrophyDao {
    //method to add trophy//
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addTrophy(Trophy trophy);
    //method to query trophy user data//
    @Query("SELECT * FROM trophy WHERE userId=:userId")
    List<Trophy> findTrophiesForUser(int userId);
    //method to update trophy user data//
    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateTrophy(Trophy trophy);
    //method to delete trophy user data//
    @Query("delete from trophy where id = :id")
    void delete(long id);

}
