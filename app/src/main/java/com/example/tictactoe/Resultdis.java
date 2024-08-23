package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Resultdis extends Dialog {

    private final String message;
    private final MainActivity mainActivity;

    public Resultdis(@NonNull Context context,String message,MainActivity mainActivity)
    {
        super(context);
        this.message=message;
        this.mainActivity=mainActivity;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultdis);

        TextView messegaetext = findViewById(R.id.messagetext);
        Button startagainbutton = findViewById(R.id.startagainbutton);

        messegaetext.setText(message);

        startagainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.restartMatch();
                dismiss();
            }
        });
    }
}