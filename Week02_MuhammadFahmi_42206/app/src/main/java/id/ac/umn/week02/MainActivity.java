package id.ac.umn.week02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angka1,angka2;
    TextView hasil;
    Button btnTambah, btnKurang, btnKali, btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = this.findViewById(R.id.angka1);
        angka2 = this.findViewById(R.id.angka2);
        btnTambah = this.findViewById(R.id.btnTambah);
        btnKurang = this.findViewById(R.id.btnKurang);
        btnKali = this.findViewById(R.id.btnKali);
        btnBagi = this.findViewById(R.id.btnBagi);
        hasil = this.findViewById(R.id.hasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung('+');
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung('-');
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung('*');
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung('/');
            }
        });

    }

    private void hitung(char opr)
    {
        double a1 = Double.parseDouble(angka1.getText().toString());
        double a2 = Double.parseDouble(angka2.getText().toString());
        double h = 0;

        switch(opr)
        {
            case('+'):
                h = a1+a2;
                break;
            case('-'):
                h = a1-a2;
                break;
            case('/'):
                h = a1/a2;
                break;
            case('*'):
                h = a1*a2;
                break;
        }
        hasil.setText(String.valueOf(h));
    }
}