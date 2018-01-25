package HW12;
import java.util.*;
public abstract class Lab12Queue implements Queue<E> {
   private ArrayList<E> list = new ArrayList<>(E);

}


interface Queue<E> extends Collection<E>{
   public static boolean add(E e){
	   
   }
   public static   E element(){
	   
   }
   public boolean offer(E e){
	   
   }
   public E peek(){}
   public default E poll(){
	   return
   }
   public E remove(){
	   if(!isEmpty()){
		   E e = list.get(0);
		   list.remove(0);
		   return e;
		   }else{
		   throw new NoSuchElementException();
		   }
   }
   public boolean isEmpty() {
	// TODO Auto-generated method stub
	return list.isEmpty()
   
   
}
interface Collection<E>{
	
}