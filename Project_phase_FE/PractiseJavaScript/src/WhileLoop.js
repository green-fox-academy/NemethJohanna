let sentence = "I Won't cheat on the exam!\n";
let nr = 1;

while (nr <= 100){
    console.log(sentence);
    console.log(nr);
    nr ++;
}

// Create a program that prints all the even numbers between 0 and 500
//
// let nr1 = 0;
// while (nr1 <= 500){
//     console.log(nr1);
//     nr1 += 2;
// }

// Create a program that
// prints the multiplication table with number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150

let number = 15;

for (let i = 1; i <= 10; i++) {
    console.log(i + " * " + number + " = " + i * number);
}


// Write a program that calculates the sum and the average from 1 to a given number.
// Example input: 5
// Example output: Sum: 15, Average: 3
// let response = readline();
// console.log("Sum: " + 1 + response);
// console.log("Average: " + (1 + response) / 2);

// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

for (let i = 1; i < 101; i++) {
    if (i % 3 === 0 && i % 5 === 0){
       console.log("FizzBuzz");
    } else if (i % 3 === 0){
        console.log("Fizz");
    } else if (i % 5 === 0){
        console.log("Buzz");
    } else {
        console.log(i);
    }
}

// Write a program that draws a triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as lineCount is

let lines = 4;
for (let i = 0; i < lines; i++) {
    for (let j = 0; j < i; j++) {
        console.log("*");
    }
}