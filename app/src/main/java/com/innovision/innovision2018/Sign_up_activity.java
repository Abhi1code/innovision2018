package com.innovision.innovision2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sign_up_activity extends AppCompatActivity {

    private TextView help_text;
    private Button move_to_signin_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);
        help_text = findViewById(R.id.terms_cond);
        move_to_signin_page = findViewById(R.id.sign_in_view);
        Sign_in_activity.controltextvview(help_text);
        move_to_signin_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sign_up_activity.this,Sign_in_activity.class));
            }
        });
    }
}
