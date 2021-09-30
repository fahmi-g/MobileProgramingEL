package id.ac.umn.week04_b_muhammadfahmi_42206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button h1, h2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h1 = findViewById(R.id.change1);
        h2 = findViewById(R.id.change2);

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hal1 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(hal1);
            }
        });

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hal2 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(hal2);
            }
        });
    }
}