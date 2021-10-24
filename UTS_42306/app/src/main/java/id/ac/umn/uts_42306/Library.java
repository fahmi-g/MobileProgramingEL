package id.ac.umn.uts_42306;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    RecyclerView recyclerView;
    SFXAdapter sfxAdapter;
    ArrayList<SFX> sfxLibraryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Toast.makeText(this, "Welcome, "+getIntent().getStringExtra("name"), Toast.LENGTH_SHORT).show();
        sfxLibraryList = new ArrayList<SFX>(){
            {
                add(new SFX("Funny Joke", "Funny joke effect"));
                add(new SFX("omiyakorone", "Whale cum"));
                add(new SFX("Hihihihahaha", "Anime girl laughing"));
                add(new SFX("Hey", "Hey hey"));
                add(new SFX("Kabuki Theater", "Japanese Kabuki Theater Tsuzumi Sound Effect"));
            }
        };
        recyclerView = findViewById(R.id.recycler);
        sfxAdapter = new SFXAdapter(this, sfxLibraryList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Library.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sfxAdapter);
    }
}