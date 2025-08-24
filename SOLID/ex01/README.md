# Exercise ex01

How to run:

```bash
cd src
javac Demo01.java.java
java Demo01
```

Tasks:

- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

Solution - 

- Identifying violations -

1. in order service, taxRate is hardcoded, should be parameterized
2. Email client should be an interface, which accepts concrete class i.e implementations in constructor

is it responsibility of OrderService to calculate tax? are we violating single responsibility principle?

the calculate tax function isnt complex, only dependent on taxRate which we are passing as a paramater, so it should work.
