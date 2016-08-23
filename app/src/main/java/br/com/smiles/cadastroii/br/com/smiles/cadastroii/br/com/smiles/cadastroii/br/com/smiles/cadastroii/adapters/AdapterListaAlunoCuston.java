package br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.adapters;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import br.com.smiles.cadastroii.R;
import br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.bean.Aluno;

/**
 * Created by smiles.ebatista on 8/22/2016.
 */
public class AdapterListaAlunoCuston extends BaseAdapter {

    private Activity activity;
    private List<Aluno> listaAlunos;


    public AdapterListaAlunoCuston(Activity activity, List<Aluno> listaAlunos) {
        this.activity = activity;
        this.listaAlunos = listaAlunos;
    }



    @Override
    public int getCount() {
        return listaAlunos.size();
    }

    @Override
    public Aluno getItem(int position) {
        return listaAlunos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View viewXML = activity.getLayoutInflater().inflate(R.layout.lista_alunos_custon,parent,false);

        TextView lblText = (TextView) viewXML.findViewById(R.id.lblListaNome);
        lblText.setText(listaAlunos.get(position).getNome());

        ImageView imgView = (ImageView) viewXML.findViewById(R.id.imgFotoLista);

        Bitmap bitmap = null;

        if(listaAlunos.get(position).getPathPicture() == null){
            bitmap = BitmapFactory.decodeResource(activity.getResources(),R.drawable.ic_no_image);

        }else{
            bitmap = BitmapFactory.decodeFile(listaAlunos.get(position).getPathPicture());

            bitmap.createScaledBitmap(bitmap,100,100,true);
        }

        imgView.setImageBitmap(bitmap);


        return viewXML;
    }
}
