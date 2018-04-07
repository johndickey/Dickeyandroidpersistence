package com.example.john.dickeyandroidpersistence;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;

//UserDao class//
@Dao
public interface UserDao {
    //method to add user//
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addUser(User user);
    //method to query user//
    @Query("select * from user")
    public List<User> getAllUser();
    //method to query user id//
    @Query("select * from user where id = :userId")
    public List<User> getUser(long userId);
    //method to update user data//
    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateUser(User user);
    //method to remove user//
    @Query("delete from user")
    void removeAllUsers();
}
