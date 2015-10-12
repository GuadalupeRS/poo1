var color="nada"
var total=0.0
var edad=0.0
var antiguedad=0.0

catalogo()

def catalogo() {
  var opcion=3
  do {
    mostrarMenuPrincipal()
    opcion = readInt()
    opcion match {
      case 1 => {
        tienda()
        condicion()
      }
      case 2 =>{
        jubilacion()
        condicionJ()
      }
      case default => println("Adios...")
    }
  } while (opcion != 3)
}

def mostrarMenuPrincipal() {
  println("1) Tienda")
  println("2) Jubilacion")
  println("3) Salir")
}

def tienda(){
  println("Total a pagar: ");
  total=readFloat()
  println(total);
  println("Cual es el color de la bolita? (blanco, verde, amarillo, azul o rojo)");
  color=readLine()
  println(color);
}

def condicion(){
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
}

def jubilacion(){
  println("¿Cual es tu edad?")
  edad=readInt()
  println(edad)
  println("Que antigüedad tienes en tu empleo?")
  antiguedad=readInt()
  println(antiguedad)
}

def condicionJ(){
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
}
