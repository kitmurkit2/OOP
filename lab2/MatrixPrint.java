public class MatrixPrint {
  public static void main(String args[]){
    //PUT YOUR CODE HERE
          int size = 5;
    for(int i = 1; i <= size*size; ++i)
    {  
      String printed;
      if( (i==1) | (i==5) | (i==7) | (i==9) | (i==13) | (i==17) | (i==19) | (i==21) | (i==25))
      {
        printed = " * ";
      }
      else
      {
        printed = String.format("%2s ",i);
      }
      
      System.out.print(printed);
      if(i%size == 0)
      {
        System.out.println("");
      }
    }
    //PUT YOUR CODE HERE
  }
}