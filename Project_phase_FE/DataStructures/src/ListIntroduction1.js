var names = [];

// Print out the number of elements in the list
console.log(names.length);

// Add William to the list
names.push("William");
console.log(...names);

// Print out whether the list is empty or not
if (names.length < 1){
    console.log("The names list is empty");
} else {
    console.log("The names list size is: " + names.length);
}

// Add John to the list
names.push("John");

// Add Amanda to the list
names.push("Amanda");

// Print out the number of elements in the list
console.log(names.length);

// Print out the 3rd element
console.log(names[2]);

// Iterate through the list and print out each name
for(var i = 0; i < names.length; i++){
    console.log(names[i]);
}

// Iterate through the list and print
for(var i = 0; i < names.length; i++){
    console.log((i + 1) + ". " + names[i]);
}

// Remove the 2nd element
function remove(elementNumber){
    var removeName = names.indexOf(elementNumber);
    return removeName;
}
remove(2);
names.pop();

// Iterate through the list in a reversed order and print out each name
for(var i = names.length - 1; i >= 0; i--){
    console.log(names[i]);
}

// Remove all elements
names.length = 0;
console.log(names);


