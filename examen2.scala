var resp='s'

do{
  println("1)Puntos contaminantes")
  println("2)Bosque")
  println("Que opcion deseas?")
  var opcion=readInt()
  opcion match{
    case 1 => contaminante()
    case 2 => bosque()
  }
  println("Deseas regresar al menu (s/n)?")
  resp=readChar()
}while(resp=='s')

def contaminante(){
  println("EXAMEN")
  var suma=0
  var menor=101
  var mayor=1
  var puntos=0
  for(i <- 1 to 25){
    println("Ingresa el numero de puntos: ")
    puntos=readInt()
    if(puntos<menor){
      menor=puntos
    }
    if(puntos>mayor){
      mayor=puntos
    }
    suma=suma + puntos
  }
  println("el promedio es: " + (suma/25))
  println("El menor contaminante es: " + menor)
  println("El mayor contaminante es: " + mayor)
}

def bosque(){
  var pino=0.0
  var hectareas=0.0
  var oyamel=0.0
  var cedro=0.0
  var metros=0.0
  var cantPino=0.0
  var cantOyamel=0.0
  var cantCedro=0.0
  println("Cuantas hectareas mide el terreno?")
  hectareas=readFloat()
  metros=hectareas*10000
  if(metros>1000000){
    pino=(metros/100)*70
    oyamel=(metros/100)*20
    cedro=(metros/100)*10
    println("Se va a sembrar " + pino + "metros cuadrados de pino")
    println("Se va a sembrar " + oyamel + "metros cuadrados de oyamel")
    println("Se va a sembrar " + cedro + "metros cuadrados de cedro")
    cantPino=(0.8)*pino
    cantOyamel=(1)*oyamel
    cantCedro=(0.5555555)*cedro
    println("Se van a sembrar " + cantPino + "arboles de pino")
    println("Se van a sembrar " + cantOyamel + "arboles de oyamel")
    println("Se van a sembrar " + cantCedro + "arboles de cedro")
  }
  if(metros<=1000000){
    pino=(metros/100)*50
    oyamel=(metros/100)*30
    cedro=(metros/100)*20
    println("Se va a sembrar " + pino + "metros cuadrados de pino")
    println("Se va a sembrar " + oyamel + "metros cuadrados de oyamel")
    println("Se va a sembrar " + cedro + "metros cuadrados de cedro")
    cantPino=(0.8)*pino
    cantOyamel=(1)*oyamel
    cantCedro=(0.5555555)*cedro
    println("Se van a sembrar " + cantPino + "arboles de pino")
    println("Se van a sembrar " + cantOyamel + "arboles de oyamel")
    println("Se van a sembrar " + cantCedro + "arboles de cedro")
  }
}
