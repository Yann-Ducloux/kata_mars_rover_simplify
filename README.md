# Kata Mars Rover

## Contexte

Vous faites partie d’une équipe en charge de l’exploration de Mars, en envoyant un petit véhicule commandé à distance (appelé [Rover](https://fr.wikipedia.org/wiki/Mars_Exploration_Rover)) à la surface de la planète.

Vous devez développer un programme qui traduit les instructions envoyées depuis la Terre en instructions compréhensibles par le rover.

## Spécifications

- En entrée, vous recevez la position `(x,y)` du rover et son orientation (`NORD`, `SUD`, `EST`, `OUEST`)

- Le rover reçoit ensuite une liste de lettres :
    - `A` : avancer
    - `D` : tourner à droite
    - `G` : tourner à gauche

- En sortie, vous devez renvoyer la nouvelle position du Rover et son orientation.


#### Exemple :

* Étant donné que le Rover est en `(0,0)`, face au `NORD`

* Quand il reçoit la commande "A"

* Alors sa position finale est `(0, 1)`, face au `NORD`.
---
* Étant donné que le Rover est en `(0,0)`, face au `NORD`

* Quand il reçoit la commande "D"

* Alors sa position finale est `(0, 0)`, face au `OUEST`.
---
* Étant donné que le Rover est en `(0,0)`, face au `NORD`

* Quand il reçoit la commande "G"

* Alors sa position finale est `(0, 1)`, face au `EST`.
---
* Étant donné que le Rover est en `(0,0)`, face au `NORD`

* Quand il reçoit la commande "DAAGA"

* Alors sa position finale est `(2, 1)`, face au `NORD`.