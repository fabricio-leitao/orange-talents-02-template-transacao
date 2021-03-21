package br.com.zup.transacao;

public class EstabelecimentoRequest {

    private String id;

    private String nome;

    private String cidade;

    private String endereco;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Estabelecimento toModel() {
        return new Estabelecimento(id, nome, cidade, endereco);
    }
}
