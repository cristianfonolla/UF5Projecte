/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzprojecte;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author cristian
 */
public class ZZZProjecte {

    private static final String PATRO_MAIL = "\\b[\\w]+(\\.[\\w]+)*@" + "[\\w]+(\\.[A-Za-z0-9]+)*?(\\.[A-Za-z]{2,})";

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
//        String text = null;
//        String buscar;
//        char cBuscar;
//        String distingir;
//        char cDistingir;
//        int EsquerraDreta;
//        int index;
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
//                System.out.println("El caracter es troba a la posició: " + index);
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
//                System.out.println("El caracter es troba a la posició: " + index);
//
//                index = text.lastIndexOf(cBuscar, index - 1);
//
//            }
//        }
//
////        //Ex3
//        System.out.println("Introdueix un text per a comprovar si és palindrom: ");
//
//        String pPali = ent.nextLine();
//        StringBuilder palindrom = new StringBuilder(pPali);
//
//        if (pPali.compareTo(palindrom.reverse().toString()) == 0) {
//            System.out.println("Correcte! És un palindrom");
//
//        } else {
//            System.out.println("No és un palindrom");
//        }

//        //Ex3.BIS
//patro ha de reconeixe lo k volem eliminar se li pasa un text i se crida lo metode replace all de la calsse matcher
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
////      Ex3 bis 2
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
////        //Ex 4.
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
////          //Ex5.
//        String text1;
//
//        do {
//
////            System.out.println("Introdueix un text per a mostrar les primeres lletres de les paraules!");
////
////            text1 = ent.nextLine();
////
////        } while (text1.isEmpty());
////
////        StringBuilder resultat = new StringBuilder();
////
////        System.out.println(primeraLletra(text1, resultat));
//        //Ex5.bis
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
//////Comprovar expresiosn regulars!
//
//        while (true) {
//            System.out.println("Introduix una expressió regular (buida per acabar): ");
//            String regex = ent.nextLine();
//            if (regex.isEmpty()) {
//                break;
//            }
//
//            Pattern pattern = null;
//            try {
//                pattern = Pattern.compile(regex);
//            } catch (PatternSyntaxException e) {
//                System.out.println("Error a l'expressió regular: " + e.getDescription() + "\nTorna-ho a provar.");
//
//                continue;
//            }
//
//            while (true) {
//                System.out.println("Introduix el text on buscar (buit per canviar d'expressió regular): ");
//                String text = ent.nextLine();
//                if (text.isEmpty()) {
//                    break;
//                }
//                Matcher matcher
//                        = pattern.matcher(text);
//                boolean found = false;
//                while (matcher.find()) {
//                    System.out.format("He trobat el text"
//                            + " \"%s\" que comença a "
//                            + "l'índex %d i finalitza a l'índex %d.%n",
//                            matcher.group(),
//                            matcher.start(),
//                            matcher.end());
//                    found = true;
//                }
//                if (!found) {
//
//                    System.out.format("No s'han trobat coincidències.%n");
//                }
//            }
////
//        }
////////Ex7!!!
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
//////EX9!!!
//        String text;
//        do {
//            System.out.println("Introdueix un text que començe amb 3 paraules i acabe amb les mateixes pero al revés!: ");
//            text = ent.nextLine();
//
//        } while (text.isEmpty());
//
//        Pattern pattern = Pattern.compile("(\\w)(\\w)(\\w)");
//        Matcher matcher = pattern.matcher(text);
//
//        System.out.println(matcher.group(1));
//Ex 2 de MAPS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Integer dato = 0;
        String entrada;

        ArrayList<Integer> listaDatos = new ArrayList<Integer>();

        System.out.print("Introduzca los datos y cuando termine pulse enter. Primer dato: ");

        Scanner sc = new Scanner(System.in);
        entrada = sc.nextLine();
        dato = dato.valueOf(entrada);
        listaDatos.add((Integer) dato);

        while (entrada.equals("") == false) {
            System.out.print("Introduzca dato: ");
            entrada = sc.nextLine();
            if (entrada.equals("") == false) {
                dato = dato.valueOf(entrada);
                listaDatos.add((Integer) dato);
            }

        }
        System.out.println("¡TERMINADO! Los datos son:" + listaDatos);

    }

    public static String treuA(String strToStrip) {
        String strStripped = null;

        strToStrip = Normalizer.normalize(strToStrip, Normalizer.Form.NFD);

        strStripped = strToStrip.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        return strStripped;
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

    public static String foraPunts(String a, StringBuilder a1) {

        for (int i = 0; i < a.length(); i++) {

            if (Character.isLetter(a.charAt(i)) == true) {

                a1.append(a.charAt(i));

            }
        }
        a = a1.toString();
        return a.trim();
    }

}
