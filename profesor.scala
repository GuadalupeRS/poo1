class Profesor(n: String){
  val nombre=n
  var categoria: String = ""
  var precioHora: Double = 0.0
  var horasAsesoria: Double = 0.0

  def categorizar(c: String) {
    categoria = c
    categoria match {
      case "HC" => {
        precioHora = 75
        horasAsesoria = 75*3
      }
      case "MT" => {
        precioHora = 120
        horasAsesoria = 120*2
      }
      case "TC" => {
        precioHora = 180
        horasAsesoria = 180*2
      }
    }
  }
}

class Nomina(){
  val profesores= new Array[ProfesoresAPagar](50)
  var profesoresAPagar=0
  def pagar(profesor: Profesor, horasC: Int, horasA: Int){
     profesores(profesoresAPagar)= new ProfesoresAPagar(profesor, horasC, horasA)
     profesoresAPagar += 1
  }
  def totalAPagar(): Double = {
    var total=0.0
    for(i <-0 to profesoresAPagar - 1){
      total += profesores(i).pago()
    }
    return total
  }

}

class ProfesoresAPagar(p: Profesor, hC:Int, hA: Int){
  val profesor= p
  val horasPagarC=hC
  val horasPagarA=hA
  def pago(): Double = {
      var pago = profesor.precioHora * horasPagarC
      return pago + (profesor.horasAsesoria*horasPagarA)
    }
}

var respuesta='n'
val nomina= new Nomina()

do{
  val profesor=new Profesor("")
  println("Nombre del profesor: ")
  var nombre=readLine()
  println("Categoria (HC/ MT/ TC): ")
  var categoria=readLine()
  println("Horas clase: ")
  var horasC=readInt()
  println("Horas asesoria: ")
  var horasA=readInt()
  profesor.categorizar(categoria)
  nomina.pagar(profesor, horasC, horasA)

  println("Quieres realizar la nomina de otro profesor? (s/n) ")
  respuesta=readChar()
}while(respuesta!='n')
println("Total a pagar: " + nomina.totalAPagar())
