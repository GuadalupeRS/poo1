var total=0;
var esApto=true;
for(i<-1 to 10){
   println("cual es el tiempo que te tardas en el dia " + i + ":   ");
   val tiempo=readInt();
   println(tiempo);
   if(tiempo>16){
       esApto=false;
   }
   total=total + tiempo;
}
println("el total de los 10 dias es : " + total);
val promedio=total/10;
println("tu promedio es: " + promedio);

if(promedio<=15 && esApto==true){
   println("si eres apto");
}
else{
   println("elige otra especialidad");
}
