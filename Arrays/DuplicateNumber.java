public class DuplicateNumber {
    int[] arr;
    int maxsize;

    public DuplicateNumber(int maxsize, int[] arr) {
        this.maxsize = maxsize;
        this.arr = arr;
    }


    public void findduplicate(int data) {
        int count = 0;

        for (int i = 0; i < maxsize; i++) {
            if (arr[i] == data) {
                count++; 
            }
        }

        if (count > 1) {
            System.out.println("The number of duplicates for " + data + " is: " + (count - 1));
        } else if (count == 1) {
            System.out.println("The number " + data + " appears once, so there are no duplicates.");
        } else {
            System.out.println("The number " + data + " does not exist in the array.");
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int maxsize = arr.length;
        DuplicateNumber array = new DuplicateNumber(maxsize, arr);

        
        array.findduplicate(2); 
        array.findduplicate(8); 
        array.findduplicate(5); 
        array.findduplicate(1); 
    }
}



