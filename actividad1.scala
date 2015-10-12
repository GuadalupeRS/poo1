
  var a = 0.0
  var b = 0.0
  var c = 0.0
  var trabfin = 0.0
  var exfin = 0.0
  var prom = 0.0
  promedio()


def promedio (){
  var opcion=3
  do{
    mostrarMenuPrincipal()
    println("Que opcion deseas? ")
    opcion = readInt()
    opcion match {

    case 1=>{
      promedioCalificacion()
      examen()
      total()
    }
    case 2=>hospital()
    case default => println ("Adios...!")
    }
  } while (opcion == 3)
}

def mostrarMenuPrincipal(){
println("1) Promedio")
println ("2) Hospital")
println ("3) Salir")
}

def promedioCalificacion(){
  println("Primera calificacion: ");
  a=readFloat();
  println(a)
  println("segunda calificacion: ");
  b=readFloat();
  println(b)
  println("tercera calificacion: ");
  c=readFloat();
  println(c)
  prom=(a+b+c)/3
}

def examen(){
  println("calificacion examen final: ");
  exfin=readFloat();
  println(exfin)
  println("trabajo final: ");
  trabfin=readFloat();
  println(trabfin)
}

def total(){
  var promtotal=(prom*.55)+(exfin*.30)+(trabfin*.15);
  println("calificacion final: " + promtotal);
}

def hospital(){
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
