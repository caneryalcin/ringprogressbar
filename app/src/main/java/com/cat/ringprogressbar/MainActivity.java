package com.cat.ringprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import io.netopen.hotbitmapgg.library.view.RingProgressBar;

//gradle(Project) ve gradle(app) 'da eklentiler mevcuttur.
public class MainActivity extends AppCompatActivity {


    RingProgressBar ringProgressBar;
    SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ringProgressBar = findViewById(R.id.progress_bar);
        seekBar = findViewById(R.id.seekBar);

        //Bu metod, SeekBar‘da gerçekleşen değişiklikleri yakalamak için kullanılır.
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override//İşlemin değişikliğe uğraması sırasında olan olay.
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ringProgressBar.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //ringProgressBar %100 olduğunda tost mesajı gelir.
        ringProgressBar.setOnProgressListener(new RingProgressBar.OnProgressListener() {
            @Override
            public void progressToComplete() {

                Toast.makeText(MainActivity.this, "Completed", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
