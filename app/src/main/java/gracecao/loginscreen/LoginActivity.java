package gracecao.loginscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button setUpButton;
    private Button websiteButton;
    //keys for passing data between activities
    public static final String EMAIL_TEXT = "emailText";
    //url for AirBnb website
    public final static String AIRBNB_URL = "https://www.airbnb.com/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setUpButton = (Button) findViewById(R.id.btnSignUp);
        setUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSetUpActivity();
            }
        });
        websiteButton = (Button) findViewById(R.id.btnWebsite);
        websiteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToUrlAirbnb(AIRBNB_URL);
            }
        });
    }
    public void openSetUpActivity() {
        Intent intent = new Intent(this, SignUpButtonActivity.class);
        startActivity(intent);
    }

    public void goToUrlAirbnb (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
