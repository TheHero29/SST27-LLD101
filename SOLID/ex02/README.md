# Exercise ex02

How to run:

```bash
cd src
javac Demo02.java.java
java Demo02
```

Tasks:

- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

solution - 

there was violation of SRP in Player class's play method, we would have to change the play method if we want to change the caching or drawing logic, now its separate class.
