// if a is even increment out by one
let a = 24;
let out = 0;
if (a % 2 == 0){
    out++;
}
console.log("OUT: " + out);

// if b is between 10 and 20 set out2 to "Sweet!"
// if less than 10 set out2 to "Less!",
// if more than 20 set out2 to "More!"
let b = 13;
let out2 = '';
if (b < 20 && b > 10){
    out2 = "Sweet";
} else if (b < 10){
    out2 = "Less!";
} else {
    out2 = "More!";
}
console.log(out2);

// if credits are at least 50,
// and is_bonus is false decrement c by 2
// if credits are smaller than 50,
// and is_bonus is false decrement c by 1
// if is_bonus is true c should remain the same
let c = 123;
let credits = 100;
let isBonus = false;
if (credits > 50 && isBonus === false){
    c -= 2;
} else if (credits < 50 && isBonus === false){
    c--;
}
console.log(c);

// if d is dividable by 4
// and time is not more than 200
// set out3 to "check"
// if time is more than 200
// set out3 to "Time out"
// otherwise set out3 to "Run Forest Run!"
let d =  8;
let time = 120;
let out3 = '';
console.log(out3);