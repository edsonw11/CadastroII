package br.com.smiles.cadastroii.br.com.smiles.cadastroii.br.com.smiles.cadastroii.bean;

/**
 * Created by smiles.ebatista on 8/22/2016.
 */
public class Aluno {

    private int id;
    private String nome;
    private String pathPicture;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getPathPicture() {
        return pathPicture;
    }

    public void setPathPicture(String pathPicture) {
        this.pathPicture = pathPicture;
    }

    @Override
    public String toString() {
        return nome;
    }
}
