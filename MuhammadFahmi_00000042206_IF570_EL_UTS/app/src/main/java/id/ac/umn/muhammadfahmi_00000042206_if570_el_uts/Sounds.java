package id.ac.umn.muhammadfahmi_00000042206_if570_el_uts;

import android.media.MediaPlayer;
import android.net.Uri;

public class Sounds {
    private String judul,deskripsi;

    public Sounds(String judul, String deskripsi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
