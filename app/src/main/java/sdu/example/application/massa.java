package sdu.example.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class massa extends AppCompatActivity {
    TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massa);
    }
    public void onClick(View v) {
        int n1;
        num = findViewById(R.id.num);
        switch (v.getId()) {
            case R.id.zero:
                num.setText(num.getText() + "0");
                break;
            case R.id.one:
                num.setText(num.getText() + "1");
                break;
            case R.id.two:
                num.setText(num.getText() + "2");
                break;
            case R.id.three:
                num.setText(num.getText() + "3");
                break;
            case R.id.four:
                num.setText(num.getText() + "4");
                break;
            case R.id.five:
                num.setText(num.getText() + "5");
                break;
            case R.id.six:
                num.setText(num.getText() + "6");
                break;
            case R.id.seven:
                num.setText(num.getText() + "7");
                break;
            case R.id.eight:
                num.setText(num.getText() + "8");
                break;
            case R.id.nine:
                num.setText(num.getText() + "9");
                break;
            case R.id.dot:
                num.setText(num.getText() + ".");
                break;
            case R.id.result:
                try {
                    num.setText(Integer.parseInt(num.getText().toString()) * 1000f + "");
                } catch (NumberFormatException ex) {
                    num.setText(Float.parseFloat(num.getText().toString()) * 1000.0f + "");
                }
                break;
            case R.id.clearr:
                if (!num.getText().equals("")) {
                    num.setText(num.getText().toString().substring(0, num.getText().toString().length() - 1));
                }
                break;
            case R.id.reverse:
                try {
                    num.setText(Integer.parseInt(num.getText().toString()) / 1000.0f + "");
                } catch (NumberFormatException ex) {
                    num.setText(Float.parseFloat(num.getText().toString()) * 1000.0f + "");
                }
                break;
            case R.id.clear:
                num.setText("");
                break;
        }
    }
}

