# Object-Oriented Abstraction in Java and C++: A Focused Comparative Design Study

**T. R. Bentley**  
Repository-grounded technical report | September 2026  
Repository: Tybent18/oop-concepts

> [Download the publication PDF](object-oriented-abstraction-java-cpp.pdf) · [Repository README](../README.md)

## Abstract

This concise design report studies two focused object-oriented examples: a Java shape hierarchy and a C++ animal-inheritance exercise. The analysis centers on shared abstraction, specialization, overriding, and polymorphic dispatch. Because the evidence base contains only two examples, the document is deliberately scoped as a comparative technical note rather than a broad claim about object-oriented architecture.

## Scope

Encapsulation, inheritance, polymorphism, and overriding in Java and C++.

Claims are limited to named repository artifacts. Proposed tests, benchmarks, integrations, and research directions are future work—not reported results.

## Repository evidence map

| Cluster | Artifacts | Interpretation |
| --- | --- | --- |
| Shape hierarchy | `shape_area_calculator.java` | An abstract shape contract with specialized area implementations. |
| Animal hierarchy | `animal_inheritance.cpp` | A C++ inheritance example demonstrating specialized behavior. |

## Technical questions

- Which behavior belongs in a base abstraction?
- When does overriding reduce duplication without hiding intent?
- How do Java and C++ express related object models differently?

## Reproducible inspection protocol

A reviewer should clone the repository, record the commit SHA and toolchain versions, inspect each mapped artifact, execute only examples with declared entry points, preserve outputs and errors, and compare observations with stated expectations. A deliberate debugging failure is evidence only when its expected failure class is declared in advance.

## Evidence maturity

| Level | Meaning |
| --- | --- |
| E0 | Artifact listed |
| E1 | Intended behavior described |
| E2 | Environment, command, and output recorded |
| E3 | Repeatable behavioral tests included |
| E4 | Frozen data supports a bounded comparison |

## Limitations

- Two examples cannot support general performance or maintainability conclusions.
- No design-pattern catalog or production framework is implemented.
- The Java filename differs from its public Program class and requires a temporary rename to compile conventionally.

## Development roadmap

- Add tests for subtype behavior and invalid inputs.
- Introduce composition as a comparison to inheritance.
- Add class diagrams generated from the implemented code.

## Portfolio role

This repository belongs to the cumulative sequence **Foundations & Algorithms → Data Structures Practice → OOP Concepts → Math for Computing → Practical Utilities**. Advanced repositories carry the stronger systems and empirical-research claims.

## Conclusion

The repository is most credible when each claim points to inspectable code and future measurements can be added without rewriting history. Sophistication comes from traceability, not inflated labels.
