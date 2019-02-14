package com.favio.buscaminas;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Buscaminas extends AppCompatActivity implements View.OnClickListener{

    Button btn_nuevo, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13,
            btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25;
    TextView txtv_resultado;
    boolean x1=false, x2=false, x3=false, x4=false, x5=false, x6=false, x7=false, x8=false, x9=false, x10=false, x11=false, x12=false, x13=false,
            x14=false,  x15=false,  x16=false,  x17=false,  x18=false, x19=false,  x20=false,  x21=false,  x22=false,  x23=false,  x24=false,
            x25=false;
    int contadorBombas=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscaminas);

        btn_nuevo=findViewById(R.id.btn_nuevo);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn14=findViewById(R.id.btn14);
        btn15=findViewById(R.id.btn15);
        btn16=findViewById(R.id.btn16);
        btn17=findViewById(R.id.btn17);
        btn18=findViewById(R.id.btn18);
        btn19=findViewById(R.id.btn19);
        btn20=findViewById(R.id.btn20);
        btn21=findViewById(R.id.btn21);
        btn22=findViewById(R.id.btn22);
        btn23=findViewById(R.id.btn23);
        btn24=findViewById(R.id.btn24);
        btn25=findViewById(R.id.btn25);
        txtv_resultado=findViewById(R.id.txtv_resultado);

        btn_nuevo.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        btn16.setEnabled(false);
        btn17.setEnabled(false);
        btn18.setEnabled(false);
        btn19.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn23.setEnabled(false);
        btn24.setEnabled(false);
        btn25.setEnabled(false);
    }

    @Override
    public void onClick(View v) {

        Drawable bomba=getResources().getDrawable(R.drawable.bomba);
        Drawable bien=getResources().getDrawable(R.drawable.bien);

        switch(v.getId()){

            case R.id.btn_nuevo:
                jugar();
                break;
            case R.id.btn1:
                if(x1==true){
                    btn1.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn1.setBackground(bien);
                }
                break;
            case R.id.btn2:
                if(x2==true){
                    btn2.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn2.setBackground(bien);
                }
                break;
            case R.id.btn3:
                if(x3==true){
                    btn3.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn3.setBackground(bien);
                }
                break;
            case R.id.btn4:
                if(x4==true){
                    btn4.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn4.setBackground(bien);
                }
                break;
            case R.id.btn5:
                if(x5==true){
                    btn5.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn5.setBackground(bien);
                }
                break;
            case R.id.btn6:
                if(x6==true){
                    btn6.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn6.setBackground(bien);
                }
                break;
            case R.id.btn7:
                if(x7==true){
                    btn7.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn7.setBackground(bien);
                }
                break;
            case R.id.btn8:
                if(x8==true){
                    btn8.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn8.setBackground(bien);
                }
                break;
            case R.id.btn9:
                if(x9==true){
                    btn9.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn9.setBackground(bien);
                }
                break;
            case R.id.btn10:
                if(x10==true){
                    btn10.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn10.setBackground(bien);
                }
                break;
            case R.id.btn11:
                if(x11==true){
                    btn11.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn11.setBackground(bien);
                }
                break;
            case R.id.btn12:
                if(x12==true){
                    btn12.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn12.setBackground(bien);
                }
                break;
            case R.id.btn13:
                if(x13==true){
                    btn13.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn13.setBackground(bien);
                }
                break;
            case R.id.btn14:
                if(x14==true){
                    btn14.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn14.setBackground(bien);
                }
                break;
            case R.id.btn15:
                if(x15==true){
                    btn15.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn15.setBackground(bien);
                }
                break;
            case R.id.btn16:
                if(x16==true){
                    btn16.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn16.setBackground(bien);
                }
                break;
            case R.id.btn17:
                if(x17==true){
                    btn17.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn17.setBackground(bien);
                }
                break;
            case R.id.btn18:
                if(x18==true){
                    btn18.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn18.setBackground(bien);
                }
                break;
            case R.id.btn19:
                if(x19==true){
                    btn19.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn19.setBackground(bien);
                }
                break;
            case R.id.btn20:
                if(x20==true){
                    btn20.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn20.setBackground(bien);
                }
                break;
            case R.id.btn21:
                if(x21==true){
                    btn21.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn21.setBackground(bien);
                }
                break;
            case R.id.btn22:
                if(x22==true){
                    btn22.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn22.setBackground(bien);
                }
                break;
            case R.id.btn23:
                if(x23==true){
                    btn23.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn23.setBackground(bien);
                }
                break;
            case R.id.btn24:
                if(x24==true){
                    btn24.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn24.setBackground(bien);
                }
                break;
            case R.id.btn25:
                if(x25==true){
                    btn25.setBackground(bomba);
                    contadorBombas++;
                    verificar();
                }else{
                    btn25.setBackground(bien);
                }
                break;
        }
    }

    public void verificar(){

        if(contadorBombas==5){

            txtv_resultado.setText("Has perdido");
            txtv_resultado.setTextColor(Color.RED);

            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            btn10.setEnabled(false);
            btn11.setEnabled(false);
            btn12.setEnabled(false);
            btn13.setEnabled(false);
            btn14.setEnabled(false);
            btn15.setEnabled(false);
            btn16.setEnabled(false);
            btn17.setEnabled(false);
            btn18.setEnabled(false);
            btn19.setEnabled(false);
            btn20.setEnabled(false);
            btn21.setEnabled(false);
            btn22.setEnabled(false);
            btn23.setEnabled(false);
            btn24.setEnabled(false);
            btn25.setEnabled(false);
        }
    }

    public void jugar(){

        txtv_resultado.setText("");

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
        btn17.setEnabled(true);
        btn18.setEnabled(true);
        btn19.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
        btn23.setEnabled(true);
        btn24.setEnabled(true);
        btn25.setEnabled(true);

        contadorBombas=0;

        x1=false;
        x2=false;
        x3=false;
        x4=false;
        x5=false;
        x6=false;
        x7=false;
        x8=false;
        x9=false;
        x10=false;
        x11=false;
        x12=false;
        x13=false;
        x14=false;
        x15=false;
        x16=false;
        x17=false;
        x18=false;
        x19=false;
        x20=false;
        x21=false;
        x22=false;
        x23=false;
        x24=false;
        x25=false;

        Drawable fondo=getResources().getDrawable(R.drawable.fondo);

        btn1.setBackground(fondo);
        btn2.setBackground(fondo);
        btn3.setBackground(fondo);
        btn4.setBackground(fondo);
        btn5.setBackground(fondo);
        btn6.setBackground(fondo);
        btn7.setBackground(fondo);
        btn8.setBackground(fondo);
        btn9.setBackground(fondo);
        btn10.setBackground(fondo);
        btn11.setBackground(fondo);
        btn12.setBackground(fondo);
        btn13.setBackground(fondo);
        btn14.setBackground(fondo);
        btn15.setBackground(fondo);
        btn16.setBackground(fondo);
        btn17.setBackground(fondo);
        btn18.setBackground(fondo);
        btn19.setBackground(fondo);
        btn20.setBackground(fondo);
        btn21.setBackground(fondo);
        btn22.setBackground(fondo);
        btn23.setBackground(fondo);
        btn24.setBackground(fondo);
        btn25.setBackground(fondo);

        for (int i=0; i<5; i++){

            Random rdm=new Random();
            int num=rdm.nextInt(25)+1;

            switch(num){

                case 1:
                    x1=true;
                    break;
                case 2:
                    x2=true;
                    break;
                case 3:
                    x3=true;
                    break;
                case 4:
                    x4=true;
                    break;
                case 5:
                    x5=true;
                    break;
                case 6:
                    x6=true;
                    break;
                case 7:
                    x7=true;
                    break;
                case 8:
                    x8=true;
                    break;
                case 9:
                    x9=true;
                    break;
                case 10:
                    x10=true;
                    break;
                case 11:
                    x11=true;
                    break;
                case 12:
                    x12=true;
                    break;
                case 13:
                    x13=true;
                    break;
                case 14:
                    x14=true;
                    break;
                case 15:
                    x15=true;
                    break;
                case 16:
                    x16=true;
                    break;
                case 17:
                    x17=true;
                    break;
                case 18:
                    x18=true;
                    break;
                case 19:
                    x19=true;
                    break;
                case 20:
                    x20=true;
                    break;
                case 21:
                    x21=true;
                    break;
                case 22:
                    x22=true;
                    break;
                case 23:
                    x23=true;
                    break;
                case 24:
                    x24=true;
                    break;
                case 25:
                    x25=true;
                    break;
            }
        }

    }
}
