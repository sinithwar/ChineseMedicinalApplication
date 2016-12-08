package dowlingandlainandtommymertell.chinesemedicinalapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash_link = new Intent(SplashScreen.this, LandingPage.class);
                SplashScreen.this.startActivity(splash_link);
                SplashScreen.this.finish();
            }
        }, 3000);
    }
}
