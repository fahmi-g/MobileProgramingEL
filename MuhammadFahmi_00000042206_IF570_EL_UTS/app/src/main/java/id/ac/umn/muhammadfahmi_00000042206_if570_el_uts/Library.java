package id.ac.umn.muhammadfahmi_00000042206_if570_el_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    private RecyclerView rcView;
    private SoundsAdapter sAdapter;
    private ArrayList<Sounds> soundsDataList = new ArrayList<Sounds>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Toast.makeText(this, "Selamat datang "+" "+getIntent().getStringExtra("nama"), Toast.LENGTH_SHORT).show();

        LoadSoundsData();

        rcView = findViewById(R.id.recyclerView);
        sAdapter = new SoundsAdapter(soundsDataList, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Library.this);

        rcView.setLayoutManager(layoutManager);
        rcView.setAdapter(sAdapter);
    }

    private void LoadSoundsData()
    {
        soundsDataList.add(new Sounds("please_standby", "Funny standby"));
        soundsDataList.add(new Sounds("sad_violin", "OG Sound"));
        soundsDataList.add(new Sounds("potato", "Nice Potato Song"));
    }
}