import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        List<String> meats = Arrays.asList("chicken", "steak", "carnidas", "chorizo", "veggies");
        List<String> rice = Arrays.asList("white", "brown", "no rice", "all");
        List<String> beans = Arrays.asList("pinto", "black", "no beans", "all");
        List<String> salsa = Arrays.asList("mild", "medium", "hot", "no salsa", "all");
        List<String> veggies = Arrays.asList("lettece", "fajitas", "no veggies", "all");
        double price = 3.00;
        /*String randomMeat = meats.get(rand.nextInt(meats.size()));
        String randomRice = rice.get(rand.nextInt(rice.size()));
        String randomBeans = beans.get(rand.nextInt(beans.size()));
        String randomSalsa = salsa.get(rand.nextInt(salsa.size()));
        String randomVeggies = veggies.get(rand.nextInt(veggies.size())); */

        for (int i = 1; i < 26; i++) {
            System.out.println("burrito " + i + ":" + getRandMeat() + "," + getRandRice() + "," + getRandBean() + "," + getRandSalsa() + "," + getRandVeggie() + " " + randomCheeseBoolean() + " " + randomQuesoBoolean() + " " + randomSourBoolean());
        }


    }


    private static String randomCheeseBoolean() {
        String cheese = "cheese";
        Random rand = new Random();
         boolean randomTrueFalse = rand.nextBoolean();
         if(randomTrueFalse == true) {
             return cheese;
         } else {
             return "";
         }

    }


    private static String randomQuesoBoolean() {
        String queso = "Queso";
        Random rand = new Random();
        boolean randomTrueFalse = rand.nextBoolean();
        if(randomTrueFalse == true) {
            return queso;
        } else {
            return "";
        }

    }

    private static String randomSourBoolean() {
        String sour = "Sour Cream";
        Random rand = new Random();
        boolean randomTrueFalse = rand.nextBoolean();
        if(randomTrueFalse == true) {
            return sour;
        } else {
            return "";
        }
    }




    private static String getRandMeat(){
        List<String> meats = Arrays.asList("chicken", "steak", "carnidas", "chorizo", "veggies","none","all");
        Random rand = new Random();
        String randMeat = meats.get(rand.nextInt(meats.size()));
            if(randMeat.contains("all")) {
                String allMeats = meats.get(0) + "," + meats.get(1) + "," + meats.get(2) + "," + meats.get(3) + "," + meats.get(4);
                return allMeats;
            } else {
                return randMeat;
            }
    }

    private static String getRandRice(){
        List<String> rice = Arrays.asList("white", "brown", "no rice", "all");
        Random rand = new Random();
        String randRice = rice.get(rand.nextInt(rice.size()));
        if(randRice.contains("all")) {
            String allRice = rice.get(0) + "," + rice.get(1);
            return allRice;
        } else {
            return randRice;
        }
    }
    private static String getRandBean(){
        List<String> beans = Arrays.asList("pinto", "black", "no beans", "all");
        Random rand = new Random();
        String randBean = beans.get(rand.nextInt(beans.size()));
        if(randBean.contains("all")) {
            String allBean = beans.get(0) + ", " + beans.get(1) + ",";
            return allBean;
        } else {
            return randBean;
        }
    }
    private static String getRandVeggie(){
        List<String> veggies = Arrays.asList("lettece", "fajitas", "no veggies", "all");
        Random rand = new Random();
        String randVeggies = veggies.get(rand.nextInt(veggies.size()));
        if(randVeggies.contains("all")) {
            String allVeggies = veggies.get(0) + ", " + veggies.get(1) + ",";
            return allVeggies;
        } else {
            return randVeggies;
        }
    }
    private static String getRandSalsa(){
        List<String> salsa = Arrays.asList("mild", "medium", "hot", "no salsa", "all");
        Random rand = new Random();
        String randSalsa = salsa.get(rand.nextInt(salsa.size()));
        if(randSalsa.contains("all")) {
            String allSalsa = salsa.get(0) + ", " + salsa.get(1) + ", " + salsa.get(2) + ",";
            return allSalsa;
        }
        return randSalsa;
    }



}
