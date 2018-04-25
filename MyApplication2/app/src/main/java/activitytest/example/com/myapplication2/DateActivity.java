package activitytest.example.com.myapplication2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DateActivity extends AppCompatActivity {


    private EditText editText_one,editText_two,editText_three,editText_four,editText_five,editText_six,editText_seven;
    private Button button_ok,button_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);


        editText_one = (EditText) findViewById(R.id.editText_one);
        editText_two = (EditText) findViewById(R.id.editText_two);
        editText_three = (EditText) findViewById(R.id.editText_three);
        editText_four = (EditText) findViewById(R.id.editText_four);
        editText_five = (EditText) findViewById(R.id.editText_five);
        editText_six = (EditText) findViewById(R.id.editText_six);
        editText_seven = (EditText) findViewById(R.id.editText_seven);
        button_ok = (Button) findViewById(R.id.button_ok);
        button_up = (Button) findViewById(R.id.button_up);

        String one = editText_one.getText().toString();
        String two = editText_two.getText().toString();
        String three = editText_three.getText().toString();
        String four = editText_four.getText().toString();
        String five = editText_five.getText().toString();
        String six = editText_six.getText().toString();
        String seven = editText_seven.getText().toString();



        button_ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=getSharedPreferences("PLAN",MODE_PRIVATE).edit();
                String one = editText_one.getText().toString();
                String two = editText_two.getText().toString();
                String three = editText_three.getText().toString();
                String four = editText_four.getText().toString();
                String five = editText_five.getText().toString();
                String six = editText_six.getText().toString();
                String seven = editText_seven.getText().toString();

                editor.putString("one",one).putString("two",two).putString("three",three).putString("four",four).putString("five",five).putString("six",six).putString("seven",seven).commit();




            }
        });

        SharedPreferences pref = getSharedPreferences("PLAN",MODE_PRIVATE);
        String one_day = pref.getString("one","");
        String two_day = pref.getString("two","");
        String three_day = pref.getString("three","");
        String four_day = pref.getString("four","");
        String five_day = pref.getString("five","");
        String six_day = pref.getString("six","");
        String seven_day = pref.getString("seven","");



        editText_one.setText(one_day);
        editText_two.setText(two_day);
        editText_three.setText(three_day);
        editText_four.setText(four_day);
        editText_five.setText(five_day);
        editText_six.setText(six_day);
        editText_seven.setText(seven_day);


        button_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DateActivity.this,DAY_Activity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
