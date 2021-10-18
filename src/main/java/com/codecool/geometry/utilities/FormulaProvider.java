package com.codecool.geometry.utilities;


import java.util.HashMap;

public class FormulaProvider {



    private static final String[] POSSIBLE_SHAPES = {
            "Circle",
            "Rectangle",
            "Triangle",
            "Square",
            "EquilateralTriangle",
            "RegularPentagon"
    };

    /**
     * Returns the area formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return area formula
     */
    public static String getAreaForShape(String shape) {
        if(shape.equals(POSSIBLE_SHAPES[0])){
            return "π×r×r";
        }else if(shape.equals(POSSIBLE_SHAPES[1])){
            return "a×b";
        }else if(shape.equals(POSSIBLE_SHAPES[2])){
            return "sqrt(s×(s-a)×(s-b)×(s-c))";
        }else if(shape.equals(POSSIBLE_SHAPES[3])){
            return "a×a";
        }else if(shape.equals(POSSIBLE_SHAPES[4])){
            return "a×a×sqrt(3)/4";
        }else if(shape.equals(POSSIBLE_SHAPES[5]))
            return "a×a×sqrt(5×(5+2×sqrt(5))/4";
        return "";
    }


    /**
     * Returns the perimeter formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return perimeter formula
     */
    public static String getPerimeterForShape(String shape) {
        if(shape.equals(POSSIBLE_SHAPES[0])){
            return "2×π×r";
        }else if(shape.equals(POSSIBLE_SHAPES[1])){
            return "2×a+2×b";
        }else if(shape.equals(POSSIBLE_SHAPES[2])){
            return "a+b+c";
        }else if(shape.equals(POSSIBLE_SHAPES[3])){
            return "4×a";
        }else if(shape.equals(POSSIBLE_SHAPES[4])){
            return "3×a";
        }else if(shape.equals(POSSIBLE_SHAPES[5]))
            return "5×a";
        return "";
    }

}
