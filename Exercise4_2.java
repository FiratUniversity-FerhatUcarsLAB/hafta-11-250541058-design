public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { //1
        zippo("rattle", 13); //2
    }//17

    public static void baffle(String blimp) { //7
        System.out.println(blimp); //8
        zippo("ping", -5); //9
    }//15

    public static void zippo(String quince, int flag) { //3,10
        if (flag < 0) { //4,11
            System.out.println(quince + " zoop"); //12
        } else { //5
            System.out.println("ik"); //6
            baffle(quince); //7
            System.out.println("boo-wa-ha-ha");//16
        } //13,17
    } //14,18
}
