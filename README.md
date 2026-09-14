# Object-Oriented Programming Concepts

Two compact examples showing how object-oriented design organizes shared behavior and specialized implementations in Java and C++.

## Concepts demonstrated

- encapsulation
- inheritance
- polymorphism
- method overriding
- reusable base abstractions

## Examples

| File | Language | Focus |
| --- | --- | --- |
| [`shape_area_calculator.java`](shape_area_calculator.java) | Java | Shape hierarchy and area calculation |
| [`animal_inheritance.cpp`](animal_inheritance.cpp) | C++ | Inheritance and polymorphic animal behavior |

## Run the examples

Java:

```bash
mkdir -p /tmp/oop-demo
cp shape_area_calculator.java /tmp/oop-demo/Program.java
javac /tmp/oop-demo/Program.java
java -cp /tmp/oop-demo Program
```

C++:

```bash
g++ -std=c++17 -Wall -Wextra -pedantic animal_inheritance.cpp -o animal_inheritance
./animal_inheritance
```

## Design questions explored

- Which behavior belongs in a shared parent abstraction?
- Which behavior should subclasses override?
- When does polymorphism simplify client code?
- How do Java and C++ express related object models differently?

## Foundation portfolio

This repository is part of a five-repository learning path:

1. [Foundations & Algorithms](https://github.com/Tybent18/foundations-algorithms)
2. [Data Structures Practice](https://github.com/Tybent18/data-structures-practice)
3. [OOP Concepts](https://github.com/Tybent18/oop-concepts)
4. [Math for Computing](https://github.com/Tybent18/math-for-computing)
5. [Practical Utilities](https://github.com/Tybent18/practical-utilities)

## Status

Foundational examples complete. The repository intentionally favors focused demonstrations over framework-sized projects.

## License

[MIT](LICENSE)
