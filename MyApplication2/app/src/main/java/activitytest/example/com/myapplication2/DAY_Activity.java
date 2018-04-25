package activitytest.example.com.myapplication2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar;

public class DAY_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_);


        Button button_my=(Button)findViewById(R.id.button_my);
        Button button_life=(Button)findViewById(R.id.button_life);
        Button button_day=(Button)findViewById(R.id.button_day);
        TextView plan_out=(TextView)findViewById(R.id.plan_out);
        Button button_next_plan=(Button)findViewById(R.id.button_next_plan);




        SharedPreferences pref = getSharedPreferences("PLAN",MODE_PRIVATE);
        String one_day = pref.getString("one","");
        String two_day = pref.getString("two","");
        String three_day = pref.getString("three","");
        String four_day = pref.getString("four","");
        String five_day = pref.getString("five","");
        String six_day = pref.getString("six","");
        String seven_day = pref.getString("seven","");
        //星期的判断从而直接调取数据库相应星期的内容
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek)
        {
            case 1:
                plan_out.setText(seven_day);break;
            case 2:
                plan_out.setText(one_day);break;

            case 3:
                plan_out.setText(two_day);break;

            case 4:
                plan_out.setText(three_day);break;

            case 5:
                plan_out.setText(four_day);break;

            case 6:
                plan_out.setText(five_day);break;

            case 7:
                plan_out.setText(six_day);break;

        }







        button_life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DAY_Activity.this,LIFE_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        button_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DAY_Activity.this,MY_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        button_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DAY_Activity.this,DAY_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        button_next_plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DAY_Activity.this,DateActivity.class);
                startActivity(intent);
                finish();
            }
        });




}
}
