package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.*;
import com.codecool.geometry.utilities.FormulaProvider;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        ShapeCollection shapeCollection1 = new ShapeCollection();



        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Please choose between: \n (1) -> Add new shape \n (2) -> Show all shapes \n (3) -> Show shape with the largest perimeter \n (4) -> Show shape with the largest area \n (5) -> Show formulas \n (0) -> Exit");
            int option = scanner.nextInt();  // read the keyboard here

            switch (option) {
                case 1:
                    // Add new shape
                    System.out.println("Add a new shape: \n (1) -> circle \n (2) -> rectangle \n (3) -> square \n (4) -> triangle \n (5) -> equilateral triangle \n (6) -> Regular pentagon \n (0) -> Back to menu");
                    int userChoice = scanner.nextInt();
                    if (userChoice == 1) {
                        System.out.println("Please enter radius: ");
                        double radius = scanner.nextInt();
                        shapeCollection1.addShape(new Circle(radius));
                        break;
                    } else if (userChoice == 2) {
                        System.out.println("Please enter width: ");
                        double width = scanner.nextInt();
                        System.out.println("Please enter height: ");
                        double height = scanner.nextInt();
                        shapeCollection1.addShape(new Rectangle(width, height));
                        break;
                    } else if (userChoice == 3) {
                        System.out.println("Please enter side length: ");
                        double sideLength = scanner.nextInt();
                        shapeCollection1.addShape(new Square(sideLength));
                        break;
                    } else if (userChoice == 4) {
                        System.out.println("Please enter side 1 length: ");
                        double sideLength1 = scanner.nextInt();
                        System.out.println("Please enter side 2 length: ");
                        double sideLength2 = scanner.nextInt();
                        System.out.println("Please enter side 3 length: ");
                        double sideLength3 = scanner.nextInt();
                        shapeCollection1.addShape(new Triangle(sideLength1, sideLength2, sideLength3));
                        break;
                    } else if (userChoice == 5) {
                        System.out.println("Please enter side length: ");
                        double sideLength = scanner.nextInt();
                        shapeCollection1.addShape(new EquilateralTriangle(sideLength));
                        break;
                    } else if (userChoice == 6) {
                        System.out.println("Please enter side length: ");
                        double sideLength = scanner.nextInt();
                        shapeCollection1.addShape(new RegularPentagon(sideLength));
                        break;
                    } else if (userChoice == 0) {
                        break;
                    }
                    break;
                case 2:
                    // Show all shapes
                    shapeCollection1.getShapeTable();
                    break;
                case 3:
                    // Show shape with the largest perimeter
                    shapeCollection1.getLargestShapeByPerimeter();
                    break;
                case 4:
                    // Show shape with the largest area
                    shapeCollection1.getLargestShapeByArea();
                    break;
                case 5:
                    //  Show formulas
                    System.out.println("Choose a shape: \n (1) -> circle \n (2) -> rectangle \n (3) -> square \n (4) -> triangle \n (5) -> equilateral triangle \n (6) -> Regular pentagon \n (0) -> Back to menu");
                    int userChoiceForFormulas = scanner.nextInt();
                    if (userChoiceForFormulas == 1) {
                        System.out.println("Circle area formula: " + FormulaProvider.getAreaForShape("Circle") + ", Circle perimeter formula: " + FormulaProvider.getPerimeterForShape("Circle"));
                        break;
                    } else if (userChoiceForFormulas == 2) {
                        System.out.println("Rectangle area formula: " + FormulaProvider.getAreaForShape("Rectangle") + ", Rectangle perimeter formula: " + FormulaProvider.getPerimeterForShape("Rectangle"));
                        break;
                    } else if (userChoiceForFormulas == 3) {
                        System.out.println("Square area formula: " + FormulaProvider.getAreaForShape("Square") + ", Square perimeter formula: " + FormulaProvider.getPerimeterForShape("Square"));
                        break;
                    } else if (userChoiceForFormulas == 4) {
                        System.out.println("Triangle area formula: " + FormulaProvider.getAreaForShape("Triangle") + ", Triangle perimeter formula: " + FormulaProvider.getPerimeterForShape("Triangle"));
                        break;
                    } else if (userChoiceForFormulas == 5) {
                        System.out.println("Equilateral Triangle area formula: " + FormulaProvider.getAreaForShape("EquilateralTriangle") + ", Equilateral Triangle perimeter formula: " + FormulaProvider.getPerimeterForShape("EquilateralTriangle"));
                        break;
                    } else if (userChoiceForFormulas == 6) {
                        System.out.println("Regular Pentagon area formula: " + FormulaProvider.getAreaForShape("RegularPentagon") + ", Regular Pentagon perimeter formula: " + FormulaProvider.getPerimeterForShape("RegularPentagon"));
                        break;
                    } else if (userChoiceForFormulas == 0) {
                        break;
                    }
                    break;
                case 0:
                    // TODO Exit
                    System.out.println("Goodbye!");
                    isRunning = false;
            }
        }
    }
}

//    public static int getOptionMenu(){
//        System.out.println();
//        String option = "";
//        while (true){
//            try{
//
//
//                if(Integer.parseInt(option)>= 0 && Integer.parseInt(option) <= 5){
//                    return Integer.parseInt(option);
//                }
//                System.out.println(option + " is not a valid option");
//            }catch (Exception e){
//                System.out.println(option + " is not a valid option");
//            }
//
//        }
//    }
//
//    public static int getOptionShapes(){
//        System.out.println();
//        String option = "";
//        while (true){
//            try{
//
//
//                if(Integer.parseInt(userChoice)>= 0 && Integer.parseInt(userChoice) <= 5){
//                    return Integer.parseInt(option);
//                }
//                System.out.println(option + " is not a valid option");
//            }catch (Exception e){
//                System.out.println(option + " is not a valid option");
//            }
//
//        }
//    }
//
//}
