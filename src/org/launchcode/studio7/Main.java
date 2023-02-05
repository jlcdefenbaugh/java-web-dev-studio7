package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.


        CD threeCheers = new CD("Three Cheers for Sweet Revenge", "My Chemical Romance", "CD", "punk", "ABC Co.");
        File helena = new File("Helena", 50, "audio");
        File cemeteryDrive = new File("Cemetery Drive", 60, "audio");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        threeCheers.spinDisc();
        threeCheers.readData();
        threeCheers.writeData(helena);
        threeCheers.writeData(cemeteryDrive);
        threeCheers.readData();


    }
}
