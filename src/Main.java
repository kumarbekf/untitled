
public class Main {
    public static void main(String[] args) {
        int[] mas = new int []{1,2,3,4,5};
  Klass klass = new Klass(10,"hello", mas);
        System.out.println(klass.getSan());
        System.out.println(klass.getSoz());
        for (int i = 0; i < klass.getMassiv().length; i++) {
            System.out.print(klass.getMassiv()[i]+" ");
        }




    }



    }
