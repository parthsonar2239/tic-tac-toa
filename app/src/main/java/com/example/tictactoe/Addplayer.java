package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Addplayer extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addplayer);

        EditText playerOne = findViewById(R.id.playerone);
        EditText playerTwo = findViewById(R.id.playertwo);
        Button startGameButton = findViewById(R.id.startbutton);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getPlayerOneName = playerOne.getText().toString().trim();
                String getPlayerTwoName = playerTwo.getText().toString().trim();

                if(getPlayerOneName.isEmpty()||getPlayerTwoName.isEmpty())
                {
                    Toast.makeText(Addplayer.this, "Please enter ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent= new Intent(Addplayer.this,MainActivity.class);
                    intent.putExtra("playerOne",getPlayerOneName);
                    intent.putExtra("playerTwo",getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });

    }
}