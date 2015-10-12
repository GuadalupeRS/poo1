var total=0.0
menu()

def menu() {
  mostrarMenuPrincipal()
  var opcion=3
  do {
    println("Que opcion deseas??")
    opcion = readInt()
    opcion match {
      case 1 => salario()
      case 2 => {
        empresa()
        condiciones()
      }
      case default => println("Adios...")
    }
  }while(opcion != 3)
}

def mostrarMenuPrincipal() {
  println("1) Salario")
  println("2) Empresa")
  println("3) Salir")
}

def salario(){
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
}

def empresa(){
  println("Cuantas piezas va a comprar?");
  val piezas=readInt();
  println(piezas);
  println("Cual es el costo?");
  val costo=readFloat();
  println(costo);
  total=costo*piezas;
  println("tu total a pagar es: " + total);
}

def condiciones(){
  if(total>500000){
     val invierte=(total/100)*55;
     println("la empresa va a invertir la cantidad del 55%: " + invierte);
     val prestado=(total/100)*30;
     println("El banco le prestara el 30%: " + prestado);
     val credito=(total/100)*15;
     val intcredito=((total/100)*30)*.20;
     val totcredito=credito+intcredito;
     println("La empresa pedira a credito el 15%: " + totcredito)
     val cfinal=invierte + prestado + totcredito;
     println("La cuenta final es: " + cfinal)
  }

  if(total<=500000){
     val invierte=(total/100)*70;
     println("La empresa va a invertir el 70%: " + invierte);
     val credito=(total/100)*30;
     val intcredito=((total/100)*30)*.20;
     val totcredito=credito+intcredito;
     println("La empresa pedira un credito del 30%: " + totcredito);
     val cfinal=invierte + totcredito;
     println("La cuenta final es: " + cfinal)
  }
}
