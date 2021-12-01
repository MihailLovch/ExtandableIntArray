public class EndlessIntArray {
    private int[] array = new int[2];
    private int length = 0;
    public int getLength(){
        return this.length;
    }
    public int getCapacity(){
        return array.length;
    }
    public int indexOf(int num){
        for (int i = 0; i < getLength(); i++){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }
    public void add(int num){
        if (array.length <= length){
            int[] arr2 = new int[(int) (array.length * 1.5)];
            for (int i = 0; i < array.length; i++){
                arr2[i] = array[i];
            }
            array = arr2;
        }
        array[length] = num;
        length++;
    }
    public boolean isEmpty(){
        return this.length == 0;
    }
    public int remove(int index){
        int removed = array[index];
        int[] arr = new int[array.length];
        for (int i = 0; i < index; i++){
            arr[i] = array[i];
        }
        for (int i = index + 1; i < length; i++){
            arr[i - 1] = array[i];
        }
        array = arr;
        this.length --;
        return removed;
    }
    public int[] toArray(){
        int[] arr = new int[this.length];
        for (int i = 0; i < this.length; i++){
            arr[i] = array[i];
        }
        return arr;
    }
}

