package id.ac.umn.week04_a_muhammadfahmi_42206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDua extends AppCompatActivity {

    private Button btnBalas;
    private TextView pesan;
    private EditText pesanBalik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        btnBalas = findViewById(R.id.kirimBalik);
        pesan = findViewById(R.id.pesanDiterima);
        pesanBalik = findViewById(R.id.pesanBalik);

        pesan.setText(getIntent().getStringExtra("pesanDariMain"));

        btnBalas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToMain = new Intent(ActivityDua.this, MainActivity.class);
                intentToMain.putExtra("pesanBalasan", pesanBalik.getText().toString());
                startActivity(intentToMain);
            }
        });
    }
}