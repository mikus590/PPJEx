public class PPJ_4 {
    //Zad 1
        /*double x = 2.0;
        double y = 2.0;
        double zmienna = pow(Math.sqrt(x),y) - 2;
        System.out.println(zmienna);
*/
    //Zad2
       /* double sqTwo = Math.sqrt(2);
        double wynik = pow(sqTwo,2) - 2;
        System.out.println(wynik);*/
    //Zad3
        /*int color = 1651300;
        int maska = 255;
        int red = color & maska; // czesc wspolna bitowo
        int green = (color >> 8) & maska; //przesuniecie bitowe
        int blue = (color >> 16) & maska;
        System.out.println(red + "." + green + "." + blue);*/
    //Zad 4
       /* String wynik = "";
        int x = (int) (Math.random() * 27) - 16;
        System.out.println(x);
        if( (x > -15 && x < -10) || (x > -5 && x < 0) || (x > 10 && 10 < x))
            wynik+= ("A");
        if (x < - 13 || (x > -8 && x < -3))
            wynik+= "B";
        if ( x > -4) {
            wynik += ("C");
        }
        System.out.println(wynik);*/
    //Zad 5
    //Powyzej
    //Zad 6\
        /*int sloik = (int) (Math.random() * 4);
        System.out.println(sloik);
        switch(sloik){
            case 1: {
                System.out.println("Dzem jest truskawkowy");
                break;
            }
            case 2: {
                System.out.println("Dzem jest malinowy");
                break;
            }
            case 3: {
                System.out.println("Dzem jest brzoskwiniowy");
                break;
            }
            case 4: {
                System.out.println("Dzem jest agrestowy");
                break;
            }
            default: {
                System.out.println("Dżem nie ma smaku");
            }
        }*/
    //Zad 7
        /*byte a = 40, b = 50;
        byte suma = (byte) (a + b);
        System.out.println(suma);*/
    //Zad 8
        /*int x = 4;
        long y = x * 4 - x++;

        if (y<10) System.out.println("za mało");
        else System.out.println("w sam raz");*/
    //Zad 9
       /* boolean x = true;
        boolean z = true;
        int y = 20;
        x = (y!=10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);*/ //Zaskoczylo

}
