package com.example.alumfial1.factorial_igorcb.Interface;

import android.content.Intent;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public interface Interfaz_Factorial {

    interface View{
        void mostrarResultado(String r);
    }
    interface Presenter{
        void mostrarResultado(String r);
        void Factorial(String n);
    }
    interface Model{
        void mFactorial(int n);
    }

}
