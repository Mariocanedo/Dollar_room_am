package com.example.dollar_room_am.Modelo

import com.example.dollar_room_am.Modelo.Local.DollarTransactionDao
import com.example.dollar_room_am.Modelo.Local.DollarTrasanction


class TransactionRepository(private val dao : DollarTransactionDao) {




    suspend fun insertTransaction(transaction: DollarTrasanction){
        dao.insertTransaction(transaction)
    }


    suspend fun  getAllTransactions() :List<DollarTrasanction>{

        return  dao.getAllTransactions()
    }



}