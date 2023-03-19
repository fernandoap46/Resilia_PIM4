# PROJETO INDIVIDUAL MODULO 4
## Biblioteca de Mídias


## Definição de tema

 Você foi contratado para modelar a biblioteca digital de mídias dos usuários de
um serviço de streaming, denominado, Toda Mídia em Todo Lugar ao
Mesmo Tempo, que disponibiliza músicas, filmes, séries, e demais mídias.


 ## Pré-requisito

-Criar as classes e objetos que representam as mídias do serviço de streaming, bem como as
bibliotecas dos usuários;


- O projeto deve ser desenvolvido na linguagem Java

- As seguintes classes devem ser implementadas:

  * Música - duração, artista, notas (1 a 5 estrelas), e seus
getters e setters;

  *  Filme - duração, Tipo (curta ou longa), elenco (vetor de
atores), diretor, produtor como atributos e seus getters e
setters;

- Artista - contendo, Nome, Data de Nascimento, Premiações e
Gênero (masc/fem/ind), e seus getters e setters.

  * Ator - formação (teatro, cinema, outros);
  * Músico - atuação (instrumento ou vocal);

-Biblioteca de Mídias - contendo as mídias, usuário, e playlists,
junto com seus getters e setters, e método, tocar playlist.

- Playlist - mídias, ordem de execução, mídia atual, com seus
getters e setters, e métodos para próxima mídia, mídia anterior,
misturar mídias 


### Um pouco sobre o que foi desenvolvido

### IDEA utilizada foi o Intellij

Neste trabalho o ponto de dificuldade foi a criação dos metos que eram pre requisitos e entender que a organização e planejamento dos atributos são fundamentais para evitar retrabalho.

### Metodo Tocar playlist
```java
 public void tocar_playlist_music(){


        System.out.println(midias);
        System.out.println(midias.size());

        System.out.println("\n  Minha playlist musica  \n");
//-------metodo inicia posição 0 e percorre os dados------//
        for (int i = 0; i < midias.size(); i++) {
            System.out.println("playlist: " + midias.get(i));

        }
        System.out.println("\nMusica tocando");
//---------------------Retorna posição atual--------------//
        System.out.println(this.playlist.getMidia_atual());

    }
```
### Metodo Tocar playlist

```java

// --------------Metodos Playlist---------------------------- //

    public Midia getMidia_atual() {
        return midia_atual;
    }

    public void setMidia_atual(Midia midia_atual) {
        if (null==midia_atual){
            return;
        }
        if(!midias.contains(midia_atual)){
            return ;}
        while (midia_atual.equals(this.midia_atual)){
            proxima_midia();
        }
    }

    public ListIterator<Midia> getIterator() {
        return iterator;
    }

    // -------------Metodo proxima midia-------------------- //


    public Midia proxima_midia(){
        if (iterator.hasNext()){
            midia_atual=iterator.next();
            return midia_atual;
        }
        else {
            while (iterator.hasPrevious() ){
                midia_atual =iterator.previous();
            }

            if (iterator.hasNext()){
                midia_atual=iterator.next();
                return midia_atual;

            }

        }
        return null;



    }


    // --------------Metodo anterior------------------------ //


    public Midia midia_anterior(){
        if (iterator.hasPrevious()){
            midia_atual=iterator.previous();
            return midia_atual;
        }
        else {
            while (iterator.hasNext() ){
                midia_atual =iterator.next();
            }

            if (iterator.hasPrevious()){
                midia_atual=iterator.previous();
                return midia_atual;

            }

        }
        return null;

    }
```

# Tecnologias utilizadas 

## JAVA

## Markdown
