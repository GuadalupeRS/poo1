var resp='s'
println("Deseas ver el menu?")
resp=readChar()
do{
  println("1)Clasificacion de numeros")
  println("2)Tienda de naranjas")
  println("3)Reloj")
  println("4)Calificacion menor")
  println("Que opcion deseas?")
  var opcion=readInt()
  opcion match{
    case 1 =>numeros()
    case 2 =>tiendaNaranjas()
    case 3 =>relojDigital()
    case 4 =>calificacionMenor()
  }

  def numeros(){
    var numero=0.0
    var cantidadP=0
    var cantidadN=0
    var cantidadNeutro=0
    println("CLASIFICACION DE NUMEROS")
    for(i<- 1 to 20){
      println("ingresa un numero: ")
      numero=readFloat()
      println(numero)
      if(numero>0){
      cantidadP += 1
      }
      else if(numero<0){
      cantidadN +=1
      }
      else{
      cantidadNeutro +=1
      }
    }
    println("Ingresaste " + cantidadP + "numeros positivos")
    println("Ingresaste " + cantidadN + "numeros negativos")
    println("Ingresaste " + cantidadNeutro + "numeros neutros")
  }

  def tiendaNaranjas(){
    println("2)TIENDA DE NARANJAS")
    var kilos=0.0
    var totalC=0.0
    var totalT=0.0
    println("Cuanto cuesta el kilo de naranja: ")
    val precioK=readFloat()
    for(i<-1 to 15){
      println(i + ".-Cuantos kilos de naranja compraste: ")
      kilos=readFloat()
      totalC=precioK*kilos
      if(kilos>10){
        totalC=totalC*0.85
      }
      totalT +=totalC
      println("Vas a pagar: " + totalC)
      println("La tienda va a recibir: " + totalT)
    }
  }

  def relojDigital(){
    println("3)RELOJ")
    for(horas <- 0 to 23){
      for(minutos <- 0 to 59){
        for(segundos <- 0 to 59){
          println(horas + ":" + minutos + ":" + segundos)
        }
      }
    }
  }

  def calificacionMenor(){
    println("4)CALIFICACION MENOR")
    var menor=11.0
    var calificacion=0.0
    for(i <- 1 to 40){
      println("Ingresa tu calificacion: ")
      calificacion=readFloat()
      if(calificacion<menor){
        menor=calificacion
      }
    }
    println("La calificacion menor es: " + menor)
    }
}while(resp=='s')
