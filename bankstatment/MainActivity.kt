package com.example.bankstatment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.bankstatment.Dataclass.TransactionType
import com.example.bankstatment.ui.theme.BankStatmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankStatmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AccountStatment(modifier = Modifier.fillMaxSize(1f),"Fawaz",
                        "24/01/24",TransactionType.DEPOSIT,2000.0,"Salary")
                }
            }
        }
    }
}





