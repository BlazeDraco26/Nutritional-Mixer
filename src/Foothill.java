
import java.util.Scanner;

public class Foothill
{
   // food #1 constants
   static final String FOOD_1_NAME = "watermelon";
   static final int FOOD_1_CALORIES_P100G = 30;  // in calories
   static final double FOOD_1_CARBS_P100G = 7.5;  // in grams
   static final double FOOD_1_SOL_FIBER_P100G = 0.4;  // in grams
   static final double FOOD_1_VITAMINC_P100G = 8.1;  // in milligrams
   static final double FOOD_1_IRON_P100G = 0.2;  // in milligrams
   
   // food #2 constants
   static final String FOOD_2_NAME = "heavy whipping cream";
   static final int FOOD_2_CALORIES_P100G = 345;  // in calories
   static final double FOOD_2_CARBS_P100G = 2.8;  // in grams
   static final double FOOD_2_SOL_FIBER_P100G = 0.0;  // in grams
   static final double FOOD_2_VITAMINC_P100G = 0.6; // in milligrams
   static final double FOOD_2_IRON_P100G = 0.0;  // in milligrams
   
   // food #3 constants
   static final String FOOD_3_NAME = "wheat bread";
   static final int FOOD_3_CALORIES_P100G = 232;  // in calories
   static final double FOOD_3_CARBS_P100G = 41.4;  // in grams
   static final double FOOD_3_SOL_FIBER_P100G = 4.0;   // in grams
   static final double FOOD_3_VITAMINC_P100G = 0.0; //in milligrams
   static final double FOOD_3_IRON_P100G = 3.6;  // in milligrams
   
   // food #4 constants
   static final String FOOD_4_NAME = "cheddar cheese";
   static final int FOOD_4_CALORIES_P100G = 357;  // in calories
   static final double FOOD_4_CARBS_P100G = 0.0;  // in grams
   static final double FOOD_4_SOL_FIBER_P100G = 0.0;   // in grams
   static final double FOOD_4_VITAMINC_P100G = 0.0; //in milligrams
   static final double FOOD_4_IRON_P100G = 0.0;  // in milligrams
   
   // food #5 constants
   static final String FOOD_5_NAME = "peanut butter";
   static final int FOOD_5_CALORIES_P100G = 588;  // in calories
   static final double FOOD_5_CARBS_P100G = 20.0;  // in grams
   static final double FOOD_5_SOL_FIBER_P100G = 6.0;   // in grams
   static final double FOOD_5_VITAMINC_P100G = 0.0; //in milligrams
   static final double FOOD_5_IRON_P100G = 1.9;  // in milligrams
   
   // define serving and recipe limits
   static final int QUANTITY_MIN = 0;
   static final int QUANTITY_MAX = 1500;
   static final int SERVING_MIN = 1;
   static final int SERVING_MAX = 15;
   
   static final String INDENT = "   ";
   static final String SEPARATOR = "\n";
   
   public static void main(String[] args)
   {
      String recipeName, userInputStr;
      int userInputInt, numServings;
      double totalSolFiber, totalCals, totalCarbs, totalVitC, totalIron;
      Scanner inputStream = new Scanner(System.in);
      
      // initialize accumulator variables
      totalSolFiber  = 0.;
      totalCals =  0;
      totalCarbs  = 0;
      totalVitC  = 0;
      totalIron  = 0;
      
      // print menu
      System.out.println("---------- List of Possible Ingredients ---------");
      System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
      System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
      System.out.println(INDENT + "Food #2: " + FOOD_3_NAME);
      System.out.println(INDENT + "Food #2: " + FOOD_4_NAME);
      System.out.println(INDENT + "Food #3: " + FOOD_5_NAME + SEPARATOR);
 
      // name of recipe
      System.out.print("What are you calling this recipe ? ");
      recipeName  = inputStream.nextLine();
      
      // number of servings
      System.out.print("How many portions does this recipe serve ? ");
      userInputStr = inputStream.nextLine();
      numServings  = Integer.parseInt(userInputStr);
      
      // end program if user inputs an invalid number of servings
      if ((numServings < SERVING_MIN) || (numServings > SERVING_MAX)) {
         System.out.println("ERROR: Invalid number of servings.");
         System.exit(1);
      }
      
      // food #1 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_1_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      
      // end program if user inputs an invalid amount of food
      if ((userInputInt < QUANTITY_MIN) || (userInputInt > QUANTITY_MAX)) {
         System.out.println("ERROR: Invalid amount of " + FOOD_1_NAME);
         System.exit(1);
      }
      
      // update accumulators
      totalCals += userInputInt * (FOOD_1_CALORIES_P100G / 100.);
      totalCarbs += userInputInt * (FOOD_1_CARBS_P100G / 100.);
      totalSolFiber  += userInputInt * (FOOD_1_SOL_FIBER_P100G / 100.);
      totalVitC += userInputInt * (FOOD_1_VITAMINC_P100G / 100.);
      totalIron += userInputInt * (FOOD_1_IRON_P100G / 100.);

      // food #2 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_2_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      
      // end program if user inputs an invalid amount of food
      if ((userInputInt < QUANTITY_MIN) || (userInputInt > QUANTITY_MAX)) {
         System.out.println("ERROR: Invalid amount of " + FOOD_2_NAME);
         System.exit(1);
      }
      
      // update accumulators
      totalCals += userInputInt * (FOOD_2_CALORIES_P100G / 100.);
      totalCarbs += userInputInt * (FOOD_2_CARBS_P100G / 100.);
      totalSolFiber  += userInputInt * (FOOD_2_SOL_FIBER_P100G / 100.);
      totalVitC += userInputInt * (FOOD_2_VITAMINC_P100G / 100.);
      totalIron += userInputInt * (FOOD_2_IRON_P100G / 100.);

      // food #3 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_3_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      
      // end program if user inputs an invalid amount of food
      if ((userInputInt < QUANTITY_MIN) || (userInputInt > QUANTITY_MAX)) {
         System.out.println("ERROR: Invalid amount of " + FOOD_3_NAME);
         System.exit(1);
      }
      
      // update accumulators
      totalCals += userInputInt * (FOOD_3_CALORIES_P100G / 100.);
      totalCarbs += userInputInt * (FOOD_3_CARBS_P100G / 100.);
      totalSolFiber  += userInputInt * (FOOD_3_SOL_FIBER_P100G / 100.);
      totalVitC += userInputInt * (FOOD_3_VITAMINC_P100G / 100.);
      totalIron += userInputInt * (FOOD_3_IRON_P100G / 100.);
      
      // food #4 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_4_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      
      // end program if user inputs an invalid amount of food
      if ((userInputInt < QUANTITY_MIN) || (userInputInt > QUANTITY_MAX)) {
         System.out.println("ERROR: Invalid amount of " + FOOD_4_NAME);
         System.exit(1);
      }
      
      // update accumulators
      totalCals += userInputInt * (FOOD_4_CALORIES_P100G / 100.);
      totalCarbs += userInputInt * (FOOD_4_CARBS_P100G / 100.);
      totalSolFiber  += userInputInt * (FOOD_4_SOL_FIBER_P100G / 100.);
      totalVitC += userInputInt * (FOOD_4_VITAMINC_P100G / 100.);
      totalIron += userInputInt * (FOOD_4_IRON_P100G / 100.);  
     
      // food #5 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_5_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      
      // end program if user inputs an invalid amount of food
      if ((userInputInt < QUANTITY_MIN) || (userInputInt > QUANTITY_MAX)) {
         System.out.println("ERROR: Invalid amount of " + FOOD_5_NAME);
         System.exit(1);
      }
      
      // update accumulators
      totalCals += userInputInt * (FOOD_5_CALORIES_P100G / 100.);
      totalCarbs += userInputInt * (FOOD_5_CARBS_P100G / 100.);
      totalSolFiber  += userInputInt * (FOOD_5_SOL_FIBER_P100G / 100.);
      totalVitC += userInputInt * (FOOD_5_VITAMINC_P100G / 100.);
      totalIron += userInputInt * (FOOD_5_IRON_P100G / 100.);    
      inputStream.close();
      
      // report results --------------------------------------------------
      System.out.println("\nThe nutritional value per serving of " + 
         recipeName + " " + "is:"); 
      System.out.println(INDENT + "Calories: " + totalCals / numServings);
      System.out.println(INDENT + "Carbohydrates: " + 
         totalCarbs / numServings + "grams");
      System.out.println(INDENT + "Soluble Fiber: " + 
         totalSolFiber / numServings + " grams");
      System.out.println(INDENT + "Vitamin C: " + 
         totalVitC / numServings + "milligrams");
      System.out.println(INDENT + "Iron: " + 
         totalIron / numServings + "milligrams");
   }
}

/* -------------------------- runs --------------------------------------

---------- List of Possible Ingredients ---------
Food #1: watermelon
Food #2: heavy whipping cream
Food #2: wheat bread
Food #2: cheddar cheese
Food #3: peanut butter

What are you calling this recipe ? Grilled Cheese
How many portions does this recipe serve ? 3
How many grams of watermelon? 0
How many grams of heavy whipping cream? 0
How many grams of wheat bread? 400
How many grams of cheddar cheese? 150
How many grams of peanut butter? 0

The nutritional value per serving of Grilled Cheese is:
Calories: 487.8333333333333
Carbohydrates: 55.199999999999996grams
Soluble Fiber: 5.333333333333333 grams
Vitamin C: 0.0milligrams
Iron: 4.800000000000001milligrams


---------- List of Possible Ingredients ---------
   Food #1: watermelon
   Food #2: heavy whipping cream
   Food #2: wheat bread
   Food #2: cheddar cheese
   Food #3: peanut butter

What are you calling this recipe ? Smoothie
How many portions does this recipe serve ? 8
How many grams of watermelon? 350
How many grams of heavy whipping cream? 78
How many grams of wheat bread? 0
How many grams of cheddar cheese? 0
How many grams of peanut butter? 124

The nutritional value per serving of Smoothie is:
   Calories: 137.9025
   Carbohydrates: 6.65425grams
   Soluble Fiber: 1.105 grams
   Vitamin C: 3.60225milligrams
   Iron: 0.382milligrams
   

---------- List of Possible Ingredients ---------
   Food #1: watermelon
   Food #2: heavy whipping cream
   Food #2: wheat bread
   Food #2: cheddar cheese
   Food #3: peanut butter

What are you calling this recipe ? Cream Cheese
How many portions does this recipe serve ? 10
How many grams of watermelon? 0
How many grams of heavy whipping cream? 200
How many grams of wheat bread? 0
How many grams of cheddar cheese? 250
How many grams of peanut butter? 50

The nutritional value per serving of Cream Cheese is:
   Calories: 187.65
   Carbohydrates: 1.56grams
   Soluble Fiber: 0.3 grams
   Vitamin C: 0.12milligrams
   Iron: 0.095milligrams
   

---------- List of Possible Ingredients ---------
   Food #1: watermelon
   Food #2: heavy whipping cream
   Food #2: wheat bread
   Food #2: cheddar cheese
   Food #3: peanut butter

What are you calling this recipe ? Sweet Bun
How many portions does this recipe serve ? 3
How many grams of watermelon? 80
How many grams of heavy whipping cream? 35
How many grams of wheat bread? 120
How many grams of cheddar cheese? 0
How many grams of peanut butter? 57

The nutritional value per serving of Sweet Bun is:
   Calories: 252.76999999999998
   Carbohydrates: 22.686666666666667grams
   Soluble Fiber: 2.8466666666666662 grams
   Vitamin C: 2.23milligrams
   Iron: 1.8543333333333336milligrams

---------- List of Possible Ingredients ---------
   Food #1: watermelon
   Food #2: heavy whipping cream
   Food #2: wheat bread
   Food #2: cheddar cheese
   Food #3: peanut butter

What are you calling this recipe ? Dubious Food
How many portions does this recipe serve ? 20
ERROR: Invalid number of servings.


---------- List of Possible Ingredients ---------
   Food #1: watermelon
   Food #2: heavy whipping cream
   Food #2: wheat bread
   Food #2: cheddar cheese
   Food #3: peanut butter

What are you calling this recipe ? Witch's Brew
How many portions does this recipe serve ? 1
How many grams of watermelon? 99
How many grams of heavy whipping cream? 800
How many grams of wheat bread? 40000
ERROR: Invalid amount of wheat bread

------------------------------------------------------------------------- */