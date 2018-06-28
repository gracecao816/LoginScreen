package gracecao.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static gracecao.loginscreen.LoginActivity.EMAIL_TEXT;

public class SignUpButtonActivity extends AppCompatActivity {
    //text field that contains updated email address
    EditText etEmailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_button);
        //resolve text field from layout
        etEmailText = (EditText) findViewById(R.id.etEmailText);
        //set text field's content from intent
        etEmailText.setText(getIntent().getStringExtra(EMAIL_TEXT));
    }

    public void onSaveItem(View v) {
        //Prepare intent to pass back to MainActivity
        Intent data = new Intent();
        //Pass updated item text plus original position
        data.putExtra(EMAIL_TEXT, etEmailText.getText().toString());
        setResult(RESULT_OK, data); //set result code and bundle data for response
        finish();
    }

}
