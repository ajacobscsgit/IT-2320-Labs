Modify the main() method only. You do not need to modify match() or isMatched() in any way. The code is directly from the book in section 22.11, LiveExample 22.14.

Do not modify the value of text.

Note: Big O notation does not directly involve timers or any form of timing in your code. Big O notation is a mathematical notation used in algorithmic complexity theory to describe the performance or complexity of an algorithm. The lab exercise this week is a fun exercise to see how input affects the time complexity of our algorithm in practice.

Instructions:

Assign a value to bestCase to represent a best-case scenario with the given value of text. Note: this is not the true worst-case scenario because we could have much longer values for text, but it could represent a case scenario for an application if this always the value of text.
Assign a value to worstCase to represent a worst-case scenario with the given value of text.
Use the example in section 22.3: Example: Determining Big O, LiveExample 22.1. Initialize a startTime before calling match() for both scenarios.
Initialize an endTime right after match() is called for both. 
Then, calculate and output elapsedTime for both scenarios by subtracting (endTime - startTime) for each.