/*AD SOYAD : BURÇİN AYYILDIZ
NUMARA : 250541058
TARİH : 3.12.2025
*/

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("Amerikan Formatinda Tarih:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }


    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("Avrupa Formatinda Tarih:");
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Tarih Bilgilerini Girin:");

        System.out.print("Gunun adini girin (Ornek: Pazartesi): ");
        String day = scanner.nextLine();
    
        System.out.print("Ayin adini girin (Ornek: Temmuz): ");
        String month = scanner.nextLine();

        System.out.print("Tarihi girin (1-31 arasi bir sayi, Ornek: 22): ");
        int date = scanner.nextInt();

        System.out.print("Yili girin (Ornek: 2019): ");
        int year = scanner.nextInt();

        scanner.close();

        System.out.println("\n--- Cikti Sonucu ---");
        
        printAmerican(day, date, month, year);

        System.out.println("--------------------");

        printEuropean(day, date, month, year);
        
        System.out.println("--------------------");

        System.out.println("\n--- Ornek Verilerle Cikti Sonucu (Monday, July 22, 2019) ---");
        printAmerican("Monday", 22, "July", 2019);
        printEuropean("Monday", 22, "July", 2019);
    }
}
