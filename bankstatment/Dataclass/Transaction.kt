package com.example.bankstatment.Dataclass

data class Transaction(val name:String,
                       val date:String,
                       val TypeOfTransaction:TransactionType,
                       val balance:Double,
                       val Description:String)
