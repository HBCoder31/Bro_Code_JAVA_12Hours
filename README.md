<div align="center">

# ☕ Java Full Course — Hand-Typed

### Every line of Bro Code's *"Java Full Course for free ☕"* — typed, broken, fixed & understood by me.

[![Java](https://img.shields.io/badge/Java-25%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://jdk.java.net/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)](https://www.jetbrains.com/idea/)
[![Course](https://img.shields.io/badge/Course-12_Hours-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtu.be/xTtL8E4LzTQ)
[![Progress](https://img.shields.io/badge/Progress-55%2F71_lessons-2ea44f?style=for-the-badge)](#progress-tracker)
[![Status](https://img.shields.io/badge/Status-In_Progress-blue?style=for-the-badge)](#progress-tracker)

[▶ Watch the course](https://youtu.be/xTtL8E4LzTQ) · [🚀 Run it locally](#how-to-run) · [🗺️ Lesson map](#lesson-map) · [👤 Author](#author)

</div>

---

## 📖 About

This repo is my practice log for the **12-hour Java course by [Bro Code](https://www.youtube.com/@BroCodez)**. I did **not** copy-paste anything — every file was **hand-typed while watching**, so I'd actually build muscle memory for Java syntax, OOP design and problem-solving.

> 💡 **Why hand-type?** Reading code teaches you what it does. Typing it teaches you *why it breaks.*

The repo follows the video's structure, from "Hello World" all the way through OOP, with a **mini-project after almost every concept** (marked ⭐ in the video).

<table>
<tr>
<td align="center"><b>71</b><br/>lessons in the course</td>
<td align="center"><b>55</b><br/>covered so far</td>
<td align="center"><b>95</b><br/>Java files</td>
<td align="center"><b>~3,000</b><br/>lines hand-typed</td>
</tr>
</table>

---

<a id="progress-tracker"></a>

## 📈 Progress Tracker

✅ **Done:** Basics → Control flow → Methods → Arrays → 9 mini-games → Full OOP series
🚧 **Up next:** ArrayLists, Exception Handling, File I/O, Music Player, Hangman, Threads, Alarm Clock…

---

## 🗂️ Project Structure

Code is split by *how* I practiced it, not just by topic:

```
Bro_Code_JAVA_12Hours/
└── src/BroCodeJava/
    ├── Codes/             → 🧪 Core language concepts (one file per lesson)
    ├── Projects/          → ⭐ Mini-projects & games that combine those concepts
    └── ObjectOriented/
        └── Oops/          → 🧱 OOP series — one package per concept, each with its own Main
```

- **`Codes/`** — small, focused experiments. Open one, read the comments, run it.
- **`Projects/`** — the "now put it all together" lessons (calculator, banking, slot machine…).
- **`ObjectOriented/Oops/`** — each OOP idea (inheritance, interfaces, composition…) lives in its **own package** so the helper classes (`Animal`, `Car`, `Dog`…) don't clash between lessons.

---

<a id="lesson-map"></a>

## 🗺️ Lesson Map

Click a lesson to jump to that exact moment in the video. ✅ = typed & pushed, ⏳ = coming soon.

### 🧪 Fundamentals

| # | Time | Topic | Code |
|---|------|-------|------|
| 1 | [00:00:00](https://www.youtube.com/watch?v=xTtL8E4LzTQ) | Introduction to Java ☕ | ✅ |
| 2 | [00:10:58](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=658s) | Variables ❎ | ✅ [`variable.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/variable.java) |
| 3 | [00:31:30](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=1890s) | User input ⌨️ | ✅ [`UserInput.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/UserInput.java) |
| 5 | [00:54:08](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=3248s) | Arithmetic 🧮 | ✅ [`ArithmeticOperators.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/ArithmeticOperators.java) |
| 7 | [01:09:00](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=4140s) | If statements 🤔 | ✅ [`ifStatements.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/ifStatements.java) |
| 8 | [01:22:28](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=4948s) | Random numbers 🔀 | ✅ [`RandomClass.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/RandomClass.java) |
| 9 | [01:27:28](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=5248s) | Math class 📐 | ✅ [`MathCLass.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/MathCLass.java) |
| 10 | [01:42:37](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=6157s) | printf 🖨️ | ✅ [`printf.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/printf.java) |
| 12 | [02:03:47](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=7427s) | Nested if statements 🎟️ | ✅ [`nestedif.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/nestedif.java) |
| 13 | [02:10:20](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=7820s) | String methods 🧵 | ✅ [`StringMethods.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/StringMethods.java) |
| 14 | [02:18:55](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=8335s) | Substrings 📧 | ✅ [`substring.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/substring.java) |
| 16 | [02:35:19](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=9319s) | Ternary operator ❔ | ✅ [`ternaryOperator.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/ternaryOperator.java) |
| 18 | [02:49:05](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=10145s) | Enhanced switches 💡 | ✅ [`EnhancedSwitches.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/EnhancedSwitches.java) |
| 20 | [03:09:58](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=11398s) | Logical operators ❕ | ✅ [`logicalOperators.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/logicalOperators.java) |

### 🔁 Loops, Methods & Arrays

| # | Time | Topic | Code |
|---|------|-------|------|
| 21 | [03:21:23](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=12083s) | While loops ♾️ | ✅ [`whileLoops.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/whileLoops.java) |
| 23 | [03:43:33](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=13413s) | For loops 🔂 | ✅ [`forLoop.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/forLoop.java) |
| 24 | [03:53:33](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=14013s) | Break & continue 🚦 | ✅ [`breakContinue.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/breakContinue.java) |
| 25 | [03:55:45](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=14145s) | Nested loops ➿ | ✅ [`nestedLoop.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/nestedLoop.java) |
| 26 | [04:04:27](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=14667s) | Methods 📞 | ✅ [`Methods.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/Methods.java) |
| 27 | [04:19:51](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=15591s) | Overloaded methods 🍕 | ✅ [`OverLoadedMethods.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/OverLoadedMethods.java) |
| 28 | [04:25:59](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=15959s) | Variable scope 🏠 | ✅ [`VariableScope.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/VariableScope.java) |
| 31 | [05:03:26](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=18206s) | Arrays 🍎 | ✅ [`array.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/array.java) |
| 32 | [05:12:35](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=18755s) | Enter user input into an array ➡️ | ✅ [`UserInputArray.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/UserInputArray.java) |
| 33 | [05:20:38](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=19238s) | Search an array 🔎 | ✅ [`searchInArray.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/searchInArray.java) |
| 34 | [05:28:07](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=19687s) | Varargs 💬 | ✅ [`varargs.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/varargs.java) |
| 35 | [05:34:36](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=20076s) | 2D arrays ⬜ | ✅ [`arrays_2d.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Codes/arrays_2d.java) |

### ⭐ Mini-Projects

Each one is runnable and interactive in the console.

| # | Time | Project | Code |
|---|------|---------|------|
| 4 | [00:47:25](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=2845s) | ⭐ Mad Libs game 📕 | ✅ [`MadLibsGame.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/MadLibsGame.java) |
| 6 | [01:02:29](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=3749s) | ⭐ Shopping cart program 🛒 | ✅ [`Exercise2.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/Exercise2.java) |
| 11 | [01:56:14](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=6974s) | ⭐ Compound interest calculator 💸 | ✅ [`CompoundInterestCalculator.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/CompoundInterestCalculator.java) |
| 15 | [02:27:00](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=8820s) | ⭐ Weight converter 🏋️ | ✅ [`WeightConverter.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/WeightConverter.java) |
| 17 | [02:41:10](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=9670s) | ⭐ Temperature converter 🌡️ | ✅ [`TemperatureConverter.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/TemperatureConverter.java) |
| 19 | [02:57:42](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=10662s) | ⭐ Calculator program 🖩 | ✅ [`Calculator.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/Calculator.java) |
| 22 | [03:33:47](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=12827s) | ⭐ Number guessing game 🔢 | ✅ [`NumberGuessingGame.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/NumberGuessingGame.java) |
| 29 | [04:30:57](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=16257s) | ⭐ Banking program 💰 | ✅ [`BankingProgram.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/BankingProgram.java) |
| 30 | [04:51:26](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=17486s) | ⭐ Dice roller program 🎲 | ✅ [`DiceRollerProgram.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/DiceRollerProgram.java) |
| 36 | [05:44:13](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=20653s) | ⭐ Quiz game 💯 | ✅ [`JavaQuizGame.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/JavaQuizGame.java) |
| 37 | [05:59:14](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=21554s) | ⭐ Rock paper scissors 🗿 | ✅ [`RockPaperScissors.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/RockPaperScissors.java) |
| 38 | [06:15:02](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=22502s) | ⭐ Slot machine 🎰 | ✅ [`SlotMachine.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/SlotMachine.java) |

### 🧱 Object-Oriented Programming

Each concept is its own package under [`src/BroCodeJava/ObjectOriented/Oops/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops).

| # | Time | Topic | Code |
|---|------|-------|------|
| 39 | [06:41:47](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=24107s) | Object-oriented programming 🧱 | ✅ [`Oops1.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/ObjectOriented/Oops/Oops1.java) |
| 40 | [06:51:38](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=24698s) | Constructors 🔨 | ✅ [`Constructor/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Constructor) |
| 41 | [07:01:45](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=25305s) | Overloaded constructors 🛠️ | ✅ [`OverloadConstructors/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/OverloadConstructors) |
| 42 | [07:08:22](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=25702s) | Array of objects 🗃️ | ✅ [`Array_Of_Objects/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Array_Of_Objects) |
| 43 | [07:14:07](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=26047s) | Static 🤝 | ✅ [`Static/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Static) |
| 44 | [07:22:04](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=26524s) | Inheritance 👨‍👧‍👦 | ✅ [`Inheritance/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Inheritance) |
| 45 | [07:31:09](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=27069s) | Super 🔝 | ✅ [`Super/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Super) |
| 46 | [07:41:37](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=27697s) | Method overriding ♻️ | ✅ [`Method_Overriding/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Method_Overriding) |
| 47 | [07:46:08](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=27968s) | toString method 🎉 | ✅ [`ToString/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/ToString) |
| 48 | [07:51:58](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=28318s) | Abstraction 🌫️ | ✅ [`Abstraction/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Abstraction) |
| 49 | [08:01:30](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=28890s) | Interfaces 📋 | ✅ [`Interface/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Interface) |
| 50 | [08:07:44](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=29264s) | Polymorphism 🎭 | ✅ [`Polymorphism/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Polymorphism) |
| 51 | [08:14:27](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=29667s) | Runtime polymorphism 🤷‍♂️ | ✅ [`RuntimePolymorphism/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/RuntimePolymorphism) |
| 52 | [08:19:35](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=29975s) | Getters and setters 🔐 | ✅ [`GettersAndSetters/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/GettersAndSetters) |
| 53 | [08:29:39](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=30579s) | Aggregation 🏫 | ✅ [`Aggregation/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Aggregation) |
| 54 | [08:39:02](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=31142s) | Composition ⚙️ | ✅ [`Composition/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/Composition) |
| 55 | [08:45:17](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=31517s) | Wrapper classes 🎁 | ✅ [`WrapperClasses/`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/tree/main/src/BroCodeJava/ObjectOriented/Oops/WrapperClasses) |

### 🚧 Coming Soon

| # | Time | Topic | Status |
|---|------|-------|--------|
| 56 | [08:55:51](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=32151s) | ArrayLists 📃 | ⏳ |
| 57 | [09:05:29](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=32729s) | Exception handling ⚠️ | ⏳ |
| 58 | [09:13:28](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=33208s) | Write files ✍ | ⏳ |
| 59 | [09:21:58](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=33718s) | Read files 📖 | ⏳ |
| 60 | [09:28:50](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=34130s) | ⭐ Music player 🎼 | ⏳ |
| 61 | [09:43:10](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=34990s) | ⭐ Hangman game 🕺 | ⏳ |
| 62 | [10:11:42](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=36702s) | Dates & times 📆 | ⏳ |
| 63 | [10:20:24](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=37224s) | Anonymous classes 🕵️‍♂️ | ⏳ |
| 64 | [10:25:23](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=37523s) | TimerTasks ⏲️ | ⏳ |
| 65 | [10:31:45](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=37905s) | ⭐ Countdown timer ⏳ | ⏳ |
| 66 | [10:38:16](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=38296s) | Generics 📦 | ⏳ |
| 67 | [10:52:09](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=39129s) | HashMaps 🗺️ | ⏳ |
| 68 | [11:02:38](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=39758s) | Enums 📅 | ⏳ |
| 69 | [11:12:45](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=40365s) | Threading 🧵 | ⏳ |
| 70 | [11:23:04](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=40984s) | Multithreading 🧶 | ⏳ |
| 71 | [11:31:02](https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=41462s) | ⭐ Alarm clock ⏰ | ⏳ |

---

<a id="how-to-run"></a>

## 🚀 How to Run This Repo

### 1️⃣ Prerequisites

You need **two things**: a JDK and an editor/IDE.

**☕ JDK 25 or newer** *(important!)*

Most files here use the short form `static void main(String[] args)` — no `public`, no `String[]` ceremony required — which is only valid from **Java 25** onward. On older JDKs (8, 11, 17, 21) you'll get *"Main method not found"* errors. This repo was written with **JDK 26** in IntelliJ.

Check what you have:

```bash
java -version
```

No JDK? Install one from any of: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) · [OpenJDK](https://jdk.java.net/) · [Adoptium Temurin](https://adoptium.net/)

**🖥️ An IDE** *(pick one)*

| IDE | Best for | Download |
|-----|----------|----------|
| **IntelliJ IDEA** ⭐ *(what I used)* | Zero-setup Java; run with one click | [jetbrains.com/idea](https://www.jetbrains.com/idea/download/) (Community is free) |
| **VS Code** | Lightweight; needs the Java extension | [code.visualstudio.com](https://code.visualstudio.com/) + [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) |
| **Eclipse** | Classic Java IDE | [eclipse.org](https://www.eclipse.org/downloads/) |
| **Terminal only** | No IDE at all | Just the JDK from above |

### 2️⃣ Clone the repo

```bash
git clone https://github.com/HBCoder31/Bro_Code_JAVA_12Hours.git
cd Bro_Code_JAVA_12Hours
```

### 3️⃣ Run it — pick your tool

<details open>
<summary><b>🟠 IntelliJ IDEA (recommended)</b></summary>

1. Open IntelliJ → **File → Open…** → select the cloned `Bro_Code_JAVA_12Hours` folder.
2. Go to **File → Project Structure → Project** and set the **SDK to JDK 25+** (the project already marks `src/` as the source root).
3. In the Project panel, open any file, e.g. `src/BroCodeJava/Projects/SlotMachine.java`.
4. Click the green ▶ next to `main`, or press **Shift + F10**.
5. Interactive programs read input from the **Run console** at the bottom — just click it and type.

</details>

<details>
<summary><b>🔵 VS Code</b></summary>

1. Install the **[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)**.
2. **File → Open Folder…** → select `Bro_Code_JAVA_12Hours`.
3. Make sure VS Code uses JDK 25+: open the Command Palette (`Ctrl/Cmd + Shift + P`) → **Java: Configure Java Runtime**.
4. Open any file in `src/` and click **Run** above `main` (or press `F5`).
5. For programs that ask for input, choose **Integrated Terminal** when prompted so you can type responses.

</details>

<details>
<summary><b>⚫ Terminal (any OS, no IDE)</b></summary>

Run from the repo root. Files are in packages, so use the fully-qualified class name:

```bash
# Compile everything into an `out/` folder
javac -d out $(find src -name "*.java")          # macOS / Linux / Git Bash

# Run any program
java -cp out BroCodeJava.Projects.SlotMachine
java -cp out BroCodeJava.Codes.StringMethods
java -cp out BroCodeJava.ObjectOriented.Oops.Inheritance.Inheritance
```

On **Windows PowerShell**, compile with:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java src).FullName
```

> Several OOP packages each have their own `Car`/`Animal`/`Dog` classes — that's intentional. Because they live in separate packages, compiling the whole tree works fine.

</details>

### 🧯 Troubleshooting

| Problem | Fix |
|---------|-----|
| `Error: Main method not found in class …` | Your JDK is older than 25. Install JDK 25+ and point your IDE to it. |
| `package … does not exist` / red underlines in IntelliJ | Mark `src` as **Sources Root** (right-click `src` → *Mark Directory as → Sources Root*). |
| Console input doesn't work in VS Code | Run in the **Integrated Terminal**, not the Debug Console. |
| `javac` is not recognized | Add the JDK's `bin/` folder to your `PATH`, then reopen the terminal. |

---

## 🎮 Try These First

If you want a quick tour, run these and play:

| Program | Why it's fun |
|---------|--------------|
| [`SlotMachine.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/SlotMachine.java) | Bets, symbols and payouts — combines loops, methods & randomness |
| [`BankingProgram.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/BankingProgram.java) | Menu-driven deposit / withdraw / balance app |
| [`RockPaperScissors.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/RockPaperScissors.java) | Play against the computer |
| [`NumberGuessingGame.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/NumberGuessingGame.java) | Higher / lower with attempt counting |
| [`JavaQuizGame.java`](https://github.com/HBCoder31/Bro_Code_JAVA_12Hours/blob/main/src/BroCodeJava/Projects/JavaQuizGame.java) | Multiple-choice quiz with scoring |

---

## 🧠 What I Learned So Far

- 🔹 Java syntax, types, operators and formatted output
- 🔹 Control flow: `if`, `switch` (enhanced), ternary, loops, `break`/`continue`
- 🔹 Methods, overloading, varargs and variable scope
- 🔹 Arrays (1D & 2D), searching, and handling user input with `Scanner`
- 🔹 The four pillars of OOP — **encapsulation, inheritance, polymorphism, abstraction** — plus aggregation vs composition
- 🔹 Building small console apps end-to-end

---

## 🙏 Credits

All lessons, structure and exercise ideas belong to **[Bro Code](https://www.youtube.com/@BroCodez)**.
👉 **[Java Full Course for free ☕ (12 hours)](https://youtu.be/xTtL8E4LzTQ)** — go watch it and give him a ❤️.

This repo is my personal, hand-typed practice of that course and is **not affiliated with Bro Code**.

---

<a id="author"></a>

## 👤 Author

<div align="center">

**Harsh Bohra** — B.Tech CSE (IT) @ SRM Institute of Science and Technology

[![GitHub](https://img.shields.io/badge/GitHub-HBCoder31-181717?style=for-the-badge&logo=github)](https://github.com/HBCoder31)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-HB31052006-0A66C2?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/HB31052006)

⭐ **If this helped you learn Java, drop a star — it keeps me motivated!** ⭐

</div>
