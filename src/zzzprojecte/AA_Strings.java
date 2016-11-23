/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzprojecte;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author cristian
 */
public class AA_Strings {

    private static final String PATRO_MAIL = "\\b[\\w]+(\\.[\\w]+)*@" + "[\\w]+(\\.[A-Za-z0-9]+)*?(\\.[A-Za-z]{2,})";

    public static void main(String[] args) {
        String text = null;
        Scanner ent = new Scanner(System.in);
        String buscar;
        char cBuscar;
        String distingir;
        char cDistingir;
        int EsquerraDreta;
        int index;

        // Exercisi  1. Fes un programa que llisquigue
        // un número real com a paràmetre del programa i mostre quants decimals té.
        //TODO
        // Exercisi 2. Fes un programa que:
        //demane a l'usuari la introducció per teclat d'un text,
        //demane a l'usuari la introducció d'un caracter a buscar dins del text,
        //pregunte si vol distingir o no les majúscules/minúscules (Si/No),
        //pregunte si vol buscar de dreta a esquerra o d'esquerra a dreta,
        //mostre les posicions on es troba el caracter dins del text segons l'ordre de búsqueda sol·licitat (recorda que el primer caracter és el 0 i l'últim el length()-1).
        //
//        System.out.println("Introdueix un text acabat en INTRO");
//        text = ent.nextLine();
//        do {
//            System.out.println("Introdueix un caracter a buscar");
//            buscar = ent.nextLine();
//        } while (buscar.isEmpty());
//        cBuscar = buscar.charAt(0);
//        do {
//            System.out.println("Vols distingir majuscules/minuscules   S/N");
//            distingir = ent.nextLine();
//            if (!distingir.isEmpty()) {
//                if ("SN".indexOf(distingir.toUpperCase().charAt(0)) != -1) {
//                    cDistingir = distingir.toUpperCase().charAt(0);
//                    break;
//                }
//            }
//        } while (true);
//
//        if (cDistingir == 'N') {
//            text = text.toLowerCase();
//            cBuscar = Character.toLowerCase(cBuscar);
//
//        }
//
//        do {
//            System.out.println("En quin ordre busco: 1=Esquerra/Dreta    2=Dreta/Esquerra");
//            EsquerraDreta = ent.nextInt();
//            if (EsquerraDreta == 1 || EsquerraDreta == 2) {
//                break;
//            }
//        } while (true);
//
//        if (EsquerraDreta == 1) {
//            index = text.indexOf(cBuscar);
//
//            while (index != -1) {
//
//                System.out.println("El caracter es troba a la posició: " + (index - 1));
//
//                index = text.indexOf(cBuscar, index + 1);
//
//            }
//        } else {
//
//            index = text.lastIndexOf(cBuscar);
//
//            while (index != -1) {
//
//                System.out.println("El caracter es troba a la posició: " + (index - 1));
//
//                index = text.lastIndexOf(cBuscar, index - 1);
//
//            }
//        }
        //
        // Exercisi 3. Fes un programa que indique si un text sense accents, dièresis, ...,
        // introduït pel teclat és palíndrom (no es tenen en compte espais, signes de puntuació, majúscules/minúscules, etc...).
        // Pots estalviar bastant de codi alternant les classes String i StringBuilder.
        // Es tindrà en compte el número de línies de codi per posar la nota de la pràctica.
        // Llig l'exercici 6 per pistes sobre com llevar comes, punts, etc...
        //
//        System.out.println("Introdueix un text per a comprovar si és palindrom: ");
//
//        String pPali = ent.nextLine().toLowerCase().trim();
//
//        Pattern pattern = Pattern.compile("[\\p{Punct}\\s]");
//        Matcher matcher = pattern.matcher(pPali);
//
//        pPali = matcher.replaceAll("");
//
//        StringBuilder palindrom = new StringBuilder(pPali);
//
//        if (pPali.compareTo(palindrom.reverse().toString()) == 0) {
//            System.out.println("És palindrom");
//        } else {
//            System.out.println("No és palindrom");
//        }
        // EX 3.2  He creat un metode!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //
//        System.out.println("Introdueix un text per a comprovar si és palindrom: ");
//
//        String pPali = ent.nextLine().toLowerCase().trim();
//        pPali = treuA(pPali);
//
//        Pattern pattern = Pattern.compile("[\\p{Punct}\\s]");
//        Matcher matcher = pattern.matcher(pPali);
//
//        pPali = matcher.replaceAll("");
//        System.out.println(pPali);
//
//        StringBuilder palindrom = new StringBuilder(pPali);
//
//        if (pPali.compareTo(palindrom.reverse().toString()) == 0) {
//            System.out.println("És palindrom");
//        } else {
//            System.out.println("No és palindrom");
//        }
        //
        // Exercisi5. Escriu un programa que obtingue les inicials
        // de les paraules que componen un text i les mostre per pantalla.
        //
//        String text1;
//
//        do {
//
//            System.out.println("Introdueix un text per a mostrar les primeres lletres de les paraules!");
//
//            text1 = ent.nextLine();
//
//        } while (text1.isEmpty());
//
//        StringBuilder resultat = new StringBuilder();
//
//        System.out.println(primeraLletra(text1, resultat));
        //
        //Ex5.2
        //
//        String text1 = new String();
//
//        do {
//
//            System.out.println("Digues un text per mostrar les primeres lletres de cada paraula: ");
//            text1 = ent.nextLine().trim();
//
//        } while (text1.isEmpty());
//
//        Pattern pattern = Pattern.compile("\\b[\\p{Alnum}]");
//
//        Matcher matcher = pattern.matcher(text1);
//
//        while (matcher.find()) {
//
//            System.out.print(matcher.group());
//
//            boolean found = true;
//        }
        //
        // Exercisi 6. Un anagrama és una paraula o frase construïda 
        // transposant les lletres d'un altra paraula o frase; per exemple, "parliament" 
        // és un anagrama de "partial men," i "software" ho és de "swear oft". Escriu un 
        // programa que indique si un string és anagrama d'un altre. El programa 
        // hauria d'ignorar espais en blanc i signes de puntuació.
        // HE FET SERVI UN METODE!!!!!!!!!!!!!!!!!!!!!!1
        //
//        System.out.println("Introdueix dos Strings per comprovar que sòn anagrames·");
//        String a = ent.nextLine().toLowerCase().trim();
//        String b = ent.nextLine().toLowerCase().trim();
//
//        StringBuilder a1 = new StringBuilder();
//        StringBuilder b1 = new StringBuilder();
//
//        foraPunts(a, a1);
//        foraPunts(b, b1);
//
//        char[] aa = a.toCharArray();
//        char[] ab = b.toCharArray();
//
//        Arrays.sort(aa);
//        Arrays.sort(ab);
//
//        if (Arrays.equals(aa, ab) == true) {
//            System.out.println("És un anagrama!!");
//        } else {
//            System.out.println("No és un anagrama");
//        }
        //
        // Exercisi 7. Utilitza les classes de l'API de les expressions regulars per identificar adreces de correu electrònic dins un text
        //
//        String email = new String();
//        do {
//
//            System.out.println("Introdueix un text per a comprovar els e-mails!: ");
//            email = ent.nextLine();
//
//        } while (email.isEmpty());
//
//        Pattern pattern = Pattern.compile(PATRO_MAIL);
//
//        Matcher matcher = pattern.matcher(email);
//
//        while (matcher.find()) {
//
//            System.out.print(" " + matcher.group());
//
//            boolean found = true;
//        }
        //
        // Exercisi 9. Feu un programa que reconegue frases que comencen en 3 paraules qualsevol
        //
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Introduix un text. Acabat en INTRO:");
//        do {
//            text = entrada.nextLine().toLowerCase().trim();
//        } while (text.isEmpty());
//
//        text = Normalizer.normalize(text, Normalizer.Form.NFD);
//        text = text.replaceAll("\\p{M}", "");
//
//        Pattern pattern = null;
//        try {
//            pattern = Pattern.compile("(^\\w+)\\W+(\\w+)\\W+(\\w+).+\\3\\W+\\2\\W+(\\1)$");
//        } catch (PatternSyntaxException e) {
//            System.out.println("Error a l'expressió regular: " + e.getDescription() + "\nTorna-ho a provar.");
//        }
//        Matcher matcher = pattern.matcher(text);
//        if (matcher.find()) {
//            System.out.println("El text complix el patró!");
//        } else {
//            System.out.println("El text NO complix el patró!");
//        }

    }

    public static String treuA(String strToStrip) {
        String strStripped = null;

        strToStrip = Normalizer.normalize(strToStrip, Normalizer.Form.NFD);

        strStripped = strToStrip.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        return strStripped;
    }

    public static String foraPunts(String a, StringBuilder a1) {

        for (int i = 0; i < a.length(); i++) {

            if (Character.isLetter(a.charAt(i)) == true) {

                a1.append(a.charAt(i));

            }
        }
        a = a1.toString();
        return a.trim();
    }

    public static String primeraLletra(String text1, StringBuilder resultat) {

        resultat.append(text1.charAt(0));

        for (int i = 0; i < text1.length(); i++) {

            if (!Character.isLetter(text1.charAt(i)) && !Character.isDigit(text1.charAt(i))) {

                if (i + 1 < text1.length() && (Character.isLetter(text1.charAt(i + 1)) || Character.isDigit(text1.charAt(i + 1)))) {

                    resultat.append(text1.charAt(i + 1));

                }

            }

        }
        return resultat.toString();
    }

}
