println("Cuantas piezas va a comprar?");
val piezas=readInt();
println(piezas);
println("Cual es el costo?");
val costo=readFloat();
println(costo);
val total=costo*piezas;
println("tu total a pagar es: " + total);

if(total>500000){
   val invierte=(total/100)*55;
   println("la empresa va a invertir la cantidad del 55%: " + invierte);
   val prestado=(total/100)*30;
   println("El banco le prestara el 30%: " + prestado);
   val credito=(total/100)*15;
   val intcredito=((total/100)*30)*.20;
   val totcredito=credito+intcredito;
   println("La empresa pedira a credito el 15%: " + totcredito)
   val cfinal=invierte + prestado + totcredito;
   println("La cuenta final es: " + cfinal)
}

if(total<=500000){
   val invierte=(total/100)*70;
   println("La empresa va a invertir el 70%: " + invierte);
   val credito=(total/100)*30;
   val intcredito=((total/100)*30)*.20;
   val totcredito=credito+intcredito;
   println("La empresa pedira un credito del 30%: " + totcredito);
   val cfinal=invierte + totcredito;
   println("La cuenta final es: " + cfinal)
}
