public class Fone {
    int volumeAtual = 25;
    int volumeMicrofone = 25;
    boolean ligado = false;
    boolean microfoneLigado = false;
    boolean graveLigado = false;

    public void ligarFone(){
        ligado = true;   
    }

    public void desligarFone(){
        ligado = false;
    }

    public void ligarMic(){
        microfoneLigado = true;
    }

    public void desligarMic(){
        microfoneLigado = false;
    }

    public void ligarGrave(){
        graveLigado = true;
    }

    public void DesligarGrave(){
        graveLigado = false;
    }

    public void mudarVolume(int volume){
        volumeAtual = volume;    
    }

    public void mudarVolumeMic(int volume){
        volumeMicrofone = volume;
    }   
}
