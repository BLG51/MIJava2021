package List;

public class MyArray {
    int[] array;
    int size;

    public MyArray() {
        this.array = new int[10];
        this.size = 0;
    }

    public void add(int a) {
        if (size == array.length) {
            int[] array2 = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        array[size++] = a;
    }

    public int get(int a){
        return array[a]; ///n=3   3 лежит в n
    }

    public void delete(int a){
        for (int i = a; i <size; i++) {
            array[i] = array[i+1];
        }
    }


}
