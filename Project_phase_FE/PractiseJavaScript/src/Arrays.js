// -  Create a variable named `numbers`
//    with the following content: `[1, 3, 5, 7]`
// -  Print the third element of `numbers`

let nums = [1, 3, 5, 7];
console.log(nums[2]);

console.log("-----------------");

// - Create a variable named `firstList`
//   with the following content: `[1, 2, 3]`
// - Create a variable named `secondList`
//   with the following content: `[4, 5]`
// - Log "p2 is longer" to the console if `secondList` has more elements than
//   `firstList`

let firstLIst = [1, 2, 3];
let secondList = [4, 5];
if (secondList.length > firstLIst.length){
    console.log("p2 is longer");
} else {
    console.log("p1 is longer");
}

console.log("-----------------");

// - Create a variable named `numbers`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element
let numbers = [55, 23, 66, 12];
console.log(numbers[1] + numbers[2]);

console.log("-----------------");

// -  Create a variable named `names` with the following content:
//   `["Arthur", "Boe", "Chloe"]`
// -  Swap the first and the third element of `names`

let names = ["Arthur", "Boe", "Chloe"];
names[0] = names[2];
names[2] = names[0];
console.log(names);
