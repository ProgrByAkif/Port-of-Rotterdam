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
