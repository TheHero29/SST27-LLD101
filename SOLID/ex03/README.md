# Exercise ex03

How to run:

```bash
cd src
javac Demo03.java.java
java Demo03
```

Tasks:

- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

observations  - 

earlier shipment cost calculator was checking type of shipment and then getting the cost, because of this if we ever wanted to change cost of any one type we would have to navigate the if else block, this violates the single responsibility principle. hence we distributed get cost methods to different classes which extends Shipment abstract class.
