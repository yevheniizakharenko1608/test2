public class Main {
    public static void displayArray(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int frame_width = 10, frame_height = 8, pic_y = 3, pic_x = 2, pic_width = 6, pic_height = 4;

        int[][] arr = new int[frame_height][frame_width];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;
            }
        }
        displayArray(arr);
        int pic_maxCountX = pic_x, pic_maxCountY = pic_y;
        int forNewArrayX = 0, forNewArrayY = 0;
        while (pic_maxCountY != pic_y + pic_height) {
            while (pic_maxCountX != pic_x + pic_width) {
                arr[forNewArrayY][forNewArrayX] = arr[pic_maxCountY][pic_maxCountX];
                ++pic_maxCountX;
                ++forNewArrayX;
            }
            forNewArrayX = 0;
            ++forNewArrayY;
            ++pic_maxCountY;
            pic_maxCountX = pic_x;
        }

        System.out.println();
        displayArray(arr);
    }

}