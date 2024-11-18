# Java Exercises

This repository contains practical Java exercises designed to explore fundamental concepts such as processes, threads, and command execution in the operating system.

## Project structure

1. **ProcessRuntimes.java** 
- Shows how to run operating system processes from Java using `Runtime.exec`.
- Basic example that opens notepad on Windows systems.

2. **Threads**
- Contains specific exercises on thread management in Java, covering topics such as synchronization, thread pools, and inter-thread communication.

3. **Other topics**. 
- More directories and exercises related to other aspects of Java programming will be added.

---

### Documentation for each file and folder

#### `ProcessRuntimes.java`

This file demonstrates how to interact with external processes from Java. The code executes the `NOTEPAD` command on Windows systems, opening notepad. Runtime.getRuntime()` is used to get the execution environment and manage the process.

#### `threads/` folder.

Includes exercises related to concurrent programming. Here is a possible breakdown (if the exercises are not there yet, this could be your development plan):

- **BasicThreadExample.java**: Introduction to creating threads with the `Thread` class.
- RunnableExample.java**: Using the `Runnable` interface for concurrent tasks.
- **ThreadPoolExample.java**: Implementation of a thread pool using `ExecutorService`.

---
