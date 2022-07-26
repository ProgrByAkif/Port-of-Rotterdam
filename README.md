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


- The quay has room for a maximum of 5 containers.

- The order in which containers are placed on the quay does not matter. If there's room,
can a crane put down a container.

- The order in which containers are picked up by the trucks does not matter.
If there is a container on the quay, a truck can drive this container away.

- The quay constantly makes clear how many containers are on the quay.


THE TRUCKS:


- Three trucks are driving around the port area.

- If there is a container on the quay, it can be picked up by a truck
and drove off.

- The truck must check the type of container on the quay, and specific
perform actions for special types of containers::

    - For standard types, only print a notification on the screen showing the container
is loaded on the truck
    - For heated types, the container must be connected to the
heating element and print a message to that effect on the screen that the
container is connected to the heating element
    - For refrigerated types, the container must be connected to the cooling element
and print a notification on the screen that the container is associated with
the cooling element (which is different from the message for the heated container)


- Trucks, like the cranes, work simultaneously. So one truck doesn't have to go on
the other waiting.

- If no containers can be found on the quay, a truck waits until one is available
is available.

- A container driven away disappears from the model. So you don't have to program where
this container eventually remains. The truck drives away with a container and comes empty
back for the next.

- A truck takes at least 1 minute to drive a container away.

- Iedere vrachtwagen maakt voortdurend duidelijk wat deze aan het doen is:
    - When the truck picks up a container, the truck gives a
reporting of.
    - When the truck has driven off a container, the truck gives a notification
    - In order to distinguish one truck from another, each truck has
a unique name.
