package com.example.alumfial1.factorial_igorcb.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alumfial1.factorial_igorcb.Interface.Interfaz_Factorial;
import com.example.alumfial1.factorial_igorcb.R;
import com.example.alumfial1.factorial_igorcb.Presentador.P_Factorial;

public class MainActivity extends AppCompatActivity implements Interfaz_Factorial.View{
    private TextView txtRespuesta;
    private EditText txtdato;
    private Interfaz_Factorial.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRespuesta = (TextView) findViewById(R.id.edtrespuesta);
        txtdato =(EditText) findViewById(R.id.edtdato);

        presenter = new P_Factorial(this);
    }

    public void calcular(View view){
        presenter.Factorial(txtdato.getText().toString());
    }

    @Override
    public void mostrarResultado(String r) {
        txtRespuesta.setText(r);
    }


}


