public class SingletonLog {
    private static SingletonLog instance;
    private int[] arr;
    private int size;
    private SingletonLog(){
        System.out.println("Singleton Created");
        arr = new int[10];
        size = 0;
    }
    public static SingletonLog getInstance(){
        if (instance == null) {
            instance = new SingletonLog();
        }
        return instance;
    }
    public void addElement(int num){
        if(size < 10){
            arr[size++] = num;
        }else{
            System.out.println("Arr is full");
        }
    }

    public void PrintElems(){
        for(int x = 0; x< size; x++){
            System.out.printf(String.valueOf(arr[x]) +  " ");
        }
    }

}
