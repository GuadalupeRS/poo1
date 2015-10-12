class Racional(n: Int, d: Int){
  val numerador= n
  val denominador=d
  def sumar(b: Racional): Racional= {
    new Racional(
      numerador*b.denominador + denominador*b.numerador,
      denominador*b.denominador
    )
  }

  def restar(b: Racional): Racional= {
    new Racional(
      numerador*b.denominador - denominador*b.numerador,
      denominador*b.denominador
    )
  }

  def division(b: Racional): Racional= {
    new Racional(
      numerador*b.denominador,
      denominador*b.numerador
    )
  }

  def multiplicacion(b: Racional): Racional= {
    new Racional(
      numerador*b.numerador,
      denominador*b.denominador
    )
  }
}

var opcion=5
do {
  println("1) Suma")
  println("2) Resta")
  println("3) Division")
  println("4) Multiplicacion")
  println("5) Salir")
  println("Que opcion deseas?")
  opcion = readInt()
    println("Ingresa el numerador de la primera fraccion: ")
    var n1=readInt()
    println("Ingresa el denominador de la primera fraccion: ")
    var d1=readInt()
    println("Ingresa el numerador de la segunda fraccion: ")
    var n2=readInt()
    println("Ingresa el denominador de la segunda fraccion: ")
    var d2=readInt()
    val a = new Racional(n1,d1)
    val b=new Racional(n2,d2)

  opcion match {
    case 1 => {
      val totalS= a.sumar(b)
      println("La suma es : " + totalS.numerador + "/" + totalS.denominador)
    }
    case 2 =>{
      val totalR= a.restar(b)
      println("La resta es : " + totalR.numerador + "/" + totalR.denominador)
    }
    case 3 =>{
      val totalD= a.division(b)
      println("La division es : " + totalD.numerador + "/" + totalD.denominador)
    }
    case 4 =>{
      val totalM= a.multiplicacion(b)
      println("La multiplicacion es : " + totalM.numerador + "/" + totalM.denominador)
    }
    case default => println("Adios...")
  }
} while (opcion != 5)
