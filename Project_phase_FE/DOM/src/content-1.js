// 1)  Fill every paragraph with the last one's content.(innerHTML)
let apple = document.getElementsByClassName("apple")[0];
let balloon = document.getElementsByClassName("balloon")[0];
let cat = document.getElementsByClassName("cat")[0];
let animal = document.getElementsByClassName("animals")[0];

let getContent = animal.innerHTML; //goat rabbit <strong>cat</strong> dog

apple.innerHTML = getContent;
balloon.innerHTML = getContent;
cat.innerHTML = getContent;

// 2)  Do the same again, but you should keep the cat strong.

