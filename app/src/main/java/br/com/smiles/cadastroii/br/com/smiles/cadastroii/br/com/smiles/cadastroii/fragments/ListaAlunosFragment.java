package br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.smiles.cadastroii.R;
import br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.bean.Aluno;
import br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.adapters.AdapterListaAlunoCuston;

/**
 * Created by smiles.ebatista on 8/22/2016.
 */
public class ListaAlunosFragment extends Fragment {

    private ListView listaAlunos;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle savedInstanceState) {

        View listLayoutAlunosFragment = inflater.inflate(R.layout.lista_alunos_fragment,container,false);

        listaAlunos =(ListView) listLayoutAlunosFragment.findViewById(R.id.list_view_aluno_fragment);

        listaAlunos.setAdapter(new AdapterListaAlunoCuston(getActivity(),getList()));

        listaAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Aluno alunoSelected = (Aluno)parent.getItemAtPosition(position);

                Toast.makeText(getActivity(),"Aluno Selecionado : " + alunoSelected.getNome(),Toast.LENGTH_SHORT).show();

            }
        });

        return listLayoutAlunosFragment;
    }



    private List<Aluno> getList() {

        Aluno a1 = new Aluno(1,"Edson");
        Aluno a2 = new Aluno(2,"Roberto");
        Aluno a3 = new Aluno(3,"Alan");
        Aluno a4 = new Aluno(4,"Ricardo");
        Aluno a5 = new Aluno(1,"Anderson");
        Aluno a6 = new Aluno(2,"Ronaldo");
        Aluno a7 = new Aluno(3,"Bob");
        Aluno a8 = new Aluno(4,"Julio");

        List<Aluno> list = new ArrayList<Aluno>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        list.add(a7);
        list.add(a8);
        return list;

    }


}
