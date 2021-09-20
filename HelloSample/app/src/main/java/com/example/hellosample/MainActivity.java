package com.example.hellosample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //表示ボタンであるButtonオブジェクトを取得
        Button btClick = findViewById(R.id.btClick);
        //りすなクラスのインスタンスを生成
        HelloListener listener = new HelloListener();
        //表示ボタンにりす名を設定
        btClick.setOnClickListener(listener);
    }


    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View View){
            //名前入力蘭であるEditTextオブジェクトを取得
            EditText input = findViewById(R.id.etName);
            //メッセージを表示するTextViewオブジェクトを取得
            TextView output = findViewById(R.id.tvOutput);
            //入力された名前文字列を取得
            String inputStr = input.getText().toString();
            //メッセージを表示
            output.setText(inputStr + "さん、こんにちは！");
        }
    }
}