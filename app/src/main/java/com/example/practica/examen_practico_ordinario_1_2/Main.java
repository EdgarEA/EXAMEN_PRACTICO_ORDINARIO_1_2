package com.example.practica.examen_practico_ordinario_1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main extends AppCompatActivity {

    TextView txtVwResultado,txtVwResultadoF,txtVwVida;
    RadioGroup rdGrp;
    RadioButton rdBtnAlgebraica,rdBtnAritmetica;
    EditText edtTxtRes, edtTxtNum1,edtTxtNum2,edtTxtNum3,edtTxtNum4,edtTxtNum5;
    Button btnVerificar, btnVerificar2;
    int vida = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdBtnAlgebraica=  findViewById(R.id.rdBtnAlgebraica);
        rdBtnAritmetica = findViewById(R.id.rdBtnAritmetica);
        edtTxtRes = findViewById(R.id.edtTxtRes);
        btnVerificar = findViewById(R.id.btnVerificar);
        btnVerificar2=findViewById(R.id.btnVerificar2);
        txtVwResultado = findViewById(R.id.txtVwResultado);
        edtTxtNum1 = findViewById(R.id.edtTxtNum1);
        edtTxtNum2=findViewById(R.id.edtTxtNum2);
        edtTxtNum3=findViewById(R.id.edtTxtNum3);
        edtTxtNum4=findViewById(R.id.edtTxtNum4);
        edtTxtNum5=findViewById(R.id.edtTxtNum5);
        txtVwResultadoF=findViewById(R.id.txtVwResultadoF);
        txtVwVida=findViewById(R.id.txtVwVida);
        rdGrp= findViewById(R.id.rdGrp);

        //int COMPARACION;






/*
rdBtnAritmetica.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
     Aritmetica();





    }});




rdBtnAlgebraica.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    Algebraica();




    }
}); //CIERRE LISTENER
*/



    } //CIERRE DE ONCREATE

    /*
    public void onRadioButtonClicked(View v){

        if (rdBtnAritmetica.isChecked()) {
            Aritmetica();
        } else if (rdBtnAlgebraica.isChecked()) {
            Algebraica();
        }
    }
*/

prueba();



    public void Aritmetica() {
        //define a new Random class
        Random r = new Random();

        //minimum number to generate as random number
        int minNumber = 1;

        //maximum number to generate as random number
        int maxNumber = 10;

        //get the next random number within range
        // Inclusive both minimum and maximum value
        int an= r.nextInt((maxNumber-minNumber)+1)+minNumber; //NUMERO INICIAL
        int D = r.nextInt((maxNumber-minNumber)+1)+minNumber; //DISTANCIA RANDOM


        int number2 = an+(2-1)*D;
        int number3 = an+(3-1)*D;
        int number4 = an+(4-1)*D;
        int number5 = an+(5-1)*D;

        edtTxtNum1.setText(String.valueOf(an));
        edtTxtNum2.setText(String.valueOf(number2));
        edtTxtNum3.setText(String.valueOf(number3));
        edtTxtNum4.setText(String.valueOf(number4));
        edtTxtNum5.setText(String.valueOf(number5));




        ///////////



        //define a new Random class
        Random r2 = new Random();

        //minimum number to generate as random number
        int minNumber2 = 2;

        //maximum number to generate as random number
        int maxNumber2 = 5;

        //get the next random number within range
        // Inclusive both minimum and maximum value
        int numelegir = r2.nextInt((maxNumber2-minNumber2)+1)+minNumber2;



        //POSIBILIDADES SELFNOTE: DEBI HABERLLO HECHO CON UN ARRAY O OTRA MANERA QUE ASCO.

        if(numelegir==2){

            txtVwResultado.setText(edtTxtNum2.getText().toString());
            edtTxtNum2.setText("Calcula");

            /*  COMPARACION=Integer.parseInt(edtTxtNum2.getText().toString());*/


/*double number2 = Double.parseDouble(edtTxtRadio.getText().toString());
            double number1 = Double.parseDouble(edtTxtPi.getText().toString());
            double op= (((4*(number1*Math.PI))*Math.pow(number2,3)/3));
            txtVwResu.setText("Resultado es;"+String.valueOf(op));*/ //IGNORAR

        }
        else if(numelegir==3){

            txtVwResultado.setText(edtTxtNum3.getText().toString());
            edtTxtNum3.setText("Calcula");

            /*   COMPARACION=Integer.parseInt(edtTxtNum3.getText().toString());*/


        }

        else if(numelegir==4){

            txtVwResultado.setText(edtTxtNum4.getText().toString());
            edtTxtNum4.setText("Calcula");
            /*   COMPARACION=Integer.parseInt(edtTxtNum4.getText().toString());*/
        }

        else if(numelegir==5){

            txtVwResultado.setText(edtTxtNum5.getText().toString());
            edtTxtNum5.setText("Calcula");


        }

    }

    public void Algebraica(){

        //define a new Random class
        Random r = new Random();

        //minimum number to generate as random number
        int minNumber = 1;

        //maximum number to generate as random number
        int maxNumber = 10;


        //FOR THE POW
        //minimum number to generate as random number
        int minNumber2 = 2;

        //maximum number to generate as random number
        int maxNumber2 = 4;

        //get the next random number within range
        // Inclusive both minimum and maximum value
        int an= r.nextInt((maxNumber-minNumber)+1)+minNumber; //NUMERO INICIAL
        int D = r.nextInt((maxNumber2-minNumber2)+1)+minNumber2; //DISTANCIA RANDOM


        //N ES EL TERMINO A CALCULAR Y R/D ES EL QUE MULTIPLICA LOS TERMINOS

        int number2 = (int) Math.pow((an*D),(2-1));
        int number3 = (int) Math.pow((an*D),(3-1));
        int number4 = (int) Math.pow((an*D),(4-1));
        int number5 = (int) Math.pow((an*D),(5-1));

        edtTxtNum1.setText(String.valueOf(an));
        edtTxtNum2.setText(String.valueOf(number2));
        edtTxtNum3.setText(String.valueOf(number3));
        edtTxtNum4.setText(String.valueOf(number4));
        edtTxtNum5.setText(String.valueOf(number5));




        ///////////



        //define a new Random class
        Random r2 = new Random();

        //minimum number to generate as random number
        int minNumber3 = 2;

        //maximum number to generate as random number
        int maxNumber3 = 5;

        //get the next random number within range
        // Inclusive both minimum and maximum value
        int numelegir = r2.nextInt((maxNumber3-minNumber3)+1)+minNumber3;



        //POSIBILIDADES SELFNOTE: DEBI HABERLLO HECHO CON UN ARRAY O OTRA MANERA QUE ASCO.
        //COLOCA LA RESPUESTA COMO CALCULA Y OBTIENE EL VALOR DE LA RESPUESTA

        if(numelegir==2){

            txtVwResultado.setText(edtTxtNum2.getText().toString());
            edtTxtNum2.setText("Calcula");

            /*  COMPARACION=Integer.parseInt(edtTxtNum2.getText().toString());*/


/*double number2 = Double.parseDouble(edtTxtRadio.getText().toString());
            double number1 = Double.parseDouble(edtTxtPi.getText().toString());
            double op= (((4*(number1*Math.PI))*Math.pow(number2,3)/3));
            txtVwResu.setText("Resultado es;"+String.valueOf(op));*/ //IGNORAR

        }
        else if(numelegir==3){

            txtVwResultado.setText(edtTxtNum3.getText().toString());
            edtTxtNum3.setText("Calcula");

            /*   COMPARACION=Integer.parseInt(edtTxtNum3.getText().toString());*/


        }

        else if(numelegir==4){

            txtVwResultado.setText(edtTxtNum4.getText().toString());
            edtTxtNum4.setText("Calcula");
            /*   COMPARACION=Integer.parseInt(edtTxtNum4.getText().toString());*/
        }

        else if(numelegir==5){

            txtVwResultado.setText(edtTxtNum5.getText().toString());
            edtTxtNum5.setText("Calcula");


        }

    }









    public void onClick2(View view) {
        int ver1= Integer.parseInt(edtTxtRes.getText().toString());
        int ver2= Integer.parseInt(txtVwResultado.getText().toString());

        if (ver1==ver2){
            Toast.makeText(Main.this, "GANASTE", Toast.LENGTH_SHORT).show();
            Toast.makeText(Main.this, "REINICIANDO", Toast.LENGTH_SHORT).show();
            prueba2();
            vida = 1;
        }else {

            switch (vida){
                case 1:
                    Toast.makeText(Main.this, "PERDISTE (QUEDAN 2 INTENTOS)", Toast.LENGTH_SHORT).show();
                    vida++;
                    break;
                case 2:
                    Toast.makeText(Main.this, "PERDISTE (QUEDA 1 INTENTOS)", Toast.LENGTH_SHORT).show();
                    vida++;
                    break;
                case 3:
                    Toast.makeText(Main.this, "PERDISTE: REINICIANDO", Toast.LENGTH_SHORT).show();
                    vida = 1;
                    prueba2();

                    break;
                default:
                    Toast.makeText(Main.this, "DEFAULT", Toast.LENGTH_SHORT).show();
                    break;
            }

        }
}
    
    /////
        public void prueba(){

        rdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (rdBtnAlgebraica.isChecked()){
                    Toast.makeText(Main.this, "Algebraico", Toast.LENGTH_SHORT).show();
                }else {
                    Aritmetico();
                    Toast.makeText(Main.this, "Aritmetico", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    public void prueba2(){

        if (rdBtnAlgebraica.isChecked()){
            Toast.makeText(Main.this, "Algebraico", Toast.LENGTH_SHORT).show();
        }else {
            Aritmetico();
            Toast.makeText(Main.this, "Aritmetico", Toast.LENGTH_SHORT).show();
        }
    }
    ////




}
