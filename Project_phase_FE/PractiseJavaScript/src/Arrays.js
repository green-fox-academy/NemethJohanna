// -  Create a variable named `numbers` with the following content: `[1, 3, 5, 7]`
// -  Print the third element of `numbers`

let nums = [1, 3, 5, 7];
console.log(nums[2]);
console.log("-----------------");

// - Create a variable named `firstList` with the following content: `[1, 2, 3]`
// - Create a variable named `secondList` with the following content: `[4, 5]`
// - Log "p2 is longer" to the console if `secondList` has more elements than
//   `firstList`

let firstLIst = [1, 2, 3];
let secondList = [4, 5];
if (secondList.length > firstLIst.length) {
    console.log("p2 is longer");
} else {
    console.log("p1 is longer");
}
console.log("-----------------");

// - Create a variable named `numbers` with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element
let numbers = [55, 23, 66, 12];
console.log(numbers[1] + numbers[2]);
console.log("-----------------");

// -  Create a variable named `names` with the following content: `["Arthur", "Boe", "Chloe"]`
// -  Swap the first and the third element of `names`
let names = ["Arthur", "Boe", "Chloe"];
let temp = names[0];
names[0] = names[2];
names[2] = temp;
console.log(names);
console.log("-----------------");

// -  Create a variable named `numbers` with the following content: `[4, 5, 6, 7]`
// -  Log each the element of `numbers` to the console*
// *hint: use a loop, console.log(numbers) won't cut it
// -  bonus for using the correct built in array method

let numbers3 = [4, 5, 6, 7];
numbers3.forEach(function (item) {
    console.log(item);
});
console.log("-----------------");

// -  Create an array named `numbers` with the following content: `[1, 2, 3, 8, 5, 6]`
// -  Change the 8 to 4 with the `.map` method
// -  Print the fourth element as a test

let numbers4 = [1, 2, 3, 8, 5, 6];
let newArray = numbers4.map(function (item) {
    if (item === 8) {
        return 4;
    }
});
console.log(newArray[3]);
console.log("-----------------");

// -  Create a variable named `numbers` with the following content: `[1, 2, 3, 4, 5]`
// -  Increment the third element simply by accessing it
// -  Log the third element to the console
let numbers5 = [1, 2, 3, 4, 5];
console.log(numbers5[2] += 1);
console.log("-----------------");

// -  Create an array variable named `animals` with the following content: `["koal", "pand", "zebr"]`
// -  Add all elements an `"a"` at the end
let animals = ["koal", "pand", "zebr"];
let newArr = animals.map(function (item) {
    return item + "a";
})
console.log(newArr);
console.log("-----------------");

// - Create an array variable named `drinks` with the following content: `['Gin', 'Whiskey', 'Wine', 'Beer']`
// - Double all the strings in the array, use a built in array method instead of a loop
// - It should print: ['GinGin', 'WhiskeyWhiskey', 'WineWine', 'BeerBeer']`
let drinks = ['Gin', 'Whiskey', 'Wine', 'Beer'];
let newDrinks = drinks.map(function (item) {
    return item + item;
})
console.log(newDrinks);
console.log("-----------------");

// -  Create a two dimensional list which can contain the different shades of specified colors
// -  In `colors[0]` store the shades of green: `"lime", "forest green", "olive", "pale green", "spring green"`
// -  In `colors[1]` store the shades of red: `"orange red", "red", "tomato"`
// -  In `colors[2]` store the shades of pink: `" orchid", "violet", "pink", "hot pink"`
let colors = [
    ["lime", "forest green", "olive", "pale green", "spring green"],
    ["orange red", "red", "tomato"],
    ["orchid", "violet", "pink", "hot pink"]
]
console.log(colors[0]);
console.log(colors[1]);
console.log(colors[2]);
console.log("-----------------");

// -  Create a variable named `numbers` with the following content:
//   `[3, 4, 5, 6, 7]`
// -  Log the sum of the elements in `numbers` to the console

let numbers6 = [3, 4, 5, 6, 7];
console.log(numbers6.reduce((a, b) => a + b, 0));
console.log("-----------------");

// -  Create (dynamically*) a two dimensional list
//    with the following matrix**. Use a loop!
//
//    0 0 0 1
//    0 0 1 0
//    0 1 0 0
//    1 0 0 0
//
// -  Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array
// let size = 4;
// for (i in size) {
//     for (j in size) {
//         if (i === j) {
//             console.log("1");
//         } else {
//             console.log("0");
//         }
//     }
// }
console.log("-----------------");


// -  Create a variable named `numbers` with the following content: `[3, 4, 5, 6, 7]`
// -  Reverse the order of the elements in `numbers`
// 	   -  do it with the built in method
//	   -  do it with creating a new temp array and a loop
// -  Print the elements of the reversed `numbers`
let numbers7 = [3, 4, 5, 6, 7];
let reverse = numbers7.reverse();
console.log(reverse);