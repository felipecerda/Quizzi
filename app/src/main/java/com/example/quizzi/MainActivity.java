package com.example.quizzi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        /* Gets the value of the answer of question number 1 */
        RadioGroup questionOne = findViewById(R.id.radio_question_1);
        int selectedOne = questionOne.getCheckedRadioButtonId();
        RadioButton selectedAnswerOne = findViewById(selectedOne);
        String answerOne = (String) selectedAnswerOne.getText();

        /* If the answer is correct, increase the number of correct answers */
        if(answerOne.equals("4")){
            /* TODO Remove log */
            Log.i("MainActivity", "Answer 1 correct");
            correctAnswers += 1;
        }
        /* TODO Remove log */
        Log.i("MainActivity", answerOne);

        /* Prints the Toast with the number of correct answers */
        Toast.makeText(this, "You have " + correctAnswers + " correct answers.", Toast.LENGTH_SHORT).show();
    }
}
