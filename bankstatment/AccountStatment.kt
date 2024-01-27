package com.example.bankstatment


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankstatment.Dataclass.TransactionType

@Composable
fun AccountStatment(modifier: Modifier=Modifier,
                    name:String,
                    date:String,
                    typeOfTransaction: TransactionType,
                    balance:Double,
                    description:String) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)



    ) {

        Column{
            Text(text = "Name: $name")
            Text(text = "Date: $date")
            Text(text = "Transaction type: $typeOfTransaction")
            Text(text = "Balance is : $balance")
            Text(text = "Description: $description")

        }

    }

}

@Preview
@Composable
fun AccountStatment() {
    AccountStatment(name ="Fawaz" , date = "22/01/2024",
        typeOfTransaction = TransactionType.DEPOSIT, balance =2839.0 , description ="Salary" )
}

