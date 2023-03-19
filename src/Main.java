import Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        //-------------Menu inicial-------------------------------------------------

        System.out.println("\n Biblioteca de Midias \n"+"\n Digite o que deseja \n");


        ArrayList<Ator> atores = new ArrayList<>();
        atores.add(new Ator("Fernando","15/07/1991","masc","ator"));

        ArrayList<Musico> musicos = new ArrayList<>();
        musicos.add(new Musico("","","",""));

        ArrayList<Midia> midias = new ArrayList<>();
        //-------------Dados mocados-------------------------------------------------
        midias.add(new Midia("Analua", "2004", "reggae"));
        midias.add(new Midia("Toca uma reggueira ai", "2004", "reggae"));
        midias.add(new Midia("Paulinha", "2004", "reggae"));

        Usuario usuario = new Usuario("fERNANDO","fER2563");

        BibliotecaDeMidias biblioteca= new BibliotecaDeMidias(midias,usuario);
        int escolha=10;
        Scanner sc = new Scanner(System.in);

        //-------------Interação usuario para executar metodos criados-----------------
        do {
            System.out.println("\n1- Tocar minha playlist musica ");
            System.out.println("2- Tocar proxima musica");
            System.out.println("3- Tocar musica anterior");
            System.out.println("10- Encerrar player ");
            System.out.println();

            escolha = sc.nextInt();
            switch (escolha){

                //-------------Utilizando metodo iniciando midia atual-----------------
                case 1: {
                    biblioteca.getPlaylist().getMidia_atual();
                    biblioteca.tocar_playlist_music();
                    break;
                }
                //-------------Utilizando metodo proxima musica-----------------
                case 2:{
                    biblioteca.getPlaylist().proxima_midia();
                    biblioteca.tocar_playlist_music();
                    break;

                }
                //-------------Utilizando metodo musica anterior-----------------
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