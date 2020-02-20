package com.example.armada_complete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button BtnMove;
    int firstShield = 3;
    int secondShield = 3;
    int thirdShield = 3;
    int fourthShield = 1;
    int hull = 8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void moveToActivityTwo(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void shield1plus(View view) {
        firstShield = firstShield + 1;
        if(firstShield == 4){
            firstShield = 3;
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
        if(secondShield == 4){
            secondShield = 3;
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
        if(thirdShield == 4){
            thirdShield = 3;
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
        if(hull == 9){
            hull = 8;
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

