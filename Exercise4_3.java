/*AD SOYAD : BURÇİN AYYILDIZ
NUMARA : 250541058
TARİH : 3.12.2025
*/

public class Exercise4_3 {

    public static void zoop() { // 1. Adim: zoop() baslar
        baffle(); // 2. Adim: baffle() cagrılır
        System.out.print("You wugga ");
        baffle(); // 7. Adim: baffle() cagrılır (tekrar)
    }

    public static void main(String[] args) { // 1. Adim: main() baslar
        System.out.print("No, I "); // 2. Adim: "No, I " yazdırılır
        zoop(); // 3. Adim: zoop() cagrılır
        System.out.print("I "); // 11. Adim: "I " yazdırılır
        baffle(); // 12. Adim: baffle() cagrılır
    } // 15. Adim: main() biter

    public static void baffle() { // 4. Adim: baffle() baslar
        System.out.print("wug"); // 5. Adim: " wug" yazdırılır
        ping(); // 6. Adim: ping() cagrılır
    }// 14. Adim: baffle() biter

    public static void ping() { // 5. Adim: ping() baslar
        System.out.println("."); // 6. Adim: "." yazdırılır ve satir atlanır
    } // 13. Adim: ping() biter
}
