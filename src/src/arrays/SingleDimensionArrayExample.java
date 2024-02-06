package arrays;

public class SingleDimensionArrayExample {
    public static void main(String[] args){

        // Declaring an array
        // int[] marks;
        // marks = new int[5];
        // OR
        // int[] marks = new int[5];

        // Initializing an array:
        // int[] marks = new int[]{1,2,3,4,5};

        // Declare and assign
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 78;
        marks[3] = 80;
        marks[4] = 98;

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("****************************************");

        for(int value: marks){
            System.out.println(value);
        }
    }
}
