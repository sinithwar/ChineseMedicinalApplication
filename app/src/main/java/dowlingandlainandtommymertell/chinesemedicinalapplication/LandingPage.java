package dowlingandlainandtommymertell.chinesemedicinalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        TextView herbs = (TextView) findViewById(R.id.herbs_link);
        TextView diets = (TextView) findViewById(R.id.diets_link);


        herbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent herb_link = new Intent(LandingPage.this, HerbsActivity.class);
                startActivity(herb_link);
            }
        });

        diets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diets_link = new Intent(LandingPage.this, FireRecipesActivity.class);
                startActivity(diets_link);
            }
        });
    }
}
