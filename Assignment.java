import java.util.Arrays;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Assignment obj = new Assignment();
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the number of strings: ");
        String ele;
        int str1_len = Integer.parseInt(reader.nextLine());
        String[] arr1_string = new String[str1_len];
        for (int i = 0; i < str1_len; i++) {
            ele = reader.nextLine();
            arr1_string[i] = ele;
        }

        obj.SortArray(arr1_string, str1_len);
        obj.SearchArray(arr1_string, str1_len);
        obj.SubtractStringArrays(arr1_string, str1_len);
        obj.ReverseNumArray();

        reader.close();
    }

    public void SortArray(String[] arr1_string, int str1_len) {
        Arrays.sort(arr1_string, 0, str1_len);
        System.out.println("The Sorted Array of Strings: \n");
        for (int i = 0; i < str1_len; i++) {
            System.out.println(arr1_string[i]);
        }
    }

    public void SearchArray(String[] arr1_string, int str1_len) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string to search: ");
        String ele = reader.nextLine();

        for (int i = 0; i < str1_len; i++) {
            if (arr1_string[i].equals(ele)) {
                System.out.println("Element is found at " + (i + 1));
                return;
            }


        }

    }

    public void SubtractStringArrays(String[] arr1_string, int str1_len) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter another array to subtract: ");
        System.out.println("Enter the number of elements in second array: ");
        int str2_len = Integer.parseInt(reader.nextLine());
        String[] arr2_string = new String[str2_len];
        for (int i = 0; i < str2_len; i++) {
            String ele = reader.nextLine();
            arr2_string[i] = ele;
        }

        if (str1_len != str2_len) {
            System.out.println("Number of strings in the arrays is not equal.");
        } else {
            for (int i = 0; i < str1_len; i++) {
                if (arr1_string[i].contains(arr2_string[i])) {
                    String temp = arr2_string[i];
                    arr1_string[i] = arr1_string[i].replaceAll(temp, "");

                    temp = arr2_string[i];
                    arr1_string[i] = arr1_string[i].replaceAll(temp, "");
                } else {
                    System.out.println(arr1_string[i] + " does not contain " + arr2_string[i]);
                }
            }
        }

        for (int i = 0; i < str1_len; i++) {
            System.out.println(arr1_string[i]);
        }
    }

    public void ReverseNumArray() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int array_len = Integer.parseInt(reader.nextLine());

        int[] arrNum = new int[array_len];

        for (int i = 0; i < array_len; i++) {
            arrNum[i] = Integer.parseInt(reader.nextLine());
        }
        reader.close();
        System.out.println("Original Array: ");
        for (int i = 0; i < array_len; i++) {
            System.out.println(arrNum[i]);
        }

        System.out.println("Reversed Array: ");
        for (int i = array_len - 1; i >= 0; i--) {
            System.out.println(arrNum[i]);
        }
    }

}