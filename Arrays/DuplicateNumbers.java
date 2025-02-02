public class Arrays {
    int[] arr;
    int maxsize;

    public Arrays(int maxsize, int[] arr) {
        this.maxsize = maxsize;
        this.arr = arr;
    }


    public void findduplicate(int data) {
        int count = 0; // Counter for duplicates

        for (int i = 0; i < maxsize; i++) {
            if (arr[i] == data) {
                count++; // Increment count if data is found
            }
        }

        // Print the result after the loop completes
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
        Arrays arrayObj = new Arrays(maxsize, arr);

        // Test cases
        arrayObj.findduplicate(2); // Duplicates exist
        arrayObj.findduplicate(8); // Duplicates exist
        arrayObj.findduplicate(5); // No duplicates
        arrayObj.findduplicate(1); // No duplicates (appears once)
    }
}



