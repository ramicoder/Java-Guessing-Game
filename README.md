# 🎯 3x3 Java Swing Guessing Game

A lightweight, interactive GUI application built with Java Swing for the **CSE201 - Object Oriented Programming** final project at the **University of Kurdistan Hewler**.

## 🎮 How to Play
The goal is to find the hidden "target square" within a 3x3 grid.

1. **Observe the Title Bar:** For testing and grading purposes, the current target square index is displayed in the window title.
2. **Hover to Explore:** Moving your mouse over any square will turn it **Blue**.
3. **Click to Guess:**
   - If you click the **wrong** square, it turns **Red** and a message shows how many tries you have left.
   - If you click the **correct** square, it turns **Green**, and a "Congrats" message appears.
4. **Win/Loss:** You have a maximum of **3 attempts**. The program will terminate automatically once you either find the square or run out of tries.

## 🛠️ Technical Features
* **Layout Management:** Uses `GridLayout(3, 3)` for a perfect square alignment.
* **Event Handling:** Implements `MouseAdapter` to handle `mouseEntered`, `mouseExited`, and `mousePressed` events in a single listener.
* **Randomization:** Uses `java.util.Random` to ensure a different target square is selected every time the game starts.
* **Cross-Platform Fixes:** Includes `setOpaque(true)` and `setContentAreaFilled` logic to ensure consistent color rendering across different operating systems.

## 📂 Project Structure
- `Game.java`: The single source file containing all logic, UI components, and event listeners.

## 📝 Academic Context
* **University:** University of Kurdistan Hewler 
* **Course:** CSE201 - Object Oriented Programming 
* **Instructor:** Dr. Alan Amin 
