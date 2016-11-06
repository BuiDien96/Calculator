package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity{

   private TextView txtvTinhtoan, txtvResult;
   private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero,
           btnAdd, btnSub, btnMult, btnDiv, btnDelete, btnEqual;
   private double numOne, numTwo;
   private boolean mAdd=false, mSub=false, mMult=false, mDiv=false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapped();

        btnOne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"1");
            }
        });

        btnTwo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"2");
            }
        });

        btnThree.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"3");
            }
        });

        btnFour.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"4");
            }
        });

        btnFive.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"5");
            }
        });

        btnSix.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"6");
            }
        });

        btnSeven.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"7");
            }
        });

        btnEight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"8");
            }
        });

        btnNine.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"9");
            }
        });

        btnZero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvResult.setText(txtvResult.getText()+"0");
            }
        });

        btnAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtvResult==null){
                    txtvResult.setText("");
                }
                else {
                    txtvTinhtoan.setText(txtvResult.getText()+"+");
                    String temp= (String) txtvResult.getText();
                    numOne=Double.parseDouble(temp);
                    mAdd = true;
                    txtvResult.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtvResult == null){
                    txtvResult.setText("");
                }else {
                    txtvTinhtoan.setText(txtvResult.getText()+"-");
                    String temp= (String) txtvResult.getText();
                    numOne= Double.parseDouble(temp);
                    mSub= true;
                    txtvResult.setText(null);
                }
            }
        });

        btnMult.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtvResult==null){
                    txtvResult.setText("");
                }else {
                    txtvTinhtoan.setText(txtvResult.getText()+"*");
                    String temp= (String) txtvResult.getText();
                    numOne= Double.parseDouble(temp);
                    mMult=true;
                    txtvResult.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtvResult.getText().length()==0){
                    txtvResult.setText("");
                }else {
                    txtvTinhtoan.setText(txtvResult.getText()+"/");
                    String temp= (String) txtvResult.getText();
                    numOne= Double.parseDouble(temp);//txtvTinhtoan.getText()+""
                    mDiv= true;
                    txtvResult.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                numTwo= Double.parseDouble(txtvResult.getText()+"");
                if (mAdd==true){
                    txtvResult.setText(numOne + numTwo+"");
                    txtvTinhtoan.setText("");
                    mAdd= false;
                }
                if (mSub==true){
                    txtvResult.setText(numOne - numTwo+"");
                    txtvTinhtoan.setText("");
                    mSub=false;
                }
                if (mMult==true){
                    txtvResult.setText(numOne * numTwo+"");
                    txtvTinhtoan.setText("");
                    mMult=false;
                }
                if (mDiv==true){
                    if (txtvResult.getText()=="0"){
                        Toast.makeText(getApplicationContext(),"Error", Toast.LENGTH_SHORT).show();
                    }
                    txtvResult.setText(numOne/numTwo+"");
                    txtvTinhtoan.setText("");
                    mDiv=false;
                }
            }
        });

        btnDelete.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp= (String) txtvResult.getText();
                if (!temp.isEmpty()){
                    temp = temp.substring(0, temp.length()-1);
                }
                txtvResult.setText(temp);
            }
        });
//nhan giu phim C thi se xoa het
        btnDelete.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                txtvResult.setText(null);
                txtvTinhtoan.setText(null);
                return false;
            }
        });


    }

    public void Mapped(){
        txtvResult= (TextView) findViewById(R.id.txtvResult);
        txtvTinhtoan= (TextView) findViewById(R.id.txtvTinhtoan);
        btnZero= (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnEqual= (Button) findViewById(R.id.btnEqual);
    }


}
