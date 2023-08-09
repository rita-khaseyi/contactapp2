package com.ritakhaseyi.booksrecyclerview.model

import androidx.room.Entity
import androidx.room.PrimaryKey
//telling the db to create a table called Contacts
@Entity(tableName = "Contacts")
data class bookData(
//THis means when creating a table room will autogenerate the ids for us
   @PrimaryKey(autoGenerate = true) var contactId:Int,
var avatar:String,
var BookTitle:String,
var AuthorName: String,
var publication:Int,
)

