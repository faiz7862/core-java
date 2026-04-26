## Accessing Non-Static (Instance) Variables in Java

A **non-static (instance) variable** belongs to an **object**, not the class.
So it must be accessed using an **object reference**.

---

# 1. Access Inside the Same Class (Non-Static Method)

### Example

```java id="2k7n9r"
class Test {
    int x = 10;   // non-static variable

    void display() {
        System.out.println(x);   // ✔ directly accessible
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
```

### Why it works?

* `display()` is non-static → it belongs to object
* So it can directly access `x`

---

# 2. Access Inside Static Method (Important Case)

### ❌ Wrong

```java id="kz5k0c"
class Test {
    int x = 10;

    public static void main(String[] args) {
        System.out.println(x); // ❌ ERROR
    }
}
```

### ✔ Correct

```java id="ps7z8n"
class Test {
    int x = 10;

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.x); // ✔ access using object
    }
}
```

### Reason

* `main()` is static
* Static methods **cannot directly access non-static variables**

---

# 3. Access from Another Class

### Example

```java id="e3m9xa"
class A {
    int x = 100;
}

class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x);
    }
}
```

---

# 4. Using `this` Keyword (Inside Class)

```java id="h8s4qb"
class Test {
    int x = 10;

    void show() {
        System.out.println(this.x); // same as x
    }
}
```

---

# Key Concept

| Context           | How to Access          |
| ----------------- | ---------------------- |
| Non-static method | Directly (`x`)         |
| Static method     | Using object (`obj.x`) |
| Other class       | Using object (`obj.x`) |

---

# Simple Rule

* **Non-static = belongs to object**
* So you always need:

```java id="g4m8zn"
ClassName obj = new ClassName();
obj.variable;
```

---

## Interview One-Liner

> Static methods cannot access non-static variables directly because they belong to the class, not to any object.

---

If needed, can explain **static vs non-static memory diagram**, which makes this concept very clear.
