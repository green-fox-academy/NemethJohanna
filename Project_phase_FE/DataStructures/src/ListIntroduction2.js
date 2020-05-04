var listA = ["Apple", "Avocado", "Blueberries", "Durian", "Lychee"];

// Create a new list ('List B') with the values of List A
var listB = listA;

// Print out whether List A contains Durian or not
var boolean = listA.map(function(item){
    return item === "Durian";
});
console.log(boolean);

// Remove Durian from List B
listB.indexOf("Durian");
listB.splice(3, 1);
console.log(...listB);

// Add Kiwifruit to List A after the 4th element
listA.splice(4, 0, "Kiwifruit");
console.log(...listA);

// Compare the size of List A and List B
if (listA.length > listB.length){
    console.log("List A is bigger");
} else if (listA.length === listB.length) {
    console.log("Same size");
} else {
    console.log("List B is bigger");
}
console.log(...listA);
console.log(...listB);

// Get the index of Avocado from List A
console.log(listA.indexOf("Avocado"));

// Get the index of Durian from List B
console.log(listB.indexOf("Durian"));

// Add Passion Fruit and Pomelo to List B in a single statement
listB.push("Pomelo", "PassionFruit");
console.log(...listB);
console.log(...listA);

// Print out the 3rd element from List A
