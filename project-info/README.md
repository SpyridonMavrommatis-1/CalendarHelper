> # 📅 CalendarHelper Demo

> #### 📌 Project Title
**CalendarHelper** – Convert date to "day of the year" and vice versa

---

> ####  📝 Description
This program allows users to:

- Convert a date (day/month/year) to the corresponding **day of the year** (e.g., Feb 15 → 46th day).
- Convert a **day number** of the year back into a full date.

It includes **input validation** and supports **leap years**.

---

> ####  🔧 Technologies Used
- Java 17
- Modular architecture
- IntelliJ IDEA (development and execution)

---

> ####  📂 Package Structure
- `Main.java` → Handles user input and controls program flow
- `DisplayHelper.java` → Responsible for all output messages to the user
- `DateConverter.java` → Core logic for converting between date formats
- `MathUtils.java` → Utility class for math-related helper functions
- `DateConstants.java` → Stores constants like month names and days in each month

---

> ####  ▶️ How It Works
1. User selects an option:
    - (1) Convert date to day of year
    - (2) Convert day of year to date

2. User provides the necessary input

3. Output is generated with clear formatting (e.g., ordinal suffixes like "st", "nd", "th")

---

> ####  ✅ Example Outputs
- **Input:** `6/9/2025` → **Output:** `6 September 2025 is the 249th day of the year.`
- **Input:** `60, 2024` → **Output:** `The 60th day of 2024 is 29/2/2024.`

---

> ####  💡 Possible Extensions
- 
- Date difference calculator (e.g., how many days between two dates)

---

> ####  🙋 Inspiration & Learning Goals
This project was built to:

- Practice **modular design** in Java
- Learn how to **manipulate dates programmatically**
- Understand **validation**, **loops**, and **method reuse**

 It is inspired by 
- **Leap Year Checker**
- **Day of Year Calculator**
- **Modular method design for date processing**


