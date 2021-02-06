
public class Main {

    public static void main(String[] args) throws MyArraySizeException{
        String[][] myArray =
                {{"3", "4", "0", "5"}, {"3", "4", "6"}, {"3", "45", "5", "0"}, {"3", "43", "3", "0"}};
        arraySizeCheck(myArray);
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
