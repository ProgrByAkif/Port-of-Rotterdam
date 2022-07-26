# Port-of-Rotterdam
A small simulation of the containers in the port. 

In this exercise you simulate the unloading of a container ship. This task is mainly designed to teach you the use of inheritance, polymorphism and threading. Use inheritance and polymorphism helps you program more efficiently, making it easier later it's time to expand your program (this is often the case with projects).Problems encountered by computer programs when using multithreading
want the same data. Such questions are included in this assignment. It is our responsibility to find the right solution for this.


THE MODEL:

- Een containerschip is aangekomen in de Rotterdamse haven en ligt aan de kade.

- Containers are removed from the ship using two cranes.

- The cranes place containers on the quay, provided there is enough space to
to place the container.

- The containers placed on the quay are collected and driven away by three
trucks. Please note, trucks do not use the cranes. containers
are “picked up” by the trucks themselves.

- Hoisting a container from the ship and placing it on the quay takes time. That one time
does that take a little longer than the others

- Every truck will spend some time driving away from a container. Also this
some take a little longer than others.



THE CONTAINERSHIP:

- The container ship contains 100 containers. This, like other numbers used in this problem
be used, which is not realistic.

- When a container has been lifted from the ship, the ship reports this by sending a
message on the screen.



THE CONTAINERS:

- To keep track of which container is used by which crane and which truck
handled, each container has a unique tracking number.

- There are 3 types of containers (distributed randomly on the container ships): a standard
type, a refrigerated container and a heated container. The way the containers
be collected from the ship differs per type of container:

  - the standard type does not require any special handling when unloading,
  - the heated container must first be disconnected from the heating elements (this
must be made visible by means of a message on the screen),
  - the refrigerated container must first be disconnected from the cooling elements (this must be
be made visible through an on-screen message that is different from the
notification for the heated container)



THE CRANE:

- Each crane can lift one container at a time from the container ship.

- Both cranes work simultaneously: one crane does not have to wait for the other to finish
is. Both work completely independently of each other.

- Wanneer een kraan een container uit het schip getakeld heeft, zet deze de container op de
kade neer, gesteld dat op de kade genoeg plek is om de container neer te zetten.

- When the ship is empty, the cranes stop working.

- If there is no place on the quay to put the container down, the crane will have to
wait for a spot to become available.

- To distinguish one faucet from another, each faucet has a unique
name.

- As stated before, it will hoist out of the ship and put it on the quay of a
container time cost. A tap takes a minimum of 1 minute and a maximum of 6 minutes
(sometimes it is difficult to fasten the cables). To make sure that
checking this statement does not take 350 minutes, we use it when programming
the rule that 1 second counts for 1 minute. Handling a container programming
so by having the random generator of Java generate a number that lies between the
1000 and 6000 milliseconds.

- A crane constantly makes clear what it is doing:
    - When the crane removes a container from the ship, it reports this.
    - When the crane has placed the container on the quay, the crane makes
reporting of.


THE KADE:


