package id.ac.umn.week04_a_muhammadfahmi_42206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnKirim, btnBrowse;
    private EditText etMessage, etUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKirim = findViewById(R.id.kirim);
        btnBrowse = findViewById(R.id.browse);
        etMessage = findViewById(R.id.message1);
        etUrl = findViewById(R.id.url1);

        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlText = etUrl.getText().toString();
                if(urlText.isEmpty()){ urlText = "http://www.umn.ac.id/"; }

                Intent browseIntent = new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(urlText));

                if(browseIntent.resolveActivity(getPackageManager()) !=
                        null){
                    startActivity(browseIntent);
                }
            }
        });

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityDua.class);
                String pesan = etMessage.getText().toString();
                intent.putExtra("pesanDariMain", pesan);
                startActivity(intent);
            }
        });

        etMessage.setText(getIntent().getStringExtra("pesanBalasan"));
    }
}