public class Livro {
    private String titulo ;
    private String autor;
    private int anoPublicao;
    private int exemplaresDisponiveis;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicao = 2024;
        this.exemplaresDisponiveis = 1;

    }    
    public Livro(String titulo, String autor, int ano, int exemplar) {
        this.titulo = titulo;
        this.exemplaresDisponiveis= exemplar;
        this.anoPublicao = ano;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAnoPublicacao(int ano) {
        this.anoPublicao = ano;
    }
    public int getAnoPublicacao() {
        return this.anoPublicao;
    }
    public void setExemplaresDisponiveis(int exemplar) {
        this.exemplaresDisponiveis = exemplar ;
    }
    public int getExemplaresDisponiveis(){
       return this.exemplaresDisponiveis;
    }
    public void exibirDetalhes() {
        System.out.println(this.autor);
        System.out.println(this.titulo);
        System.out.println(this.anoPublicao);
        System.out.println(this.exemplaresDisponiveis);
    }
        

}

