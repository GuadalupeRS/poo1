println("Cuantas horas laboraste?")
val horas=readFloat()
println(horas);
if(horas<=40){
   val salario=160*horas;
   println("Tu salario es de: $" + salario);
}
if(horas>40){
   val extras=horas-40;
   println(extras);
   val salario=(160*40)+(200*extras);
   println("Tu salario es de: $" + salario);
}
else{
   println("GRACIAS");
}