package sdu.example.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secundomer extends AppCompatActivity {
    TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundomer);
    }

    public void onClick(View v) {
        int n1;
        int n2;
        int res = 0;
        num = findViewById(R.id.num);
        switch (v.getId()) {
            case R.id.zero: num.setText(num.getText() + "0"); break;
            case R.id.one: num.setText(num.getText() + "1"); break;
            case R.id.two: num.setText(num.getText() + "2"); break;
            case R.id.three: num.setText(num.getText() + "3"); break;
            case R.id.four: num.setText(num.getText() + "4"); break;
            case R.id.five: num.setText(num.getText() + "5"); break;
            case R.id.six: num.setText(num.getText() + "6"); break;
            case R.id.seven: num.setText(num.getText() + "7"); break;
            case R.id.eight: num.setText(num.getText() + "8"); break;
            case R.id.nine: num.setText(num.getText() + "9"); break;
            case R.id.dot: num.setText(num.getText() + "."); break;
            case R.id.sum:
                num.setText(num.getText() + " + ");
                break;
            case R.id.minus:
                num.setText(num.getText() + " - ");
                break;
            case R.id.mult:
                num.setText(num.getText() + " × ");
                break;
            case R.id.divide:
                num.setText(num.getText() + " ÷ ");
                break;
            case R.id.clearr:
                num.setText(num.getText().toString().substring(0, num.getText().toString().length() -1));
                break;
            case R.id.result:
                if (num.getText().toString().contains("+")) {
                    String[] nums = num.getText().toString().split(" \\+ ");
                    try {
                        n1 = Integer.parseInt(nums[0]);
                        n2 = Integer.parseInt(nums[1]);
                        res = n1 + n2;
                        num.setText(res + "");
                    } catch (NumberFormatException ex) {
                        float n11 = Float.parseFloat(nums[0]);
                        float n22 = Float.parseFloat(nums[1]);
                        float re = n11 + n22;
                        num.setText(re + "");
                    }
                } else if (num.getText().toString().contains("-")) {
                    String[] nums = num.getText().toString().split(" - ");
                    n1 = Integer.parseInt(nums[0]);
                    n2 = Integer.parseInt(nums[1]);
                    res = n1 - n2;
                    num.setText(res + "");
                } else if (num.getText().toString().contains("×")) {
                    String[] nums = num.getText().toString().split(" \\× ");
                    try {
                        n1 = Integer.parseInt(nums[0]);
                        n2 = Integer.parseInt(nums[1]);
                        res = n1 * n2;
                        num.setText(res + "");
                    } catch (NumberFormatException ex) {
                        float n11 = Float.parseFloat(nums[0]);
                        float n22 = Float.parseFloat(nums[1]);
                        float re = n11 * n22;
                        num.setText(re + "");
                    }
                } else if (num.getText().toString().contains("÷")) {
                    String[] nums = num.getText().toString().split(" ÷ ");
                    try {
                        n1 = Integer.parseInt(nums[0]);
                        n2 = Integer.parseInt(nums[1]);
                        float re = n1 /(float) n2;
                        num.setText(re + "");
                    } catch (NumberFormatException ex) {
                        float n11 = Float.parseFloat(nums[0]);
                        float n22 = Float.parseFloat(nums[1]);
                        float re = n11 / n22;
                        num.setText(re + "");
                    }
                }
                break;
            case R.id.clear: num.setText(""); break;
        }
    }
}
