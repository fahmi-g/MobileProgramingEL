package id.ac.umn.muhammadfahmi_00000042206_if570_el_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SoundDetails extends AppCompatActivity {

    private TextView tvJudulD, tvDescD;
    private Button play;
    private String sound;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_details);

        tvJudulD = (TextView) findViewById(R.id.judulDetail);
        tvDescD = (TextView) findViewById(R.id.deskripsiDetail);
        play = findViewById(R.id.playBtn);

        LoadDataToDetails();

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlaySound();
            }
        });
    }

    private void PlaySound()
    {
        if(sound.equals("please_standby"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.please_standby);
        }else if(sound.equals("sad_violin"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.sad_violin);
        }else if(sound.equals("potato"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.potato);
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stopSound();
            }
        });

        mediaPlayer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopSound();
    }

    private void stopSound()
    {
        if(mediaPlayer != null)
        {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    private void LoadDataToDetails()
    {
        try {
            tvJudulD.setText(getIntent().getStringExtra("judul"));
            tvDescD.setText(getIntent().getStringExtra("deskripsi"));
            sound = getIntent().getStringExtra("judul");
        }catch (NullPointerException e)
        {
            Toast.makeText(this, "Konten tidak bisa ditemukan.", Toast.LENGTH_LONG).show();
        }
    }
}