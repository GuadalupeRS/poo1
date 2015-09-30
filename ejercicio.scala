println("Tienda")
var opcion=3
var i=0
var nombre= new Array[String](20)
var precio= new Array[Float](20)
var codigo= new Array[String](14)


catalogo()

def catalogo(){
  do{
    mostrarMenuPrincipal()
    opcion=readInt()
    opcion match{
      case 1 => agregarProductos()
      case 2 => {
        var continua='n'
        mostrarCatalogoProductos()
        var total=0
        do{
          println("Cual es el costo de tu producto?")
          var costoP=readInt()
          println(costoP)
          println("Deseas comprar un producto?")
          continua=readChar()
          total=costoP+total
        }while(continua=='s')
        println("Tu total a pagar es: " + total)
        println("Con cuanto vas a pagar?")
        var pagar=readFloat()
        println(pagar)
        if(pagar>=total){
          var totalF=pagar - total
          println("Tu cambio es: " + totalF)
        }
        else{
          println("ERROR")
        }
      }
      case default => println ("adios....")
    }
  }while(opcion != 3)
}

  def mostrarMenuPrincipal(){
    println("1)Agregar productos")
    println("2)Nota")
    println("3)Salir")
  }

  def agregarProductos(){
    var continuar='n'
    do{
      i+=1
      capturarDatosProducto()
      mostrarCatalogoProductos()
      println("Quieres agregar otro producto?(s/n)")
      continuar=readChar()
    }while(continuar=='s')
  }
    def capturarDatosProducto(){
      println("DATOS DEL PRODUCTO " )
      println("Nombre:")
      nombre(i) = readLine()
      println("Precio: ")
      precio(i)=readFloat()
      println("Codigo de barras:")
      codigo(i)=readLine()
    }

    def mostrarCatalogoProductos(){
    println("NOMBRE ------ PRECIO ------CODIGO" )
    for(j <- 1 to i){
      println(nombre(j) + "------" + precio(j) +"------" + codigo(j) )
      }
    }
