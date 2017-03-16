package steve_cochran.calculator_project_cochran_z;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.nio.FloatBuffer;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    private String count = "";
    private String fullCount = "";
    private String op = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);


    }


    public void c0(View v) {

        if (count == "0" || count == "") {
        } else {

            count = count + "0";

            textView.setText(count);

            Log.d("textView", textView.toString());

        }
    }

    public void c1(View v) {


        if (count == "0" || count == "") {
            count = "1";
            textView.setText(count);

        } else {

            count = count + "1";

            textView.setText(count);

        }

    }

    public void c2(View v) {


        if (count == "0" || count == "") {
            count = "2";
            textView.setText(count);

        } else {

            count = count + "2";

            textView.setText(count);


        }

    }

    public void c3(View v) {


        if (count == "0" || count == "") {
            count = "3";
            textView.setText(count);

        } else {

            count = count + "3";

            textView.setText(count);

        }

    }

    public void c4(View v) {


        if (count == "0" || count == "") {
            count = "4";
            textView.setText(count);

        } else {

            count = count + "4";

            textView.setText(count);

        }

    }

    public void c5(View v) {


        if (count == "0" || count == "") {
            count = "5";
            textView.setText(count);

        } else {

            count = count + "5";

            textView.setText(count);

        }

    }

    public void c6(View v) {


        if (count == "0" || count == "") {
            count = "6";
            textView.setText(count);

        } else {

            count = count + "6";

            textView.setText(count);

        }

    }

    public void c7(View v) {


        if (count == "0" || count == "") {
            count = "7";
            textView.setText(count);

        } else {

            count = count + "7";

            textView.setText(count);

        }

    }

    public void c8(View v) {


        if (count == "0" || count == "") {
            count = "8";
            textView.setText(count);

        } else {

            count = count + "8";

            textView.setText(count);

        }

    }

    public void c9(View v) {


        if (count == "0" || count == "") {
            count = "9";
            textView.setText(count);

        } else {

            count = count + "9";

            textView.setText(count);

            Log.d("textView", textView.toString());

        }
    }

    public void cClear(View v) {

        count = "0";
        fullCount = "0";
        textView.setText(count);

        Log.d("textView", textView.toString());

    }

    public void cNeg(View v) {

        if (count.charAt(0) != '-') {

            count = '-' + count;

        } else {

            count = count.substring(1);

        }

        textView.setText(count);
        Log.d("textView", textView.toString());

    }

    public void cPer(View v) {

        float i1 = Integer.parseInt(count);
        Float rtnval;

        rtnval = i1 / 100;

        textView.setText(rtnval.toString());

        Log.d("textView", textView.toString());

    }

    public void cDivide(View v) {
        fullCount = count;
        count = "";
        op = "/";

        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }

    public void cMult(View v) {
        fullCount = count;
        count = "";
        op = "x";

        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }

    public void cSub(View v) {

        fullCount = count;
        count = "";
        op = "-";

        textView.setText(count.toString());

        Log.d("textView", textView.toString());


    }

    public void cAdd(View v) {
        fullCount = count;
        count = "";
        op = "+";

        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }

    public void cEquals(View v) {

        Double rtnval = 0.0;

        if (op == "+") {

            Double i1 = Double.parseDouble(fullCount);
            Double i2 = Double.parseDouble(count);

            rtnval = i1 + i2;
            count = rtnval.toString();
            fullCount = "0";
        }


        if (op == "-") {

            Double i1 = Double.parseDouble(fullCount);
            Double i2 = Double.parseDouble(count);

            rtnval = i1 - i2;
            count = rtnval.toString();
            fullCount = "0";
        }


        if (op == "x") {

            Double i1 = Double.parseDouble(fullCount);
            Double i2 = Double.parseDouble(count);

            rtnval = i1 * i2;
            count = rtnval.toString();
            fullCount = "0";
        }


        if (op == "/") {

            Double i1 = Double.parseDouble(fullCount);
            Double i2 = Double.parseDouble(count);

            rtnval = i1 / i2;
            count = rtnval.toString();
            fullCount = "0";
        }

        textView.setText(rtnval.toString());

        Log.d("textView", textView.toString());

    }

    public void cDec(View v) {

        int size = count.length();
        Double number = Double.parseDouble(count);

        if ((number % 1 == 0) && count.charAt(size - 1) != '.') {

            count = count + ".";

        } else {


        }

        textView.setText(count.toString());

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("countSave", count);
        outState.putString("fullCountSave", fullCount);
        outState.putString("opSave", op);


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        count = savedInstanceState.getString("countSave");
        fullCount = savedInstanceState.getString("fullCountSave");
        op = savedInstanceState.getString("opSave");

        textView.setText(count.toString());

    }

}
