package it.DevelHope.ExerciseJava26;

public class Start {
    public static void main(String[] args) {

        int x = 3;
        int y = 2;

        boolean A = !(!(!(false ^ false) || (true && true)));  /* Since the value of the first condition is 'false' and the value of the second condition is 'true',
                                                                  due to the 3 operators NOT (!) the value of the condition become 'true' for the first and 'false' for the second, the final result will be 'true'.*/


        boolean B = !((x * y) <= 6) && (x - y != 1);           /* Since the value of the first condition is 'true' and the value of the second condition is 'false',
                                                                  the final result will be 'false' even if the NOT operator swap the 2 values of the conditions*/

        System.out.println(" The result of A is: " + A);
        System.out.println(" The result of B is: " + B);
    }
}
