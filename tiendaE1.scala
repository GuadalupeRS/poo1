println("Total a pagar: ");
val total=readFloat()
println(total);
println("Cual es el color de la bolita? (blanco, verde, amarillo, azul o rojo)");
val color=readLine()
println(color);
if(color=="blanco"){
   println("Va a pagar: " + total)
}
if(color=="verde"){
   val descuento=total - ((total/100)*10);
   println("Va a pagar: " + descuento)
}
if(color=="amarillo"){
   val descuento=total - ((total/100)*25);
   println("Va a pagar: " + descuento)
}
if(color=="azul"){
   val descuento=total - ((total/100)*50);
   println("Va a pagar: " + descuento)
}
if(color=="rojo"){
   val descuento=0;
   println("Va a pagar: " + descuento)
}
else{
   println("GRACIAS");
}