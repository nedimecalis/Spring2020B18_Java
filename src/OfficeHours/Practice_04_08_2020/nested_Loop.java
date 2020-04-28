package OfficeHours.Practice_04_08_2020;

public class nested_Loop {

    public static void main(String[] args) {


        int x = 5;
        while (x <= 10) {

            for (int i = 1; i <= 5; i++) {
            System.out.print(" " + i);
            }
            System.out.println();
            x++;
            }

        System.out.println("=========================================");

        for (int j=1; j<=5; j++) {

            for (int i = 1; i <= 5; i++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println("=========================================================");


        for(int l = 1; l<=6; l++) {

            for (int s = 1; s <= l; s++) { //triangle'in uzunlugunu genisligini burdaki > isareti belirliyo
                System.out.print(" *");
                //System.out.println(" *");//println yazsaydim alt alta sayilari azdan coga dogru * siralicakti
            }
            System.out.println();
        }

        System.out.println("=============================================================");


        for(int b = 5 ; b >=1; b--) {

            for (int a = 1; a <= b; a++) {
                System.out.print(" *");
            }
            System.out.println();
        }


        }


        }

