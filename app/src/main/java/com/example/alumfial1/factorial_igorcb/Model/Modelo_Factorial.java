package com.example.alumfial1.factorial_igorcb.Model;

import android.content.Intent;

import com.example.alumfial1.factorial_igorcb.Interface.Interfaz_Factorial;

import java.net.Inet4Address;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public class Modelo_Factorial implements Interfaz_Factorial.Model {

    private Interfaz_Factorial.Presenter presenter;
    private double resultado;

    public Modelo_Factorial(Interfaz_Factorial.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override

    public void mFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = i * factorial;


            resultado = factorial;
            presenter.mostrarResultado(String.valueOf(resultado));
        }
    }
}