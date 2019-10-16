package tj.belajar.partemuankeenam

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_facebook_main_activity.setOnClickListener {
            val  i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/langitinspirasi"))
            startActivity(i)
        }

        btn_ig_main_activity.setOnClickListener({
            val  i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/langitinspirasi"))
                startActivity(i)
        })

        var MediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.halo)

        btn_play_main_activity.setOnClickListener {
            MediaPlayer?.start()
        }
        btn_paus_main_activity.setOnClickListener {
            MediaPlayer?.pause()
        }
        btn_stop_main_activity.setOnClickListener {
            MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)
        }
    }

}

