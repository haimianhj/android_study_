package activitytest.example.com.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MY_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_);

        Button button_my=(Button)findViewById(R.id.button_my);
        Button button_life=(Button)findViewById(R.id.button_life);
        Button button_day=(Button)findViewById(R.id.button_day);

        button_life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MY_Activity.this,LIFE_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        button_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MY_Activity.this,MY_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        button_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MY_Activity.this,DAY_Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
