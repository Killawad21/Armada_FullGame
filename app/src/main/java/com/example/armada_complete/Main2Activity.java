package com.example.armada_complete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    int firstShield = 2;
    int secondShield = 2;
    int thirdShield = 2;
    int fourthShield = 1;
    int hull = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void moveToActivityOne(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void shield1plus(View view) {
        firstShield = firstShield + 1;
        if(firstShield == 3){
            firstShield = 2;
        }
        display(firstShield);
    }
    public void shield1minus(View view) {
        firstShield = firstShield - 1;
        if(firstShield == -1){
            firstShield = 0;
        }
        display(firstShield);
    }
    public void shield2plus(View view) {
        secondShield = secondShield + 1;
        if(secondShield == 3){
            secondShield = 2;
        }
        display2(secondShield);
    }
    public void shield2minus(View view) {
        secondShield = secondShield - 1;
        if(secondShield == -1){
            secondShield = 0;
        }
        display2(secondShield);
    }
    public void shield3plus(View view) {
        thirdShield = thirdShield + 1;
        if(thirdShield == 3){
            thirdShield = 2;
        }
        display3(thirdShield);
    }
    public void shield3minus(View view) {
        thirdShield = thirdShield - 1;
        if(thirdShield == -1){
            thirdShield = 0;
        }
        display3(thirdShield);
    }

    public void shield4plus(View view) {
        fourthShield = fourthShield + 1;
        if(fourthShield == 2){
            fourthShield = 1;
        }
        display4(fourthShield);
    }
    public void shield4minus(View view) {
        fourthShield = fourthShield - 1;
        if(fourthShield == -1){
            fourthShield = 0;
        }
        display4(fourthShield);
    }
    public void hullPlus(View view) {
        hull = hull + 1;
        if(hull == 5){
            hull = 4;
        }
        display5(hull);
    }
    public void hullMinus(View view) {
        hull = hull - 1;
        if(hull == -1){
            hull = 0;
        }
        display5(hull);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view2);
        quantityTextView.setText("" + number);
    }
    private void display3(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view3);
        quantityTextView.setText("" + number);
    }
    private void display4(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view4);
        quantityTextView.setText("" + number);
    }
    private void display5(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view5);
        quantityTextView.setText("" + number);
    }
}