import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {

        //Instânciando o objeto "Musicas" utilizando o método construtor:
        Musicas musics = new Musicas(null, null, null, 0);

        //Criação da ArrayList:
        ArrayList <Musicas> lista_de_musicas = new ArrayList<>();

        //Utilizando o arquivo "MusicasTeste" como Arraylist:
        musics.setPlaylist("Playlist.txt");

        //Inicio da brincadeira:
        File arquivo = new File(musics.getPlaylist());
        Scanner leitor = new Scanner(arquivo);

        //Sistema de repetição para a tribuição dos valores na ArrayList:
        while (leitor.hasNextLine()) {
            musics.linha = leitor.nextLine();
            String[] coluna = musics.linha.split(";");

            musics.setNome(coluna[0]);
            musics.setArtista(coluna[1]);
            musics.setGenero(coluna[2]);
            musics.setDuracao(Double.parseDouble(coluna[3]));

            lista_de_musicas.add(new Musicas(musics.getNome(),musics.getArtista(), musics.getGenero(), musics.getDuracao()));
        }
        leitor.close();

        System.out.println("Playlist Atual:");
        for (Musicas mu : lista_de_musicas) {
            System.out.format("\nNome: %s \nArtista: %s \nGênero: %s \nDuração: %.2f minutos. \n", mu.getNome(), mu.getArtista(), mu.getGenero(), mu.getDuracao());
        }
    }
}
