import java.util.Arrays;
import java.util.Collections;

public class IntArray {


   private int[] array;
   private int index = 0;

   // Создать для такого класса конструкторы, в которые можно передавать количество элементов массива,
   // уже готовый массив.

   public IntArray(int a) {
      array = new int[a];
      int min = 1;
      int max = 20;
      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * (max - min)) + min;
      }
      for (int i : array) {
         System.out.print(i + " ");
      }
   }


// Создать конструктор без параметров, который будет создавать массив из 10 элементов.

   public IntArray() {
      array = new int[10];
      int min = 1;
      int max = 20;
      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * (max - min)) + min;
      }
      for (int a : array) {
         System.out.print(a +" ");
      }
   }

// Добавить в класс метод сортировки sort (любой на выбор), который в себя принимает в качестве параметра число,
// если число положительное, то массив внутри объекта сортируется по возрастанию, если ноль или отрицательное, то по убыванию.

   public int[] sort(int number) {

      if (number > 0) {
         Arrays.sort(array);
      } else {
         int[] sortedDesc = Arrays.stream(array)
                 .boxed()
                 .sorted(Collections.reverseOrder())
                 .mapToInt(Integer::intValue)
                 .toArray();

         array = sortedDesc;
      }
      return array;
   }


//   Добавить методы, с помощью которых можно будет работать с внутренним массивом без прямого обращения к нему (геттеры, сеттеры и тд)

   public int[] getArray(){
      return array;
   }

   public void setArray(int [] array){
      this.array = array;
   }

   public void add(int i) {
   }


   //Твой код
//   public void add(int n) {
//      if (array.length == index) {
//         int[] arrayCopy = new int[array.length + 1];
//         for (int i = 0; i < array.length; i++) {
//            arrayCopy[i] = array[i];
//         }
//         array = arrayCopy;
//      }
//      array[index] = n;
//      index++;
//   }
}



