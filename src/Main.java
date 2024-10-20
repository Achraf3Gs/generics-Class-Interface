public class Main <T> implements X<T>{
    public static void main(String[] args) {
        System.out.println("Hello world!");



        Main <Integer>x = new Main<>();
        Integer arr[] = {1,2,3,4};
        x.putArray(arr);



    }
        @Override
        public void putArray(T[] x) {
          System.out.println(x.length);

    }


}


interface X<T>{
    void putArray(T[] x);
}