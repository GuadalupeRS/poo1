def Calificaciones (){
println("Primera calificacion: ");
val a=readFloat();
println(a)
println("segunda calificacion: ");
val b=readFloat();
println(b)
println("tercera calificacion: ");
val c=readFloat();
println(c)
var prom=(a+b+c)/3

println("calificacion examen final: ");
val exfin=readFloat();
println(exfin)

println("trabajo final: ");
val trabfin=readFloat();
println(trabfin)

var promtotal=(prom*.55)+(exfin*.30)+(trabfin*.15);
println("calificacion final: " + promtotal);

}
def Hospital (){
println("PRESUPUESTO PARA EL HOSPITAL")

println("Presupuesto: ");
val presupuesto=readFloat();
println(presupuesto);

val ginecologia=(presupuesto/100)*40;
println("Ginecologia: " + ginecologia);

val traumatologia=(presupuesto/100)*30;
println("traumatologia: " + traumatologia);

val pediatria=(presupuesto/100)*30;
println("Pediatria: " + pediatria);


}

def Empresa(){
println ("Rocket Queen Industries")

println("Persona 1: ");
val cant1=readFloat();
println(cant1);
println("Persona 2: ");
val cant2=readFloat();
println(cant2);
println("Persona 3: ");
val cant3=readFloat();
println(cant3);

val cantotal=(cant1+cant2+cant3);
println("Porcentaje 1: ");
val porcentaje1= (cant1*100)/cantotal;
println(porcentaje1);

println("Porcentaje 2: ");
val porcentaje2= (cant2*100)/cantotal;
println(porcentaje2);

println("Porcentaje 3: ");
val porcentaje3= (cant3*100)/cantotal;
println(porcentaje3);

}


println ("Que opcion deseas??")
println ("1.- Calificaciones")
println ("2.- Hospital")
println  ("3.- Empresa")
var opcion=readInt()
println (opcion)


opcion match {

case 1=> Calificaciones()
case 2 => Hospital()
case 3 => Empresa()
case default => println("Opcion Invalida")
}
