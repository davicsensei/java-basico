public class UsuarioFone {

    public static void main(String[] args) {
        
        Fone fone1 = new Fone();
        

        fone1.ligarFone();
        fone1.ligarMic();
        fone1.ligarGrave();
        fone1.mudarVolume(99);
        fone1.mudarVolumeMic(56);
        fone1.DesligarGrave();
        fone1.desligarMic();
        fone1.desligarFone();


        System.out.println(fone1.ligado);
        System.out.println(fone1.microfoneLigado);
        System.out.println(fone1.graveLigado);
        System.out.println(fone1.volumeAtual);
        System.out.println(fone1.volumeMicrofone);


        






    }
    
}
