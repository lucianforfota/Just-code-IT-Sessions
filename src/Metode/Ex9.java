package Metode;

public class Ex9 {


    //9. Vrei sa construiesti un serviciu de tip RO-ALERT
    //Citeste de la tastatura previziunea pentru vreme si viteza vantului.
    // Previziunea pentru vreme poate fi “rainy” sau “snowing”.
    // Daca previziunea pentru vreme este “rainy” sau previziunea este “snowing” SI
    // viteaza vantului este mai mare decat 30, afiseaza in consola mesajul “Ramai in casa, este periculos afara”
    // Altfel, afiseaza mesajul: “S-ar putea sa fie frumos afara. ”
    //
    //De exemplu, pentru valorile initiale:
    //
    //String currentForecast = "rainy"
    //int currentWindSpeed = 40
    //se va afisa in consola mesajul "Ramai in casa, este periculos afara"

    public static void main(String[] args) {
        String forecast = "sunny";
        int windSpeed = 50;
        boolean message = getAlertMessage(forecast, windSpeed);
        if (message){
            System.out.println("ramai in casa");
        } else {
            System.out.println("s-ar putea sa fie frumos afara");
        }
    }

    public static boolean getAlertMessage (String forecast, int windSpeed){
        return (forecast.equals("rainy") || forecast.equals("snowy")) && windSpeed>30;
    }
}
