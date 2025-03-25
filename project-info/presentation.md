---
marp: true
theme: uncover
paginate: true
style: |
  section {
    background-color: #f0f0f0;
  }

  h1 {
    background-color: #388e3c;  
    padding: 10px 20px;
    border-radius: 17px; 
    font-weight: bold;
    color: white;  
    font-size: 3.0em;
    text-align: center;
    display: inline-block;
    
  }
  h2 {
    color: #2e7d32;
    text-align: center;
    font-size: 2.0em;
    font-weight: bold;
  }
  footer {
    color: #888;
    font-size: 0.8em;
    text-align: center;
    margin-top: 2em;
  }
---

# 📅 CalendarHelper

##### Java Demo Project – Date Conversion Utility

<br>
<br>
<br>
Presented by [Spyridon Mavrommatis] • 2025

---

## 🎯 Project Goals

<br>
<br>

- **Convert dates to day-of-year** (e.g., 30, 6, 2045 → 181st of the year)
  <br>
- **Convert day-of-year back to full date** (e.g., 69, 2000 → 2/9/2000)

---

## 🖥️ Example 1 Output

![width:1000px](./image2.png)

---

## 🖥️ Example 2 Output

![width:1000px](./image.png)

---

## 🧱 Project Structure

###### The code is organized in a **modular way** using multiple Java classes:

- **`Main.java`** → _The Orchestrator_
- **`DisplayHelper.java`** → _The Director_
- **`DateConverter.java`** → _The Parser_
- **`MathUtils.java`** → _The Worker_
- **`DateConstants.java`** → _The Reference Library_  
  <br>
  See: `calendar_modules_architecture.png`

---

---
