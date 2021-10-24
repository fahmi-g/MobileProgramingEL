package id.ac.umn.uts_42306;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView title, subTitle;
    MediaPlayer player;
    Button playSfx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = findViewById(R.id.title2);
        subTitle = findViewById(R.id.subTitle2);
        playSfx = findViewById(R.id.sfx);

        title.setText(getIntent().getStringExtra("title"));
        subTitle.setText(getIntent().getStringExtra("subtitle"));

        playSfx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlaySFX();
            }
        });
    }
    void PlaySFX()
    {
        if(title.getText().toString().equals("Funny Joke"))
        {
            player = MediaPlayer.create(this, R.raw.sfx1);
        }
        if(title.getText().toString().equals("omiyakorone"))
        {
            player = MediaPlayer.create(this, R.raw.sfx2);
        }
        if(title.getText().toString().equals("Hihihihahaha"))
        {
            player = MediaPlayer.create(this, R.raw.sfx3);
        }
        if(title.getText().toString().equals("Hey"))
        {
            player = MediaPlayer.create(this, R.raw.sfx4);
        }
        if(title.getText().toString().equals("Kabuki Theater"))
        {
            player = MediaPlayer.create(this, R.raw.sfx5);
        }

        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                if(player != null)
                {
                    player.release();
                    player = null;
                }
            }
        });
        player.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(player != null)
        {
            player.release();
            player = null;
        }
    }
}