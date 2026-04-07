# Lab 3 - Interfaces

This lab covers Object-Oriented Programming concepts related to **Interfaces** in Java.

## Project Structure

```
lab3/
├── src/
│   ├── Problem1/          # Interface vs Abstract Class
│   ├── Problem2/          # Moveable Interface Extension
│   ├── Problem3/          # MyCollection Interface
│   ├── Problem4/          # Employee & Manager with Comparable
│   ├── problem5/          # Chocolate & Generic Sort
│   └── Problem6/          # Enhanced Person & Animal Classes
├── bin/                   # Compiled classes
└── README.md
```

## Problems Overview

### Problem #1: Interface vs Abstract Class
**Directory:** `src/Problem1/`

Demonstrates the difference between interfaces and abstract classes:
- **Abstract Class:** `Clothes` with shared implementation
- **Concrete Class:** `Dress` extending `Clothes`
- **Interfaces:** `EatAble` and `GoShop` for behaviors
- **Implementation:** `Student` class implements multiple interfaces

**Key Concepts:**
- Abstract classes for shared code and IS-A relationships
- Interfaces for defining contracts and multiple inheritance
- Classes can implement multiple interfaces

---

### Problem #2: Moveable Interface Extension
**Directory:** `src/Problem2/`

Demonstrates interface inheritance and implementation:
- **Base Interface:** `MoveAble` with `move()` method
- **Extended Interface:** `MoveAbleFast` extends `MoveAble` with `fast()` method
- **Implementation:** `Baby` class implements `MoveAbleFast`

**Key Concepts:**
- Interfaces can extend other interfaces
- Implementation of extended interfaces
- Polymorphism through interface references

---

### Problem #3: MyCollection Interface
**Directory:** `src/Problem3/`

Creates a generic collection interface:
- **Interface:** `MyCollection<T>` with standard collection methods
- Methods: `add()`, `remove()`, `contains()`, `pushFront()`, `getFront()`, `getBack()`, `size()`, `clear()`, `isEmpty()`

**Key Concepts:**
- Generic interfaces
- Collection data structures
- Interface contracts

---

### Problem #4: Employee & Manager with Comparable
**Directory:** `src/Problem4/`

Implements employee hierarchy with sorting capabilities:
- **Base Class:** `Person` with basic attributes
- **Employee Class:** Extends `Person`, implements `Comparable<Employee>` and `Cloneable`
- **Manager Class:** Extends `Employee` with team management
- **Comparators:** `ComparatorByHireDate` and `ComparatorByName`

**Key Concepts:**
- Comparable interface for natural ordering
- Comparator interface for custom sorting
- Cloneable interface for object copying
- Inheritance and polymorphism

---

### Problem #5: Chocolate & Generic Sort
**Directory:** `src/problem5/`

Implements generic sorting with comparable objects:
- **Classes:** `Chocolate` and `Time` implementing `Comparable`
- **Generic Sort:** `bubbleSort()` and `quickSort()` methods
- **Test:** Sorting arrays of different comparable types

**Key Concepts:**
- Generic methods with bounded type parameters
- Comparable interface implementation
- Sorting algorithms with generics

---

### Problem #6: Enhanced Person & Animal Classes
**Directory:** `src/Problem6/`

Comprehensive implementation with multiple interfaces:
- **Custom Interfaces:** `Trainable` and `Speaking`
- **Existing Interfaces:** `Comparable` and `Cloneable`
- **Classes:** Enhanced `Animal`, `Person`, `Dog`, `Cat`, `Student`, `Worker`

**Key Concepts:**
- Multiple interface implementation
- Interface design patterns
- Advanced OOP concepts (sorting, cloning, training, speaking)

## How to Compile and Run

### Compile All Problems:
```bash
cd lab3
javac -d bin src/Problem*/**/*.java src/problem5/*.java
```

### Run Individual Problems:
```bash
# Problem 1
java -cp bin Problem1.Test

# Problem 2
java -cp bin Problem2.Test

# Problem 4
java -cp bin Problem4.testEmployee

# Problem 5
java -cp bin problem5.Test

# Problem 6
java -cp bin Problem6.EnhancedClasses
```

## Key Learning Outcomes

1. **Interface vs Abstract Class:** Understanding when to use each
2. **Interface Inheritance:** Extending interfaces and multiple implementation
3. **Generic Interfaces:** Type-safe collection interfaces
4. **Comparable & Comparator:** Natural and custom ordering
5. **Cloneable:** Object copying patterns
6. **Multiple Interface Implementation:** Complex class hierarchies
7. **Generic Methods:** Type-safe algorithms
- `UniqueSet<E>` - no duplicates, unordered

**Key Concepts:**
- Generic interfaces with type parameters
- Different collection behaviors
- Bulk operations (addAll, removeAll, containsAll)

---

### Problem #4: Employee and Manager with Comparable
**File:** `Problem4_Employee.java`

Creates Employee/Manager hierarchy with Comparable interface and custom comparators.

**Classes:**
- `Person` - base class
- `Employee extends Person` - implements Comparable, Cloneable
- `Manager extends Employee` - manages team of employees
- Comparators: `EmployeeNameComparator`, `EmployeeHireDateComparator`

**Features:**
- Override `toString()` and `equals()` methods
- Implement `Comparable` interface (compare by salary/bonus)
- Custom comparators for sorting by name and hire date
- Cloning (shallow/deep) implementation
- Manager has team management capabilities

---

### Problem #5: Chocolate and Generic Sort Class
**File:** `Problem5_Sort.java`

Creates a generic Sort class that can sort any Comparable objects.

**Classes:**
- `Chocolate` - implements Comparable (compare by weight)
- `Time` - implements Comparable (compare by time)
- `Sort` - generic sorting utility

**Sorting Algorithms Implemented:**
- Bubble Sort - simple but slow
- Merge Sort - efficient divide-and-conquer
- Quick Sort - fast average-case

**Generic Methods:**
- `swap<E>()` - reusable swap method
- `bubbleSort<E extends Comparable<E>>()`
- `mergeSort<E extends Comparable<E>>()`
- `quickSort<E extends Comparable<E>>()`

**Usage:** Sort Chocolates, Times, and Employees using same Sort class

---

### Problem #6: Enhanced Person and Animal with Interfaces
**File:** `Problem6_EnhancedClasses.java`

Improves Person and Animal classes using 2 existing and 2 custom interfaces.

**2 Existing Interfaces Implemented:**
1. `Comparable<T>` - compare by age
2. `Cloneable` - deep cloning support

**2 Custom Interfaces Created:**
1. `Trainable` - for trainable animals/workers (methods: train, knowsCommand, performTrick, getTrainingLevel)
2. `Speaking` - for communicative entities (methods: speak, sayName, getVoice)

**Classes:**
- `Animal implements Comparable, Cloneable, Trainable`
- `Dog extends Animal implements Speaking`
- `Cat extends Animal implements Speaking`
- `Person implements Comparable, Cloneable, Speaking`
- `Student extends Person`
- `Worker extends Person implements Trainable`

**Features:**
- Interface multiple inheritance
- Interface implementation with different behaviors
- Polymorphic collections
- Cloning with deep copy of collections

---

## Compilation and Execution

### Compile all files:
```bash
javac Problem1_InterfaceVsAbstractClass.java
javac Problem2_MoveableInterface.java
javac Problem3_MyCollection.java
javac Problem4_Employee.java
javac Problem5_Sort.java
javac Problem6_EnhancedClasses.java
```

### Run individual problems:
```bash
java Problem1_InterfaceVsAbstractClass
java Problem2_MoveableInterface
java Problem3_MyCollection
java Problem4_Employee
java Problem5_Sort
java Problem6_EnhancedClasses
```

---

## Key Concepts Covered

1. **Interfaces vs Abstract Classes**
   - When to use each for different design scenarios
   - Multiple interface implementation
   - Interface inheritance

2. **Generic Interfaces**
   - Type parameters in interfaces
   - Bounded type parameters

3. **Comparable Interface**
   - Natural ordering implementation
   - Integration with Java Collections
   - Custom comparators

4. **Cloneable Interface**
   - Shallow vs deep cloning
   - Clone method override

5. **Custom Interfaces**
   - Designing interfaces for specific behaviors
   - Role-based interfaces
   - Interface composition

6. **Generic Methods**
   - Type-safe sorting for any Comparable type
   - Generic constraints (extends Comparable)
   - Reusable generic utilities

---

## Notes

- All classes are fully tested with comprehensive main methods
- Proper encapsulation and access modifiers used
- Comprehensive documentation and comments
- Demonstrates best practices for interface design
- Shows polymorphic behavior across all problems
