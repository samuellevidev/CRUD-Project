public class Musicas {
    //Atributos (As caracteristicas do objeto "Musicas"):
    private String nome;
    private String artista;
    private String genero;
    private double duracao;
    private String playlist;
    public String linha;

    //Métodos Getters e Setters (Encapsulamento):

    //Atributo "Nome"
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //Atributo "Artista"
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getArtista() {
        return artista;
    }

    //Atributo "Gênero"
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }

    //Atributo "Duração"
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public double getDuracao() {
        return duracao;
    }

    //Atributo "Playlist":
    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }
    public String getPlaylist() {
        return playlist;
    }
    //Método Construtor:
    public Musicas(String nome, String artista, String genero, double duracao) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.duracao = duracao;
    }
}