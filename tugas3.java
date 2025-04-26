public class tugas3 {

    public static void main(String[] args) {
        
        int[] array1D = {12, 12, 1, 1, 5};

        System.out.println("Output 1D:");
        int nomor1D = 1;
        for (int i = 0; i < array1D.length; i++) {
            for (int j = i + 1; j < array1D.length; j++) {
                if (array1D[i] == array1D[j]) {
                    System.out.println("Elemen ganda " + nomor1D + ": " + array1D[i]);
                    System.out.println("Lokasi : [" + i + "] dan [" + j + "]");
                    nomor1D++;
                    break;
                }
            }
        }

        System.out.println();

        
        int[][] array2D = {
            {5, 6, 10, 12},
            {8, 10, 12, 7},
            {2, 4, 9, 3}
        };

        System.out.println("Output 2D:");
        int nomor2D = 1;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                for (int k = i; k < array2D.length; k++) {
                    int l = (k == i) ? j + 1 : 0;
                    for (; l < array2D[k].length; l++) {
                        if (array2D[i][j] == array2D[k][l]) {
                            System.out.println("Elemen ganda " + nomor2D + ": " + array2D[i][j]);
                            System.out.println("Lokasi : [" + i + "][" + j + "] dan [" + k + "][" + l + "]");
                            nomor2D++;
                            break;
                        }
                    }
                    if (nomor2D > 1 && k == array2D.length) {
                        break;
                    }
                }
            }
        }
    }
}