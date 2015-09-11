println("¿Cual es tu edad?")
val edad=readInt()
println(edad)
println("Que antigüedad tienes en tu empleo?")
val antiguedad=readInt()
println(antiguedad)
if(edad>=60 && antiguedad<25){
  println("Tu tipo de jubilacion es por: EDAD")
}
if(edad<60 && antiguedad>=25){
  println("Tu tipo de jubilacion es por: ANTIGÜEDAD JOVEN")
}
if(edad>=60 && antiguedad>=25){
  println("Tu tipo de jubilacion es por: ANTIGÜEDAD ADULTA")
}
else{
  println("GRACIAS")
}
