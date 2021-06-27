public class ProgramBus {
    public static void main(String[] args) {

        Bus Bus1 = new Bus (1, "Partida", " Holambra ", 1 , 40 , 35);
        Bus Bus2 = new Bus (2, "Partida", " São Roque ", 2 , 35 , 30);
        Bus Bus3 = new Bus (3, "Partida", " Campos do Jordão ", 3 , 40 , 38);
        
        Bus1.liga();
        

        
        
        
    System.out.println("Vamos para" +   Bus1.returnTurismo() +   " parando " + Bus1.returnParadas() +   "com quantidade de pessoas" +  Bus1.returnCapacidade());
    System.out.println("Vamos para" +   Bus2.returnTurismo() +   " parando " + Bus2.returnParadas() +   "com quantidade de pessoas" +  Bus2.returnCapacidade());
    System.out.println("Vamos para" +   Bus3.returnTurismo() +   " parando " + Bus3.returnParadas() +   "com quantidade de pessoas" +  Bus3.returnCapacidade());
       




    }


}