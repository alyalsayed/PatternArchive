# PatternArchive

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)](#)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

PatternArchive is a collection of classic design pattern implementations aimed at helping you understand not only **how** to implement these patterns, but also **why** they exist and what problems they solve. Currently, this repository includes:

- **Observer Pattern**
- **Adapter Pattern**
- **Strategy Pattern**

---

## Table of Contents

- [About](#about)
- [Design Patterns](#design-patterns)
  - [Observer Pattern](#observer-pattern)
  - [Adapter Pattern](#adapter-pattern)
  - [Strategy Pattern](#strategy-pattern)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

---

## About

**PatternArchive** provides straightforward implementations of design patterns along with clear definitions and real-world problems that these patterns can solve. Definitions and explanations are sourced from reputable references like [Refactoring.Guru](https://refactoring.guru/design-patterns) and the original [Gang of Four](https://www.oodesign.com/design-patterns.html).

---

## Design Patterns

### Observer Pattern

- **Definition:**  
  The Observer pattern establishes a one-to-many dependency between objects so that when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.  
  [Refactoring.Guru Observer](https://refactoring.guru/design-patterns/observer)

- **Problem Solved:**  
  It decouples the subject from its observers, making it easier to add or remove observers without changing the subject code. This is particularly useful in event handling (e.g., GUI components, data change notifications).

- **Example Implementation:**  
  Use the Observer pattern when you need to implement event broadcasting—for instance, updating multiple display panels when new data is available.

- **Location in Repo:** [`/observer`](./src/main/java/org/example/adapter)

---

### Adapter Pattern

- **Definition:**  
  The Adapter pattern converts the interface of a class into another interface that clients expect. It allows incompatible interfaces to work together.  
  [Refactoring.Guru Adapter](https://refactoring.guru/design-patterns/adapter)

- **Problem Solved:**  
  It addresses the issue of integrating classes that cannot work together directly due to mismatched interfaces—commonly seen when using legacy code or third-party libraries.

- **Example Implementation:**  
  Apply the Adapter pattern when you need to integrate a third-party API into your application, or when refactoring legacy code to meet new interface requirements.

- **Location in Repo:** [`/adapter`](./adapter)

---

### Strategy Pattern

- **Definition:**  
  The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. This lets the algorithm vary independently from clients that use it.  
  [Refactoring.Guru Strategy](https://refactoring.guru/design-patterns/strategy)

- **Problem Solved:**  
  It allows the selection of an algorithm’s behavior at runtime, providing flexibility to change the algorithm without modifying the client code. Common use cases include different sorting methods, payment methods, or data compression strategies.

- **Example Implementation:**  
  Use the Strategy pattern when you want to choose between multiple algorithms dynamically—for instance, selecting the best sorting strategy based on the data set size.

- **Location in Repo:** [`/strategy`](./strategy)

---

## Getting Started

To run any of the examples locally:

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/alyalsayed/patternarchive.git
   cd patternarchive
