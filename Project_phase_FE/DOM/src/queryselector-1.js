// 1. store the element that says 'The King' in the 'king' variable.
//     console.log it.
var king = document.getElementById("b325");
console.log(king);
console.log("--------------");

// 2. store 'The Businessman' and 'The Lamplighter'
// in the 'businessLamp' variable.
//     console.log each of them.
var businessLamp = document.getElementsByClassName("big");
console.log(...businessLamp);
console.log("--------------");


// 3. store 'The King' and 'The Conceited Man'
// in the 'conceitedKing' variable.
//     alert them one by one.
var conceitedMan = document.getElementsByClassName("asteroid");
console.log(conceitedMan[0]);
console.log(conceitedMan[1]);
console.log("--------------");


// 4. store 'The King', 'The Conceited Man' and 'The Lamplighter'
// in the 'noBusiness' variable.
//     console.log each of them.
var noBusiness = document.getElementsByClassName("asteroid");
console.log(noBusiness[0]);
console.log(noBusiness[1]);
console.log(noBusiness[3]);