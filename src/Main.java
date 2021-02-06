
public class Main {

    public static void main(String[] args){
        String[][] myArray =
                {{"3", "4", "0", "5"}, {"3", "4", "6", "15"}, {"3", "45", "5", "0"}, {"3", "43", "3", "0"}};
        System.out.println("Sum = " + sumArray(myArray));
    }

    private static int sumArray (String[]... myArray){
        try {
            arraySizeCheck(myArray);
        } catch (MyArraySizeException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        int sum = 0;
        for (int i=0; i< myArray.length; i++){
            for (int j=0; j< myArray[i].length; j++){
                try {
                    sum += dataTransformation(myArray[i][j]);
                } catch (MyArrayDataException ex){
                    System.out.print(String.format("Incorrect data on the address [%d][%d]%n", i, j));
                    ex.printStackTrace();
                }
            }
        }
        return sum;
    }

    private static int dataTransformation(String data) throws MyArrayDataException {
        try {
            return Integer.parseInt(data);
        } catch (NumberFormatException ex){
            throw new MyArrayDataException("Incorrect data", ex);
        }

    }

    private static void arraySizeCheck (String[]... myArray) throws MyArraySizeException{
        if (myArray.length!=4){
            throw new MyArraySizeException(
                    String.format("Incorrect array size, [%d][%d]", myArray.length, myArray[0].length));
        }
        for (int i=0; i<myArray.length;i++){
            if (myArray[i].length!=4) {
                throw new MyArraySizeException(
                        String.format("Incorrect array size, [%d][%d]", myArray.length, myArray[i].length));
            }
        }
    }
}
