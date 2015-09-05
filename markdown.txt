TAREA 4
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


















Lupitha@Lupitha-HP MINGW64 ~
$ git checkout master
fatal: Not a git repository (or any of the parent directories): .git

Lupitha@Lupitha-HP MINGW64 ~
$ cd poo1

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_1)
$ git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

Lupitha@Lupitha-HP MINGW64 ~/poo1 (master)
$ git merge tarea_1
Updating b8bcdea..fc7e533
Fast-forward
 fizzbuzz.cpp | 23 +++++++++++++++++++++++
 1 file changed, 23 insertions(+)
 create mode 100644 fizzbuzz.cpp

Lupitha@Lupitha-HP MINGW64 ~/poo1 (master)
$ git push origin master
Total 0 (delta 0), reused 0 (delta 0)
To git@github.com:GuadalupeRS/poo1.git
   b8bcdea..fc7e533  master -> master

Lupitha@Lupitha-HP MINGW64 ~/poo1 (master)
$ git branch -d tarea_1
Deleted branch tarea_1 (was fc7e533).

Lupitha@Lupitha-HP MINGW64 ~/poo1 (master)
$ git push origin :tarea_1
Warning: Permanently added the RSA host key for IP address '192.30.252.130' to the list of known hosts.
To git@github.com:GuadalupeRS/poo1.git
 - [deleted]         tarea_1

Lupitha@Lupitha-HP MINGW64 ~/poo1 (master)
$ git checkout -b tarea_4
Switched to a new branch 'tarea_4'

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git status
On branch tarea_4
Untracked files:
  (use "git add <file>..." to include in what will be committed)

        Hello!.md
        hospital.cpp
        hospital.exe
        promedio.cpp
        promedio.exe
        promedio.scala
        scala/

nothing added to commit but untracked files present (use "git add" to track)

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git add Hello!.md
bash: !.md: event not found

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git add Hello!.md
bash: !.md: event not found

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git add Hello!.md
bash: !.md: event not found

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git status
On branch tarea_4
Untracked files:
  (use "git add <file>..." to include in what will be committed)

        Hello!.md
        Hello!c.md
        hospital.cpp
        hospital.exe
        markdown.txt
        promedio.cpp
        promedio.exe
        promedio.scala
        scala/

nothing added to commit but untracked files present (use "git add" to track)

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git add markdown.txt

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git status
On branch tarea_4
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        new file:   markdown.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        Hello!.md
        Hello!c.md
        hospital.cpp
        hospital.exe
        promedio.cpp
        promedio.exe
        promedio.scala
        scala/


Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git commit -m "markdown"
[tarea_4 51eae5b] markdown
 1 file changed, 56 insertions(+)
 create mode 100644 markdown.txt

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$ git push origin tarea_4
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 853 bytes | 0 bytes/s, done.
Total 3 (delta 1), reused 0 (delta 0)
To git@github.com:GuadalupeRS/poo1.git
 * [new branch]      tarea_4 -> tarea_4

Lupitha@Lupitha-HP MINGW64 ~/poo1 (tarea_4)
$
