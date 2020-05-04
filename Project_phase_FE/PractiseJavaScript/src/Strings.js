// I would like to replace "dishwasher" with "galaxy" in this example. Please fix it for me!
// Expected output: In a galaxy far far away
let example = 'In a dishwasher far far away';
let replace = "dishwasher";
let correct = example.replace(replace, "galaxy");
console.log(correct);
console.log("-----------------");

// Create a function that can reverse a string, which is passed as the parameter
// Use it on this reversed string to check it!
let toBeReversed = `.eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI`;
let reversed = "";
function reverseString (toReverse){
    var reversed = "";
    for (let i = toBeReversed.length - 1; i >= 0; i--) {
        reversed += toBeReversed[i];
    }
    return reversed;
}
console.log(reverseString(toBeReversed));
console.log("-----------------");

// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!
let url = 'https//www.reddit.com/r/nevertellmethebots';
let sliced1 = url.slice(0, 4);
let sliced2 = url.slice(5);
var replace2 = sliced2.replace("odds", "bots");
console.log(sliced1 + ":" + replace2);
console.log("-----------------");

// While saving this quote, a disk error has occured. Please fix it.
// Add "always takes longer than" between the words "It" and "you"
let quote = `Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.`;
let addString = " always takes longer than";
let sliced3 = quote.slice(0, 20);
let sliced4 = quote.slice(20);
console.log(sliced3 + addString + sliced4);