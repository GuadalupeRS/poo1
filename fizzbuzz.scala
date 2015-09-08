println("fizzbuzz");
println("ingrese un numero: ");
val n=readInt();
println(n);
for (i<-1 to n){
   println(" " + i + " ");
   if(i%3==0){
      println(" fizz ");
   }
   if(i%5==0){
      println(" buzz ");
   }
   if(i%3==0 && i%5==0){
      println(" fizzbuzz ");
   }
}
