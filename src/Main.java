import Model.BibliotecaDeMidias;
import Model.Midia;
import Model.Playlist;
import Model.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        System.out.println("\n Biblioteca de Midias \n"+"\n Digite o que deseja \n");



        ArrayList<Midia> midias = new ArrayList<>();

        midias.add(new Midia("Analua", "2004", "reggae"));
        midias.add(new Midia("Toca uma reggueira ai", "2004", "reggae"));
        midias.add(new Midia("Paulinha", "2004", "reggae"));

        Usuario usuario = new Usuario("fERNANDO","fER2563");

        BibliotecaDeMidias biblioteca= new BibliotecaDeMidias(midias,usuario);
        int escolha=10;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1- Tocar minha playlist musica ");
            System.out.println("2- Tocar proxima midia");
            System.out.println("3- Tocar minha playlist musica");
            System.out.println("1- Tocar minha playlist musica ");
            System.out.println();

            escolha = sc.nextInt();
            switch (escolha){
                case 1: {
                    biblioteca.getPlaylist().getMidia_atual();
                    biblioteca.tocar_playlist_music();
                    break;
                }
                case 2:{
                    biblioteca.getPlaylist().proxima_midia();
                    biblioteca.tocar_playlist_music();
                    break;

                }
                case 3:{
                    biblioteca.getPlaylist().midia_anterior();
                    biblioteca.tocar_playlist_music();
                    break;

                }

                default:{
                    biblioteca.tocar_playlist_music();
                    break;
                }

            }
        }

        while (escolha!=10);


    }




}