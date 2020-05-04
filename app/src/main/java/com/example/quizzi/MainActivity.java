package com.example.quizzi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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

    /**
     * This method checks whether each answer is correct or not.
     * */
    public void checkAnswers(View view) {
        // Gets the answer of question number 1
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.radio_question_1);
        int selectedOne = questionOne.getCheckedRadioButtonId();
        RadioButton selectedAnswerOne = (RadioButton) findViewById(selectedOne);
        String answerOne = (String) selectedAnswerOne.getText();

        /* If the answer is correct, increase the number of correct answers
         * Check for question 1 */
        if(answerOne.equals("4")) {
            correctAnswers += 1;
        }

        // Gets the answer of question number 2
        CheckBox spitfireCheckbox = (CheckBox) findViewById(R.id.spitfire_checkbox);
        boolean selectedSpitfire = spitfireCheckbox.isChecked();

        CheckBox gulfCheckbox = (CheckBox) findViewById(R.id.gulf_checkbox);
        boolean selectedGulfWar = gulfCheckbox.isChecked();

        CheckBox worldWarCheckbox = (CheckBox) findViewById(R.id.ww2_checkbox);
        boolean selectedWorldWar = worldWarCheckbox.isChecked();

        CheckBox lancasterCheckbox = (CheckBox) findViewById(R.id.lancaster_checkbox);
        boolean selectedLancaster = lancasterCheckbox.isChecked();

        // Check for question 2
        if(selectedSpitfire && selectedWorldWar && !selectedGulfWar && !selectedLancaster){
            correctAnswers += 1;
        }

        // Gets the answer of question number 3
        EditText companyField = (EditText) findViewById(R.id.q3_text_input);
        String company = companyField.getText().toString().trim();

        //Check for question 3
        if(company.equalsIgnoreCase("boeing")) {
            correctAnswers += 1;
        }

        // Gets the answer of question number 4
        RadioGroup questionFour = (RadioGroup) findViewById(R.id.radio_question_4);
        int selectedFour = questionFour.getCheckedRadioButtonId();
        RadioButton selectedAnswerFour = (RadioButton) findViewById(selectedFour);
        String answerFour = (String) selectedAnswerFour.getText();

        //Check for question 4
        if(answerFour.equals("1976")) {
            correctAnswers += 1;
        }

        // Gets the answer of question number 5
        CheckBox liftCheckbox = (CheckBox) findViewById(R.id.lift_checkbox);
        boolean selectedLift = liftCheckbox.isChecked();

        CheckBox gravityCheckbox = (CheckBox) findViewById(R.id.gravity_checkbox);
        boolean selectedGravity = gravityCheckbox.isChecked();

        CheckBox weightCheckbox = (CheckBox) findViewById(R.id.weight_checkbox);
        boolean selectedWeight = weightCheckbox.isChecked();

        CheckBox frictionCheckbox = (CheckBox) findViewById(R.id.friction_checkbox);
        boolean selectedFriction = frictionCheckbox.isChecked();

        // Check for question 5
        if(selectedLift && selectedWeight && !selectedGravity && !selectedFriction){
            correctAnswers += 1;
        }

        // Gets the answer of question number 6
        EditText easaField = (EditText) findViewById(R.id.q6_text_input);
        String easa = easaField.getText().toString().trim();

        //Check for question 6
        if(easa.equalsIgnoreCase("European Aviation Safety Agency")) {
            correctAnswers += 1;
        }

        // Prints the Toast with the number of correct answers
        Toast.makeText(this, "You have " + correctAnswers + " correct answers.", Toast.LENGTH_SHORT).show();

        // Resets the correct answer counter in order to play again
        correctAnswers = 0;
    }
}
