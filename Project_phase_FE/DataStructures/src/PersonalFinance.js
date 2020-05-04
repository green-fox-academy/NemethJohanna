var list = [500, 1000, 1250, 175, 800, 120];

// How much did we spend?
var sum = list.reduce((a, b) => a + b, 0);
console.log(sum);

//     Which was our greatest expense?
var max = Math.max(...list);
console.log(max);

//     Which was our cheapest spending?
var min = Math.min(...list);
console.log(min);

//     What was the average amount of our spendings?
var average = sum / list.length;
console.log(average);