public class OrdenarMatrices {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Valores size de los arrays
        int m = nums1.length;
        int n = nums2.length;

        // Asegurarse de que m sea menor o igual que n
        if (m > n) {
            // Intercambiar nums1 y nums2 si la longitud de nums1 es mayor que la de nums2
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            // Intercambiar m y n también
            int tmp = m;
            m = n;
            n = tmp;
        }

        // Declarar variables para la busqueda de la mediana
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            // Promedio de la iteracion
            int i = (iMin + iMax) / 2;
            // Va restando el resultado size
            int j = halfLen - i;

            // Si promedio de iteracion es mayor al maximo del bucle
            // y el numero anterior
            if (i < iMax && nums2[j - 1] > nums1[i]) {
                // Incrementar iMin si el número en nums2 es mayor que el número en nums1
                iMin = i + 1;
            } else if (i > iMin && nums1[i - 1] > nums2[j]) {
                // Reducir iMax si el número en nums1 es mayor que el número en nums2
                iMax = i - 1;
            } else {
                // Calcular el valor máximo a la izquierda
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                // Si la suma de las longitudes de los dos arrays es impar, devolver maxLeft
                if((m + n) % 2 > 0) {
                    return maxLeft;
                 }
                // Calcular el valor mínimo a la derecha
                int minRight = 0;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums2[j], nums1[i]);
                }
                // Si la suma de las longitudes de los dos arrays es par, calcular y devolver la mediana
                return (maxLeft + minRight) / 2.000;
            }
        }
        // Si no se encuentra ninguna mediana, devolver 0.0
        return 0.0;
    }

    public static void main(String[] args) {
      
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        
        double value = findMedianSortedArrays(nums1, nums2);
        System.out.println(value);
    }
}
