public class SmartTv {
    boolean onOff;
    int canal= 1;
    int volume= 25;
    int novoCanal;
    
    public void ligar(){
        onOff = true;
    }public void desligar(){
        onOff = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume => "+ volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume =>" + volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal => "+ canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal => "+ canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal => "+ canal);
    }
}