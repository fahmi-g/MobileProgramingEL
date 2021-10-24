package id.ac.umn.muhammadfahmi_00000042206_if570_el_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private TextView r1,r2,r3,r4,r5,r6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);

        r1.setMovementMethod(LinkMovementMethod.getInstance());
        r2.setMovementMethod(LinkMovementMethod.getInstance());
        r3.setMovementMethod(LinkMovementMethod.getInstance());
        r4.setMovementMethod(LinkMovementMethod.getInstance());
        r5.setMovementMethod(LinkMovementMethod.getInstance());
        r6.setMovementMethod(LinkMovementMethod.getInstance());
    }
}