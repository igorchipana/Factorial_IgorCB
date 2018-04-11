package com.example.alumfial1.factorial_igorcb.Presentador;

import android.content.Intent;

import com.example.alumfial1.factorial_igorcb.Interface.Interfaz_Factorial;
import com.example.alumfial1.factorial_igorcb.Model.Modelo_Factorial;
import com.example.alumfial1.factorial_igorcb.View.MainActivity;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public class P_Factorial implements Interfaz_Factorial.Presenter{
    private MainActivity view;
    private Modelo_Factorial model;

    public P_Factorial(MainActivity view){
        this.view = view;
        model = new Modelo_Factorial(this);
    }
    @Override
    public void mostrarResultado(String r) {
        if(view!=null){
            view.mostrarResultado(r);
        }
    }

    @Override
    public void Factorial(String n) {
        if(view!=null){
            model.mFactorial(Integer.parseInt(n));
        }
    }
}
