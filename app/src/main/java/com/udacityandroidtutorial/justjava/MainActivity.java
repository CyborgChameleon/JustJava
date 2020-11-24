package com.udacityandroidtutorial.justjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int CoffeeQnty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        String priceMessage ="that'll be $"+CoffeeQnty*5;
        displayMessage (priceMessage);
    }

    public void increment(View view) {
        CoffeeQnty+=1;
        display (CoffeeQnty);

    }

    public void decrement(View view) {
        CoffeeQnty-=1;
        display (CoffeeQnty);

    }

    private void display (int number) {
        TextView quantityTextView=(TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText(""+ number);
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message){
        TextView priceTextView= (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


}
