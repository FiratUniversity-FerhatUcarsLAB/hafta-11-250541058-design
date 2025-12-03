/*AD SOYAD : BURÇİN AYYILDIZ 
NUMARA : 250541058
TARİH : 3.12.2025 */
public class Exercise4_6_Multadd {
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    
    public static double expSum(double x) {
       
        
        // e^(-x) ifadesini hesaplayalım
        double expMinusX = Math.exp(-x);
        
        // Toplama parçasını hesaplayalım: sqrt(1 - e^(-x))
        double sqrtPart = Math.sqrt(1.0 - expMinusX);
        
        // Formül: multadd(x, expMinusX, sqrtPart)
        return multadd(x, expMinusX, sqrtPart);
    }

    public static void main(String[] args) {
        
        // --- 1. Basit multadd Testi ---
        System.out.println("--- 1. Basit multadd Testi ---");
        // Beklenen: 1.0 * 2.0 + 3.0 = 5.0
        double testResult = multadd(1.0, 2.0, 3.0);
        System.out.printf("multadd(1.0, 2.0, 3.0) sonucu: %.4f\n", testResult);
        
        System.out.println("\n--- 2. Matematiksel İfadelerin multadd ile Hesaplanması ---");
        
        // A) sin(pi/4) + cos(pi/4) / 2
        // Formül: multadd(cos(pi/4), 0.5, sin(pi/4))
        double piOver4 = Math.PI / 4.0;
        double sinVal = Math.sin(piOver4);
        double cosVal = Math.cos(piOver4);
        
        double resultA = multadd(cosVal, 0.5, sinVal);
        System.out.printf("sin(pi/4) + cos(pi/4) / 2 sonucu: %.4f\n", resultA);
        
        // B) log(10) + log(20)
        // Not: Java'da Math.log() doğal logaritmadır (ln).
        // Bu ifadeyi multadd ile (log(10) * 1 + log(20)) şeklinde yazıyoruz.
        double log10Val = Math.log(10.0);
        double log20Val = Math.log(20.0);
        
        double resultB = multadd(log10Val, 1.0, log20Val);
        System.out.printf("ln(10) + ln(20) sonucu (multadd ile): %.4f\n", resultB);
        
        System.out.println("\n--- 3. expSum(x) Metot Testi ---");
        
        // C) expSum(x) Testi
        
        // x = 1.0 için test
        double x1 = 1.0;
        double resultC1 = expSum(x1);
        System.out.printf("expSum(%.1f) sonucu: %.4f\n", x1, resultC1); 
        
        // x = 0.0 için test
        double x2 = 0.0;
        double resultC2 = expSum(x2);
        // Kontrol: 0*e^0 + sqrt(1 - e^0) = 0 + sqrt(1 - 1) = 0
        System.out.printf("expSum(%.1f) sonucu: %.4f\n", x2, resultC2);
    }
}
