package id.ac.umn.uts_42306;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText name;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.name);
        next = findViewById(R.id.continue1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.length()==0)
                {
                    name.requestFocus();
                    name.setError("Name Required.");
                }else
                {
                    String name1 = name.getText().toString();
                    Intent intent = new Intent(Login.this, Library.class);
                    intent.putExtra("name", name1);

                    startActivity(intent);
                }
            }
        });
    }
}