package com.company.ex2;

public class DragonLogic {

    public static final int EyesInOneHead = 2;
    public static final int FIRST_PERIOD = 200;
    public static final int SECOND_PERIOD = 100;
    public static final int THIRD_PERIOD = 300;
    public static final int BORNING_COUNT = 3;
    public static final int BEFORE_200 = 3;
    public static final int BEFORE_300 = 2;
    public static final int After_300 = 1;

    public static int countHeads(int age) throws Exception{
        int count = 0;

        if (age > THIRD_PERIOD){

            count = (age - THIRD_PERIOD) * After_300 + SECOND_PERIOD * BEFORE_300
                    + FIRST_PERIOD * BEFORE_200 + BORNING_COUNT;

        }else if (age > FIRST_PERIOD){

            count = (age - FIRST_PERIOD) * BEFORE_300 + FIRST_PERIOD * BEFORE_200 + BORNING_COUNT;

        }else if (age > 0) {

            count = age * BEFORE_200 + BORNING_COUNT;

        } else {
            throw new Exception("WrongCountHeadsException");
        }
        return count;
    }

    public static int countEyes(int heads){
        return heads * EyesInOneHead;
    }



}
