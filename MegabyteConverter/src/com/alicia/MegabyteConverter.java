package com.alicia;

public class MegabyteConverter {

    private int KiloByte = 0;


    public MegabyteConverter(int KiloByte){

        this.KiloByte = KiloByte;
    }

    public int getKiloByte(){
        return KiloByte;
    }


    public void setKiloByte(int KiloByte) throws Exception {
        if (KiloByte>= 0) {
            this.KiloByte = KiloByte;
        }
        else {
            System.out.println(" Error, Kilobytes cannot be negative numbers");
        }


        public static void printMegaBytesAndKiloByte(int KiloByte){
            int kb = KiloByte / 1024;
            int kb2 = KiloByte % 1024;

            if (kb2 > 0 ){
                System.out.printf("%d KB = %d MB and %d KB ", KiloByte, kb, kb2);
            } else{
                System.out.printf("%d KB = %d MB",KiloByte,kb );
            }
        }

    }



}