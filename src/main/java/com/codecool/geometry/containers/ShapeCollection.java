package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;
import com.codecool.geometry.utilities.FormulaProvider;

import java.util.*;

public class ShapeCollection {
    List<Shape> listOfShapes = new ArrayList<>();


    public void addShape(Shape ... shapes){
        listOfShapes.addAll(Arrays.asList(shapes));

    }



    public static String perimeterFormula(String name){
        return FormulaProvider.getPerimeterForShape(name);
    }

    public static String areaFormula(String name){
        return FormulaProvider.getAreaForShape(name);
    }

    public  String getLargestShapeByPerimeter(){
        HashMap<String, Double> shapesAndPerimeters = new HashMap<>();

        for(Shape shape: listOfShapes){
            shapesAndPerimeters.put(shape.getClass().getSimpleName(), shape.calculatePerimeter());
        }
        Double maxValue = (Collections.max(shapesAndPerimeters.values()));

        for(Map.Entry<String, Double> entry : shapesAndPerimeters.entrySet()){
            if(entry.getValue().equals(maxValue)){
                System.out.println("Shape with largest perimeter: " + entry.getKey());
                return entry.getKey();
            }
        }
        return "";
    }


    public  String getLargestShapeByArea(){
        HashMap<String, Double> shapesAndArea = new HashMap<>();

        for(Shape shape: listOfShapes){
            shapesAndArea.put(shape.getClass().getSimpleName(), shape.calculateArea());
        }
        Double maxValue = (Collections.max(shapesAndArea.values()));

        for(Map.Entry<String, Double> entry : shapesAndArea.entrySet()){
            if(entry.getValue().equals(maxValue)){
                System.out.println("Shape with largest area: " + entry.getKey());
                return entry.getKey();
            }
        }
        return "";
    }




    public void getShapeTable(){
        String format1 = "|%3.3s|%21.21s|%40.40s|%11.11s|%10.10s|%11.11s|%30.30s|";
        int rowNumber = 0;
        int numberOfHeaders = 7;
        String lineBreak = "|---|---------------------|----------------------------------------|-----------|----------|-----------|------------------------------|\n";
        System.out.println("/------------------------------------------------------------------------------------------------------------------------------------\\");
        System.out.printf(format1, "ID", "Class", "toString", "Perimeter", "Formula", "Area", "Formula");
        System.out.println();
        for(int i = 0; i < listOfShapes.size(); i++){
            System.out.print(lineBreak);
            for (int j = 0; j < numberOfHeaders; j++){
                if(j == 0){
                    System.out.print("|  " + rowNumber++ + "|");
                }else if(j == 1){
                    System.out.printf("%21.21s|", listOfShapes.get(i).getClass().getSimpleName());

                }else if (j == 2){
                    System.out.printf("%40.40s|", listOfShapes.get(i).toString());

                }else if(j == 3){
                    System.out.printf("%11.11s|", listOfShapes.get(i).calculatePerimeter());

                }else if(j == 4){
                    System.out.printf("%10.10s|", perimeterFormula(listOfShapes.get(i).getClass().getSimpleName()));
                }else if(j == 5){
                    System.out.printf("%11.11s|", listOfShapes.get(i).calculateArea());
                }else{
                    System.out.printf("%30.30s|", areaFormula(listOfShapes.get(i).getClass().getSimpleName()));

                }

            }
            System.out.println();
        }
        System.out.println("\\------------------------------------------------------------------------------------------------------------------------------------/");

    }


}

