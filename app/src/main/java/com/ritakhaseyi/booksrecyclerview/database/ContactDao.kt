package com.ritakhaseyi.booksrecyclerview.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.ritakhaseyi.booksrecyclerview.model.bookData

//we specify interactipns we will have with the table

@Dao
interface ContactDao {
//    we are telling room that this is thw function that we use to insert the contact
//
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(contact: bookData)

}