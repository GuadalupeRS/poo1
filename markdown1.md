﻿TAREA 4
==================

 - Crear en su fork un archivo markdown con el
nombre proceso-tareas.md
 - Dónde expliquen paso por paso el proceso de
hacer un PR con su primera tarea
 - Desde clonar el repositorio, crear su branch,
hacer su commit, hacer el push y por último el
PR.
 -  Usando el código en C del ejercicio de FizzBuzz

----------


**ACTIVIDAD**
-------------


> **1. Clonar el repositorio:**
git clone git@github.com: GuadalupeRS/poo1.git
cd poo1
> **2. Crear un branch:**
git checkout -b tarea_1
>**3.hacer push al fork:**
git push origin tarea01
>**4. haz un PR del branc del fork al branch con tu usuario en el repositorio original:**
GuadalupeRS/tarea01 -> MontealegreLuis/GuadalupeRS


```.cpp
#include <stdio.h>
#include <iostream>
#include <conio.h>
using namespace std;

int main(void)
{
 int i;
 cout<<"fizzbuzz"<<endl<<endl;
 for(i=0;i<=30;i++)
 {
                   cout<<"  "<<i;
                   if(i%3==0)
                   {
                             cout<<"fizz";
                             }
                   if(i%5==0)
                   {
                                  cout<<"buzz"<<"  ";
                                  }
}
             getch();
}

```






