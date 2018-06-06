package com.innovision.innovision2018;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sign_in_activity extends AppCompatActivity {

    private TextView help_text;
    private Button move_to_signup_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);
        move_to_signup_page = findViewById(R.id.sign_up_view);
        help_text = findViewById(R.id.terms_cond);
        controltextvview(help_text);
        move_to_signup_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sign_in_activity.this,Sign_up_activity.class));
            }
        });
    }

    public static void controltextvview(TextView view){
        String string = "Facing any technical issue related to Registration,Login or forgot password,drop a mail to innovision.help@gmail.com";
        SpannableString spannableString = new SpannableString(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.WHITE);
        spannableString.setSpan(foregroundColorSpan,90,116, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        view.setText(spannableString);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
