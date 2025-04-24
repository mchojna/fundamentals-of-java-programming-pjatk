public class zadanie_7_6 {
    public static void main(String[] args){
        // pp. 1
        int[] arr1 = new int[(int)(Math.random() * 10)];
        int[] arr2 = new int[(int)(Math.random() * 10)];

        System.out.print("arr1: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random() * 10);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("arr2: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = (int)(Math.random() * 10);
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int[] arr3 = new int[arr1.length + arr2.length];
        
        int i;

        for(i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            arr3[i] = arr2[j];
            i++;
        }

        System.out.print("arr3: ");
        for(int element: arr3){
            System.out.print(element + " ");
        }

        System.out.println();

        // pp. 2
        int[] indexTab = new int[arr3.length - 1];

        for(int j = 0; j < arr3.length; j++){
            for(int k = j + 1; k < arr3.length; k++){
                if(arr3[j] == arr3[k]){
                    int indexToDel = k;
  
                    for(int m = indexToDel; m < arr3.length - 1; m++){
                        arr3[m] = arr3[m + 1];
                    }

                    int[] tmpTab = new int[arr3.length - 1];

                    for(int n = 0; n < tmpTab.length; n++){
                        tmpTab[n] = arr3[n];
                    }

                    arr3 = tmpTab;

                    if(j - 1 >= 0){
                        j--;
                    };
                }
            }
        }

        System.out.print("arr3: ");
        for(int element: arr3){
            System.out.print(element + " ");
        }
        System.out.println();

        // pp. 3

        int minArr1 = 9;
        int maxArr1 = 0;
        int minArr2 = 9;
        int maxArr2 = 0;

        for(int j = 0; j < arr1.length; j++){
            int aktualnaWartosc = arr1[j];

            if(aktualnaWartosc > maxArr1){
                maxArr1 = aktualnaWartosc;
            }
            
            if(aktualnaWartosc < minArr1){
                minArr1 = aktualnaWartosc;
            }
        }

        System.out.println("arr1 max: " + minArr1 + " arr1 min: " + maxArr1);

        for(int j = 0; j < arr2.length; j++){
            int aktualnaWartosc = arr2[j];

            if(aktualnaWartosc > maxArr2){
                maxArr2 = aktualnaWartosc;
            }
            
            if(aktualnaWartosc < minArr2){
                minArr2 = aktualnaWartosc;
            }
        }

        System.out.println("arr2 max: " + minArr2 + " arr2 min: " + maxArr2);

        int min = (minArr1 > minArr2) ? minArr2 : minArr1; 
        int max = (maxArr1 > maxArr2) ? maxArr1 : maxArr2;

        System.out.println("max: " + max + " min: " + min);

        int[] arr4 = new int [min + max + 1];
        boolean duplikat = false;
        int startIndex = 0;

        for(int j = min; j <= max; j++){

            for(int k = 0; k < arr3.length; k++){
                if(j == arr3[k]){
                    duplikat = true;
                }
            }

            if(!duplikat){
                arr4[startIndex] = j;
                startIndex++;
            }   
            duplikat = false;
        } 
        // System.out.println(startIndex);
        int[] arr5 = new int[startIndex + 1];

        for(int j = 0; j < arr5.length; j++){
            arr5[j] = arr4[j];
            // System.out.print(j);
        }

        System.out.println();
        for(int element: arr5){
           System.out.print(element);
        }
    }
}
