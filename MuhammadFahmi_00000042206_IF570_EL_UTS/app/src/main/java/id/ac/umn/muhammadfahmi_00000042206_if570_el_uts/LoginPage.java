package id.ac.umn.muhammadfahmi_00000042206_if570_el_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginPage extends AppCompatActivity {

    private TextInputEditText nama;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        nama = findViewById(R.id.inputNama);
        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.length()==0)
                {
                    nama.requestFocus();
                    nama.setError("Tidak boleh kosong!");
                }else
                {
                    Intent intent = new Intent(LoginPage.this, Library.class);
                    intent.putExtra("nama", nama.getText().toString());

                    startActivity(intent);
                }
            }
        });
    }
}