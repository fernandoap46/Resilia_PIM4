package Model;

import java.util.*;
// -----------------------------------Atributo Classe Playlist-------------------------------- //
public class Playlist {
    private LinkedList<Midia> midias;
    private boolean ordem_de_execucao;
    private Midia midia_atual;

    private ListIterator <Midia> iterator;
    // -----------------------------------Cnstrutor--------------------------------------- //
    public Playlist(Collection<Midia> midias, boolean ordem_de_execucao) {
        this.midias = new LinkedList<>(midias);
        this.ordem_de_execucao = ordem_de_execucao;
        this.iterator= this.midias.listIterator();
        proxima_midia();
    }

    public LinkedList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(LinkedList<Midia> midias) {
        this.midias = midias;
    }

    public boolean isOrdem_de_execucao() {
        return ordem_de_execucao;
    }

    public void setOrdem_de_execucao(boolean ordem_de_execucao) {
        this.ordem_de_execucao = ordem_de_execucao;
    }

    // -----------------------------------Metodo atual-------------------------------- //

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
    // -----------------------------------Metodo proxima midia-------------------------------- //
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

    // -----------------------------------Metodo anterior-------------------------------- //
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




}

