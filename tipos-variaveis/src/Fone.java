public class Fone {
    int volumeAtual = 25;
    int volumeMicrofone = 25;
    boolean ligado = false;
    boolean microfoneLigado = false;
    boolean graveLigado = false;

    public void ligarFone(){
        ligado = true;   
    }

    boolean desligarFone(){
        ligado = false;
        return ligado;
    }

    boolean ligarMic(){
        microfoneLigado = true;
        return microfoneLigado;
    }

    boolean desligarMic(){
        microfoneLigado = false;
        return microfoneLigado;
    }

    boolean ligarGrave(){
        graveLigado = true;
        return graveLigado;
    }

    boolean DesligarGrave(){
        graveLigado = false;
        return graveLigado;
    }

    public void mudarVolume(int volume){
        volumeAtual = volume;
        
    }

    int mudarVolumeMic(int volume){
        volumeMicrofone = volume;
        return volumeMicrofone;

    }   
}
