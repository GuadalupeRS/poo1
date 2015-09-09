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