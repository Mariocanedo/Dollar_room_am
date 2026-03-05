package com.example.dollar_room_am.Modelo

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity ( tableName = "dollar_transactions")
data class DollarTrasanction (

    @PrimaryKey(autoGenerate = true)
    val id :Int =0,
    val type :String, //"BUY" O "SELL"
    val amount : Double,
    val timestamp : Long = System.currentTimeMillis()


)