var map = new Map();

map.set("978-1-60309-452-8", "A Letter to Jo");
map.set("978-1-60309-459-7", "Lupus");
map.set("978-1-60309-444-3", "Red Panda and Moon Bear");
map.set("978-1-60309-461-0", "The Lab");

//Print all the key-value pairs in the following format
console.log(...map.keys());
// for(var i = 0; i < map.size; i++){
//     console.log(i.keys)
// }

//Remove the key-value pair with key 978-1-60309-444-3
map.delete("978-1-60309-444-3");

//Remove the key-value pair with value The Lab

//Add the following key-value pairs to the map
map.set("978-1-60309-450-4", "They Called Us Enemy");
map.set("978-1-60309-453-5", "Why Did We Trust Him?");

//Print whether there is an associated value with key 478-0-61159-424-8 or not
console.log(map.has("478-0-61159-424-8"));

//Print the value associated with key 978-1-60309-453-5
console.log(map.get("978-1-60309-453-5"));
