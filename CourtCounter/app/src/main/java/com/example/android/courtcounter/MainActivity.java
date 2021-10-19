/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.courtcounter;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int counterA = 0;
    int counterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void threePointsA(View view) {
        counterA = counterA + 3;
        displayA(counterA);
    }
    public void twoPointsA(View view) {
        counterA = counterA + 2;
        displayA(counterA);
    }
    public void freeThrowA(View view){
        counterA++;
        displayA(counterA);
    }
    public void threePointsB(View view) {
        counterB = counterB + 3;
        displayB(counterB);
    }
    public void twoPointsB(View view) {
        counterB = counterB + 2;
        displayB(counterB);
    }
    public void freeThrowB(View view){
        counterB++;
        displayB(counterB);
    }
    public void reset(View view){
        counterA = 0;
        counterB = 0;
        displayA(counterA);
        displayB(counterB);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayA(int number) {
        TextView counter = (TextView) findViewById(R.id.count_A);
        counter.setText("" + number);
    }
    private void displayB(int number) {
        TextView counter = (TextView) findViewById(R.id.count_B);
        counter.setText("" + number);
    }
}