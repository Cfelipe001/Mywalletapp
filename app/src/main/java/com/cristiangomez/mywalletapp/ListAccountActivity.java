package com.cristiangomez.mywalletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList <Account> listAccountRv = new ArrayList<>();
    private RecyclerView myRecycleAccount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();
        myRecycleAccount = findViewById(R.id.rv_list_accounts);
        AccountAdapter myAdaptador = new AccountAdapter(listAccountRv);
        myRecycleAccount.setAdapter(myAdaptador);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));

    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia", "Cuenta de ahorros", 1003402.0,"https://i.pinimg.com/564x/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.jpg");
        Account myAccount2 = new Account("Davivienda", "Cuenta debito", 1003402.0,"https://play-lh.googleusercontent.com/Q9L3SKs70QGK2O7eicNehbneYeXWk2VEFxLOVQPPei4hyRe3RZDwBZeXr7DYKZuagDOL=s48-rw");
        Account myAccount3 = new Account("Efecto", "Efectivo", 1003402.0,"https://cdn-icons-png.flaticon.com/512/2331/2331941.png");
        listAccountRv.add(myAccount1);
        listAccountRv.add(myAccount2);
        listAccountRv.add(myAccount3);
    }
}