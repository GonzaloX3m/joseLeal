
//package model;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.logging.Level;
//import java.util.logging.Logger;


//public class HiloVerificador {
//    private final InputStream hilo;
//
//    public HiloVerificador(InputStream hilo) {
//        this.hilo = hilo;
//    }
//    
    
//    public void run(){
//        
//        try {
//            byte[] recorrido = new byte[1000];
//            int leer = hilo.read(recorrido);
//            
//            while(leer > 0){
//                String opcion = new String(recorrido,0,leer);
//                    System.out.println(opcion);
//                    leer = hilo.read(recorrido);
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(HiloVerificador.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
//}
