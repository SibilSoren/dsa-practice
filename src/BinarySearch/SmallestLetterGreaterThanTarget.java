package BinarySearch;

public class SmallestLetterGreaterThanTarget {
    static void main() {
        char[] letters = {'c','f','j'};
        System.out.println(findNextSmaller(letters,'c'));
    }

    static char findNextSmaller(char[] letter,char target){
        int n = letter.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target < letter[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }
}
