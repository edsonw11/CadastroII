package br.com.smiles.cadastroii;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.fragments.ListaAlunosFragment;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framePrincipal, new ListaAlunosFragment());
        fragmentTransaction.commit();

        }
    }

