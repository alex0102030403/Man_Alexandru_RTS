package Ex3;

public class main_ex3 {
	
		public static void main(String[] args) {
			    
                main_ex3 obj = new main_ex3();
                
                int[]array = new int[10];
                array = obj.generateRandomNumber();
                obj.printArray(array);
                obj.sortArray(array);
                obj.printArray(array);
                
            }

		private int[] generateRandomNumber() {
			
			int result[] = new int[10];
			
			for (int i = 0; i < 10; i++) {
				int random = (int) (Math.random() * 100);
				result[i] = random;
			}
			
			return result;
		}
		
		private void printArray(int[] array) {

			for (int i = 0; i < 10; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
		
		private void sortArray(int[] array) {

			for (int i = 0; i < 10; i++) {
				for (int j = i + 1; j < 10; j++) {
					if (array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		
	
}
