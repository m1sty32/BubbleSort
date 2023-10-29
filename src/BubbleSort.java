public class BubbleSort {
    public BubbleSort() {
    }

    public static void bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; ++i) {
            for(int j = 0; j < nums.length - i - 1; ++j) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] randomList = new int[]{5, 6, 8, 10, 9, 3, 1, 2, 0, 4};
        bubbleSort(randomList);
        int[] var2 = randomList;
        int var3 = randomList.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            System.out.print("" + num + " ");
        }

    }
}