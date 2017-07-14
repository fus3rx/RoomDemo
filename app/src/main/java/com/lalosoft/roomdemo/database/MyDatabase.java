package com.lalosoft.roomdemo.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.lalosoft.roomdemo.database.entity.Product;

/**
 * Created by gonzalo on 7/14/17
 */

@Database(entities = {Product.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract ProductDao productDao();
}
