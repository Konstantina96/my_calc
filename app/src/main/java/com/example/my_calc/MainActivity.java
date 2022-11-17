package com.example.my_calc;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


   Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
button9, buttonAdd, buttonSub, buttonDiv, buttonMult, buttonClear, buttonEqual, buttonDot;
   EditText my_calcEditText;

   float mValueOne, mValueTwo;

   boolean my_calcAddition;
   boolean my_calcSubtraction;
   boolean my_calcDivision;
   boolean my_calcMultiplication;

   @SuppressLint("WrongViewCast")
   protected void onCreate(Bundle SavedInstanceState){
      super.onCreate(SavedInstanceState);
      setContentView(R.layout.activity_main);

      button0= (Button) findViewById(R.id.n0);
      button1= (Button) findViewById(R.id.n1);
      button2= (Button) findViewById(R.id.n2);
      button3= (Button) findViewById(R.id.n3);
      button4= (Button) findViewById(R.id.n4);
      button5= (Button) findViewById(R.id.n5);
      button6= (Button) findViewById(R.id.n6);
      button7= (Button) findViewById(R.id.n7);
      button8= (Button) findViewById(R.id.n8);
      button9= (Button) findViewById(R.id.n9);
      buttonAdd= (Button) findViewById(R.id.nAdd);
      buttonSub= (Button) findViewById(R.id.nSub);
      buttonDiv= (Button) findViewById(R.id.nDiv);
      buttonMult= (Button) findViewById(R.id.nMult);
      buttonClear= (Button) findViewById(R.id.nEqual);
      buttonDot= (Button) findViewById(R.id.nDot);
      my_calcEditText = (EditText) findViewById(R.id.edittext);

      button1.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "1");

         }
      });

      button2.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "2");
         }
      });

      button3.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "3");
         }
      });

      button4.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "4");
         }
      });

      button5.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "5");
         }
      });

      button6.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "6");
         }
      });

      button7.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "7");
         }
      });

      button8.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "8");
         }
      });

      button9.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "9");
         }
      });

      button0.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "0");
         }
      });

      buttonAdd.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "nAdd");
         }
      });

      buttonDiv.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "nDiv");
         }
      });
      buttonClear.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "nClear");
         }
      });

      buttonSub.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "nSub");

         }
      });

      buttonMult.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "nMult");

         }
      });

      buttonEqual.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + "nEqual");

         }
      });

      buttonDot.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            my_calcEditText.setText(my_calcEditText.getText() + ".");
         }
      });
   }
}

