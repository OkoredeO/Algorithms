import java.util.Scanner;
public class CS211Lab3{
    public static void main(String args[]){   	
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String word = word1 + word2;
        char[] wordArray = new char[word.length()];
        for(int i =0;i<word.length();i++){
            wordArray[i] = word.charAt(i);
        }

        mergeSort(wordArray);
        for(int i = 0; i < wordArray.length; i++){
            System.out.print(wordArray[i]);
        }

    }

	public static void mergeSort(char[] array) {
		int length = array.length;
		if (length <= 1) return;
		int middle = length / 2;
		char[] leftArray = new char[middle];
		char[] rightArray = new char[length - middle];

		int i = 0; //left array
		int j = 0; //right array

		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}

			else {
				rightArray[j] = array[i];
				j++;
			}

		}

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);

	}
	
	public static void merge(char[] leftArray, char[] rightArray, char[] array) {
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0;

		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}

			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}

		}

		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}

		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}
}