package com.example.admin.myprogramm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public int i,j,result=0;
    public int[] b=new int[10];
    public boolean multiply,summ=false;

    public void tryhard(View view){
        TextView out=(TextView)findViewById(R.id.outputTXT);
        out.setText("Привет в "+ i+" раз!");
        i++;
    }
    public void cAME(View view){
        TextView in = (TextView)findViewById(R.id.editText);
        String a=in.getText().toString();
        TextView out=(TextView)findViewById(R.id.outputTXT);
        out.setText("Получилось "+a+" трижды Ура!");
    }
    public void summ(View view){
        TextView in = (TextView) findViewById(R.id.editText);
        String a = in.getText().toString();
        TextView out=(TextView)findViewById(R.id.outputTXT);
        if(!summ) {
            result += Integer.parseInt(a);
            in.setText("");
            out.setText(Integer.toString(result));
            summ=true;
        }else{
            result+=Integer.parseInt(a);
            out.setText(Integer.toString(result));
            in.setText("");
            summ=false;
        }
    }
    public void multiply(View view){
        TextView in = (TextView) findViewById(R.id.editText);
        String a = in.getText().toString();
        TextView out=(TextView)findViewById(R.id.outputTXT);
        if(!multiply) {
            if(result!=0) {
                result *= Integer.parseInt(a);
            }else{
                result=Integer.parseInt(a);
            }
            in.setText("");
            out.setText(Integer.toString(result));
            multiply=true;
        }else{
            result*=Integer.parseInt(a);
            out.setText(Integer.toString(result));
            in.setText("");
            multiply=false;
        }
    }
    public void result(View view){
        TextView in = (TextView) findViewById(R.id.editText);
        String a = in.getText().toString();
        TextView out=(TextView)findViewById(R.id.outputTXT);
        if(multiply) {
            result*=Integer.parseInt(a);
            out.setText(Integer.toString(result));
            in.setText("");
            multiply=false;
        }else{
            if(summ){
                result+=Integer.parseInt(a);
                out.setText(Integer.toString(result));
                in.setText("");
                summ=false;
            } else{
                out.setText(Integer.toString(result));
                in.setText("");
            }
        }
        result=0;
    }

}
